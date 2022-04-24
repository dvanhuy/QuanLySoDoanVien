/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package getconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pc
 */
public class ConnectSQL {
    public static Connection getConnectSQL(){
        String url = "jdbc:sqlserver://LAPTOP-ATNHOQI8\\MSSQLSERVER01:1433;databaseName=QuanLySoDoan";//DESKTOP-T6COLHJ
        String user = "sa";
        String password = "12345";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(url,user,password);
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Kết nối lỗi");
            System.out.println(e);
        }
        return null;
    }
    public static void main(String[] args) {
        getConnectSQL();
    }
}
