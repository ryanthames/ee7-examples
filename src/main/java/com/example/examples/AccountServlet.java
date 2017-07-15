package com.example.examples;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns="/account",
  initParams={
    @WebInitParam(name="type", value="checking")
  })
public class AccountServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try(PrintWriter out = resp.getWriter()) {
      out.println("<html><head><title>MyServlet</title></head></html>");
    }

    String txValue = req.getParameter("tx");
  }
}
