package com.codegym.login01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name="login",value="/login" )
public class Login extends HttpServlet {
    public void init() {
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(username.equals(username) && password.equals(password)){
            out.println("Welcome" + " " + username + " " + "to website");
        } else {
            out.println("<h1>Login Error</h1>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(username.equals(username) && password.equals(password)){
            out.println("Welcome" + " " + username + " " + "to website");
        } else {
            out.println("<h1>Login Error</h1>");
        }
    }
    public void destroy() {
    }
}
