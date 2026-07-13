package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class VulnerableCode {

    public static void main(String[] args) throws Exception {

        String userInput = args[0];

        Connection conn = DriverManager.getConnection(
                "jdbc:h2:mem:testdb");

        Statement stmt = conn.createStatement();

        String query =
                "SELECT * FROM users WHERE username = '"
                        + userInput + "'";

        stmt.execute(query);

        conn.close();
    }
}
