package com.oskarbay.http.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var paramValue = req.getParameter("param");
        var parameterMap = req.getParameterMap();
        System.out.println();

        req.getHeader("user-agent");
        resp.setContentType("text/html; charset=UTF-8");
        resp.setHeader("token","123456");
        try (var writer = resp.getWriter()) {
            writer.write("<h2>Hello from First Servlet</h2>");
        }
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
