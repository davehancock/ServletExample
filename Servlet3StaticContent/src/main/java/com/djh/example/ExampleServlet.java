package com.djh.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "exampleServlet", urlPatterns = {"/example"},
        initParams = {@WebInitParam(name = "simpleParam", value = "paramValue")})
public class ExampleServlet extends HttpServlet {

    public static final String FOO = "foobar";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println(FOO);
    }

}
