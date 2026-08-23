import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        double num1 = Double.parseDouble(
                request.getParameter("num1"));

        double num2 = Double.parseDouble(
                request.getParameter("num2"));

        String operation =
                request.getParameter("operation");

        double result;

        switch (operation) {

            case "add":

                result = num1 + num2;

                out.println(
                        "<h2>Addition Result: "
                        + result +
                        "</h2>"
                );

                break;

            case "sub":

                result = num1 - num2;

                out.println(
                        "<h2>Subtraction Result: "
                        + result +
                        "</h2>"
                );

                break;

            case "mul":

                result = num1 * num2;

                out.println(
                        "<h2>Multiplication Result: "
                        + result +
                        "</h2>"
                );

                break;

            case "div":

                if (num2 == 0) {

                    out.println(
                            "<h2>Cannot divide by zero!</h2>"
                    );

                    return;
                }

                result = num1 / num2;

                out.println(
                        "<h2>Division Result: "
                        + result +
                        "</h2>"
                );

                break;

            default:

                out.println(
                        "<h2>Invalid Operation</h2>"
                );
        }
    }
}
