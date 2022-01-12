package com.oskarbay.http.servlet;

import com.oskarbay.http.service.FlightService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

@WebServlet("/flight")
public class FlightServlet extends HttpServlet {

    private final FlightService flightService = FlightService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());

        try (var printWriter = resp.getWriter()) {
            printWriter.write("<h1>List flights</h1>");
            printWriter.write("<ul>");
            flightService.findAll().forEach(flightDto ->{
                printWriter.write(
                        """
                                <li>
                                <a href="/tickets?flightId=%d">%s</a>
                                </li>
                                """.formatted(flightDto.getId(),flightDto.getDescription())
                );
            });
            printWriter.write("</ul>");
        }
    }
}
