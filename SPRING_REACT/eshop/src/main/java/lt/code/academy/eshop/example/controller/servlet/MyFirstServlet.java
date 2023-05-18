package lt.code.academy.eshop.example.controller.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/firstServlet")
public class MyFirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("""
          <html>
          	<head></head>
          	<body>
          		<div><b>Name: </b>Vilda</div>
          		<div><b>Surname: </b>Beizaraite</div>
          	</body>
          </html>
							   """);
    }
}