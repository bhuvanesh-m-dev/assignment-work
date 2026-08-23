import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {

    private static final String URL =
            "jdbc:mysql://localhost:3306/student_db";

    private static final String USER = "root";
    private static final String PASSWORD = "password";

    private Connection getConnection() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
        );
    }

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        try (Connection connection = getConnection()) {

            int rollno = Integer.parseInt(
                    request.getParameter("rollno"));

            String name =
                    request.getParameter("name");

            String department =
                    request.getParameter("department");

            String email =
                    request.getParameter("email");

            String phone =
                    request.getParameter("phone");

            PreparedStatement ps =
                    connection.prepareStatement(
                            "INSERT INTO student " +
                            "(rollno, name, department, email, phone) " +
                            "VALUES (?, ?, ?, ?, ?)"
                    );

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, department);
            ps.setString(4, email);
            ps.setString(5, phone);

            ps.executeUpdate();

            out.println(
                    "<h1>Registration Successful!</h1>"
            );

            out.println(
                    "<p>Student details saved successfully.</p>"
            );

        } catch (Exception e) {

            out.println("<h2>Error</h2>");
            out.println("<p>" + e.getMessage() + "</p>");
        }
    }

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        try (Connection connection = getConnection()) {

            Statement statement =
                    connection.createStatement();

            ResultSet rs =
                    statement.executeQuery(
                            "SELECT * FROM student"
                    );

            out.println(
                    "<h1>Registered Students</h1>"
            );

            out.println(
                    "<table border='1' cellpadding='10'>"
            );

            out.println(
                    "<tr>" +
                    "<th>Roll No</th>" +
                    "<th>Name</th>" +
                    "<th>Department</th>" +
                    "<th>Email</th>" +
                    "<th>Phone</th>" +
                    "</tr>"
            );

            while (rs.next()) {

                out.println("<tr>");

                out.println(
                        "<td>" +
                        rs.getInt("rollno") +
                        "</td>"
                );

                out.println(
                        "<td>" +
                        rs.getString("name") +
                        "</td>"
                );

                out.println(
                        "<td>" +
                        rs.getString("department") +
                        "</td>"
                );

                out.println(
                        "<td>" +
                        rs.getString("email") +
                        "</td>"
                );

                out.println(
                        "<td>" +
                        rs.getString("phone") +
                        "</td>"
                );

                out.println("</tr>");
            }

            out.println("</table>");

        } catch (Exception e) {

            out.println("<h2>Error</h2>");
            out.println("<p>" + e.getMessage() + "</p>");
        }
    }
}
