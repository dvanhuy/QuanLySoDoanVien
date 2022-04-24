/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import define.Account;
import define.User;
import getconnect.ConnectSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class QuanLyTaiKhoan {
    public Account checkUser(String username,String password)
    {
        Account account= new Account();
        Connection connection = ConnectSQL.getConnectSQL();
        
        String sql = "SELECT * FROM TaiKhoan "
                + "WHERE username=? and pass=?";
        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            
            rs.next();      
            account.setIdSring(rs.getString(1));// tên cột
            account.setHoTen(rs.getString(2));
            account.setTenTK(rs.getString(3));
            account.setPass(rs.getString(4));
            account.setRole(rs.getString(5));
            
            return account;
        } catch(SQLException e){
//            System.out.println("Sai tài khoản mật khẩu");
            return null;
        }
    }
}
