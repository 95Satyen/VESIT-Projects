/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleconnection;

import java.sql.*;

/**
 *
 * @author Inspiron
 */
public class OracleConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Connection conn =null;
    //input
    try{
        String driverName = "oracle.jdbc.driver.OracleDriver";
        Class.forName(driverName);
    String serverName="Dell";
    String serverPort="1521";
    String sid="XE";
    String url="jdbc:oracle:thin:@"+ serverName + ":"+ serverPort + ":" +sid;
    String username="payroll";
    String password="payroll";
    conn = DriverManager.getConnection(url,username,password);
    System.out.println("Successfully Connected to the database");
    
    }
    catch(ClassNotFoundException e)
    {
        System.out.println("Could not find database driver"+e.getMessage());
     }
    catch(SQLException e)
    {        System.out.println("Could not find database driver"+e.getMessage());
    }
    //output
    try{
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("select * from salary");
    while(rs.next())
    {int no= rs.getInt(1);
     String name = rs.getString(2).toString();
     int no3=rs.getInt(3);
     int no4 = rs.getInt(4);
     System.out.println(""+no+" "+name+" "+no3+" "+no4);
    
    }
    rs.close();
    }
    catch(Exception e)
    {e.printStackTrace();
     }
    
    
    }
    
}
