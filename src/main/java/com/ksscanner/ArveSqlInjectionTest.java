package com.ksscanner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ArveSqlInjectionTest {

    public ResultSet findUser(Connection connection, String username) throws Exception {
        Statement statement = connection.createStatement();

        // INTENTIONAL ARVE TEST: SQL Injection (CWE-89)
        String query =
                "SELECT * FROM users WHERE username = '" + username + "'";

        return statement.executeQuery(query);
    }
}