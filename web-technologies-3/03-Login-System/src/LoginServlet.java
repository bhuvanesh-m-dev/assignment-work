import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    private static final String VALID_USERNAME =
            "admin";

    private static final String VALID_PASSWORD =
            "12345";

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String username =
                request.getParameter("username");

        String password =
                request.getParameter("password");

        if (VALID_USERNAME.equals(username)
                && VALID_PASSWORD.equals(password)) {

            out.println(
                    "<h1>Login Successful!</h1>"
            );

            out.println(
                    "<p>Welcome, "
                    + username +
                    "!</p>"
            );

        } else {

            out.println(
                    "<h1>Login Failed!</h1>"
            );

            out.println(
                    "<p>Invalid username or password.</p>"
            );
        }
    }
}
