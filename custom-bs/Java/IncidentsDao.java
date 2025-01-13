package com.example.etl.oracledb.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class IncidentsDao {
    public static final String BAR = "/";
    public static final String SECRET= "sK9mQ4dA7Fz6N2pX3LyT0WbV8Jr5cNkLZ7XyqT6mP4W9d3oR";     //Secret
    public static final String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzZXJ2aWNlIjoiSW5jaWRlbnRzRGFvIiwidXNlciI6ImpvaG5kb2UiLCJyb2xlcyI6WyJhZG1pbiIsIm1hbmFnZXIiXSwiaWF0IjoxNjg1OTI0MDAwLCJleHAiOjE2ODYwMTA0MDB9.c3JNkxI6pUbh2MNkIsuBl5g6nEKuNOgh9KbsjDquPTs";
    public static final String SEPARATOR= ";";
    public static final String SERVER= "https://api.example.com";


    final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
    final String authUser = "test_user";
    final String authPassword = "TestPassword123!";    //Password

    public Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, authUser, authPassword);
    }

    public void fetchIncidents() {
        System.out.println("Fetching incidents...");
    }
}
