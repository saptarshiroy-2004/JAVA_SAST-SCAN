package com.ksscanner;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ArveXssTest {

    public void render(HttpServletRequest request,
                       HttpServletResponse response) throws IOException {

        // INTENTIONAL ARVE TEST: XSS (CWE-79)
        String input = request.getParameter("input");

        PrintWriter writer = response.getWriter();
        writer.write(input);
    }
}