package com.oskarbay.http.servlet;

import com.oskarbay.http.service.TicketService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/tickets")
public class TicketServlet extends HttpServlet {

    private final TicketService ticketService = TicketService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var flightId = Long.valueOf(req.getParameter("flightId"));

        resp.setContentType("text/html");
        try (var printWriter = resp.getWriter()) {
            printWriter.write("<h1>PURCHASED TICKETS: </h1>");
            printWriter.write("<ul>");
            ticketService.findAllByFlightId(flightId).forEach(ticketDto -> printWriter.write("""
                    <li>
                      %s 
                    </li>
                    """.formatted(ticketDto.getSeatNo())));
            printWriter.write("</ul>");
        }
    }
}
