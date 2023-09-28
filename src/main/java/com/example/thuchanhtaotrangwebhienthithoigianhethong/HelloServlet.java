package com.example.thuchanhtaotrangwebhienthithoigianhethong;

import java.io.*;
import java.util.Date;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ServerTimeServlet", value = "/index")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("");
        Date today = new Date();
        out.println("<h1>" + today + "</h1>");
        out.println("");
    }
}