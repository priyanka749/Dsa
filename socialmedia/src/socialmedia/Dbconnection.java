/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socialmedia;

/**
 *
 * @author Lenovo
 */

import java.sql.Connection;
import java.sql.DriverManager;


public class Dbconnection {
    public static Connection dbconnect()
    { 
        try
        {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/socialMedia","root","nepal123");
            System.out.println("connected");
            return conn;
        }
        catch(Exception e)
        {
            System.out.println("error");
            return null;
        }

    }
    public static void main(String[] args) {
        dbconnect();
        System.out.println("run");

    }
}
