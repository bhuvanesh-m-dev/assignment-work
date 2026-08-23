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

public class EmployeeServlet extends HttpServlet {

    private static final String URL =
            "jdbc:mysql://localhost:3306/employee_db";

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

        String action = request.getParameter("action");

        try (Connection connection = getConnection()) {

            if ("add".equals(action)) {

                int id = Integer.parseInt(
                        request.getParameter("id"));

                String name =
                        request.getParameter("name");

                String department =
                        request.getParameter("department");

                double salary = Double.parseDouble(
                        request.getParameter("salary"));

                PreparedStatement ps =
                        connection.prepareStatement(
                                "INSERT INTO employee " +
                                "(id, name, department, salary) " +
                                "VALUES (?, ?, ?, ?)"
                        );

                ps.setInt(1, id);
                ps.setString(2, name);
                ps.setString(3, department);
                ps.setDouble(4, salary);

                ps.executeUpdate();

                out.println(
                        "<h2>Employee Added Successfully!</h2>"
                );

            } else if ("update".equals(action)) {

                int id = Integer.parseInt(
                        request.getParameter("id"));

                String name =
                        request.getParameter("name");

                String department =
                        request.getParameter("department");

                double salary = Double.parseDouble(
                        request.getParameter("salary"));

                PreparedStatement ps =
                        connection.prepareStatement(
                                "UPDATE employee " +
                                "SET name=?, department=?, salary=? " +
                                "WHERE id=?"
                        );

                ps.setString(1, name);
                ps.setString(2, department);
                ps.setDouble(3, salary);
                ps.setInt(4, id);

                int result = ps.executeUpdate();

                if (result > 0) {
                    out.println(
                            "<h2>Employee Updated Successfully!</h2>"
                    );
                } else {
                    out.println(
                            "<h2>Employee Not Found!</h2>"
                    );
                }

            } else if ("delete".equals(action)) {

                int id = Integer.parseInt(
                        request.getParameter("id"));

                PreparedStatement ps =
                        connection.prepareStatement(
                                "DELETE FROM employee WHERE id=?"
                        );

                ps.setInt(1, id);

                int result = ps.executeUpdate();

                if (result > 0) {
                    out.println(
                            "<h2>Employee Deleted Successfully!</h2>"
                    );
                } else {
                    out.println(
                            "<h2>Employee Not Found!</h2>"
                    );
                }

            } else if ("display".equals(action)) {

                displayEmployees(connection, out);
            }

        } catch (Exception e) {

            out.println("<h2>Error</h2>");
            out.println("<p>" + e.getMessage() + "</p>");
        }
    }

    private void displayEmployees(
            Connection connection,
            PrintWriter out)
            throws Exception {

        Statement statement =
                connection.createStatement();

        ResultSet rs =
                statement.executeQuery(
                        "SELECT * FROM employee"
                );

        out.println("<h1>Employee Records</h1>");

        out.println("<table border='1' cellpadding='10'>");

        out.println(
                "<tr>" +
                "<th>ID</th>" +
                "<th>Name</th>" +
                "<th>Department</th>" +
                "<th>Salary</th>" +
                "</tr>"
        );

        while (rs.next()) {

            out.println("<tr>");

            out.println(
                    "<td>" +
                    rs.getInt("id") +
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
                    rs.getDouble("salary") +
                    "</td>"
            );

            out.println("</tr>");
        }

        out.println("</table>");
    }
}
