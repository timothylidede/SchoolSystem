/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lidede.fuzu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author timot
 */
public class MyConnection {
    private static String dbhost = "jdbc:mysql://localhost:3306/136362_miniproject";
    private static String dbusername = "root";
    private static String dbpassword = "";
    
    private static Connection conn;
    
    @SuppressWarnings("finally")
    public static Connection createNewDBConnection(){
        try  {	
            conn = DriverManager.getConnection(dbhost, dbusername, dbpassword);	
        } catch (SQLException e) {
            System.out.println("Cannot create database connection");
            e.printStackTrace();
        } finally {
            return conn;	
        }		
    }
    
}
