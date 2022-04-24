/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import getconnect.ConnectSQL;
import define.User;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class SoDoanServices {
    public List<User> getAllUser(){
        List<User> users = new ArrayList<>();
        Connection con = ConnectSQL.getConnectSQL();
        String sql = "Select * from DoanVien"   ;
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next())
            {
                User newUser = new User();
                
                newUser.setIdDoanVien(rs.getString("idDoanVien"));
                newUser.setTenDoanVien(rs.getString("tenDoanVien"));
                newUser.setMaSinhVien(rs.getString("maSinhVien"));
                newUser.setDoB(rs.getString("dob"));
                newUser.setQueQuan(rs.getString("queQuan"));
                newUser.setTenLop(rs.getString("tenLop"));
                newUser.setTenKhoa(rs.getString("tenKhoa"));
                newUser.setTienCanNop(rs.getDouble("tienCanNop"));
                newUser.setTienDaNop(rs.getDouble("tienDaNop"));
                newUser.setTinhTrangSoDoan(rs.getString("tinhTrangSoDoan"));
                
                users.add(newUser);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi tại getALlUser");
        }
    return users;
    }
    public List<User> getAllUser_tinhTrang(String tinhTrang){
        List<User> users = new ArrayList<>();
        Connection con = ConnectSQL.getConnectSQL();
        String sql = "";
        if(tinhTrang.equals("DANOP"))
        {
            sql = "Select * from DoanVien where tinhTrangSoDoan = N'Đã nộp'";
        }
        else
        {
            sql = "Select * from DoanVien where tinhTrangSoDoan = N'Chưa nộp'";
        }
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                User newUser = new User();
                
                newUser.setIdDoanVien(rs.getString("idDoanVien"));
                newUser.setTenDoanVien(rs.getString("tenDoanVien"));
                newUser.setMaSinhVien(rs.getString("maSinhVien"));
                newUser.setDoB(rs.getString("dob"));
                newUser.setQueQuan(rs.getString("queQuan"));
                newUser.setTenLop(rs.getString("tenLop"));
                newUser.setTenKhoa(rs.getString("tenKhoa"));
                newUser.setTienCanNop(rs.getDouble("tienCanNop"));
                newUser.setTienDaNop(rs.getDouble("tienDaNop"));
                newUser.setTinhTrangSoDoan(rs.getString("tinhTrangSoDoan"));
                
                users.add(newUser);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi tại getALlUser_tinhTrangSoDoan");
        }
    return users;
    }
    
    public List<User> searchUser(String tim)
    {
        List<User> listUser = new ArrayList<>();
       Connection con = ConnectSQL.getConnectSQL();
       String sql="Select * from DoanVien where (maSinhVien like '%" + tim + "%') "
               + "or (tenDoanVien like N'%" + tim + "%')";

       try {
           PreparedStatement preparedStatement = con.prepareStatement(sql);
           ResultSet rs = preparedStatement.executeQuery();
           while(rs.next())
           {
                User newUser = new User();
                
                newUser.setIdDoanVien(rs.getString("idDoanVien"));
                newUser.setTenDoanVien(rs.getString("tenDoanVien"));
                newUser.setMaSinhVien(rs.getString("maSinhVien"));
                newUser.setDoB(rs.getString("dob"));
                newUser.setQueQuan(rs.getString("queQuan"));
                newUser.setTenLop(rs.getString("tenLop"));
                newUser.setTenKhoa(rs.getString("tenKhoa"));
                newUser.setTienCanNop(rs.getDouble("tienCanNop"));
                newUser.setTienDaNop(rs.getDouble("tienDaNop"));
                newUser.setTinhTrangSoDoan(rs.getString("tinhTrangSoDoan"));
                
                listUser.add(newUser);
           }
       } catch (SQLException e) {
           System.out.println("Lỗi tại lấy xe theo tim kiem");
       }
       return listUser;
    }
    
    public List<User> getAllUser_Lop(String tim)
    {
        List<User> listUser = new ArrayList<>();
       Connection con = ConnectSQL.getConnectSQL();
       String sql="Select * from DoanVien where tenLop=?";

       try {
           PreparedStatement preparedStatement = con.prepareStatement(sql);
           preparedStatement.setString(1, tim);
           ResultSet rs = preparedStatement.executeQuery();
           while(rs.next())
           {
                User newUser = new User();
                
                newUser.setIdDoanVien(rs.getString("idDoanVien"));
                newUser.setTenDoanVien(rs.getString("tenDoanVien"));
                newUser.setMaSinhVien(rs.getString("maSinhVien"));
                newUser.setDoB(rs.getString("dob"));
                newUser.setQueQuan(rs.getString("queQuan"));
                newUser.setTenLop(rs.getString("tenLop"));
                newUser.setTenKhoa(rs.getString("tenKhoa"));
                newUser.setTienCanNop(rs.getDouble("tienCanNop"));
                newUser.setTienDaNop(rs.getDouble("tienDaNop"));
                newUser.setTinhTrangSoDoan(rs.getString("tinhTrangSoDoan"));
                
                listUser.add(newUser);
           }
       } catch (SQLException e) {
           System.out.println("Lỗi tại lấy doan vien theo lop");
       }
       return listUser;
    }
    
    public List<User> getAllUser_Khoa(String tim)
    {
        List<User> listUser = new ArrayList<>();
       Connection con = ConnectSQL.getConnectSQL();
       String sql="Select * from DoanVien where tenKhoa=?";

       try {
           PreparedStatement preparedStatement = con.prepareStatement(sql);
           preparedStatement.setString(1, tim);
           ResultSet rs = preparedStatement.executeQuery();
           while(rs.next())
           {
                User newUser = new User();
                
                newUser.setIdDoanVien(rs.getString("idDoanVien"));
                newUser.setTenDoanVien(rs.getString("tenDoanVien"));
                newUser.setMaSinhVien(rs.getString("maSinhVien"));
                newUser.setDoB(rs.getString("dob"));
                newUser.setQueQuan(rs.getString("queQuan"));
                newUser.setTenLop(rs.getString("tenLop"));
                newUser.setTenKhoa(rs.getString("tenKhoa"));
                newUser.setTienCanNop(rs.getDouble("tienCanNop"));
                newUser.setTienDaNop(rs.getDouble("tienDaNop"));
                newUser.setTinhTrangSoDoan(rs.getString("tinhTrangSoDoan"));
                
                listUser.add(newUser);
           }
       } catch (SQLException e) {
           System.out.println("Lỗi tại lấy doan vien theo khoa");
       }
       return listUser;
    }
    
    public void addUser(User user){
        Connection con = ConnectSQL.getConnectSQL();
        String sql = "Insert into DoanVien(idDoanVien,tenDoanVien,maSinhVien,doB,queQuan,tenLop,tenKhoa,tienCanNop,tienDaNop,tinhTrangSoDoan)"
                + "values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, user.getIdDoanVien());
            preparedStatement.setString(2, user.getTenDoanVien());
            preparedStatement.setString(3, user.getMaSinhVien());
            preparedStatement.setString(4, user.getDoB());
            preparedStatement.setString(5, user.getQueQuan());
            preparedStatement.setString(6, user.getTenLop());
            preparedStatement.setString(7, user.getTenKhoa());
            preparedStatement.setDouble(8, user.getTienCanNop());
            preparedStatement.setDouble(9, user.getTienDaNop());
            preparedStatement.setString(10, user.getTinhTrangSoDoan());
            
            preparedStatement.execute();
            
        } catch (SQLException e) {
            System.out.println("Lỗi tại Add");
        }
    }
    
    public void deleteUser(String idDoanVien){
        Connection con = ConnectSQL.getConnectSQL();
        String sql = "Delete from DoanVien where idDoanVien = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, idDoanVien);
            
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Lỗi tại DeleteUser");
        }
    }
    
    public static String getIdNext(){
        Connection con = ConnectSQL.getConnectSQL();
        String sql = "select dbo.FN_getidDoanVien()";
        String idNext = null;
        try{
            PreparedStatement preparedStatement = con.prepareCall(sql);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next())
            {
                idNext = rs.getString("");
            }
            return idNext;
        }
        catch(SQLException e)
        {
            e.printStackTrace();;
        }
        return idNext;
    }
    
    public User SearchUser_findID(String id)
    {
        User user = new User();
        Connection con = ConnectSQL.getConnectSQL();
        String sql="Select * from DoanVien where maSinhVien=?";

       try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();

            user.setIdDoanVien(rs.getString("idDoanVien"));
            user.setTenDoanVien(rs.getString("tenDoanVien"));
            user.setMaSinhVien(rs.getString("maSinhVien"));
            user.setDoB(rs.getString("dob"));
            user.setQueQuan(rs.getString("queQuan"));
            user.setTenLop(rs.getString("tenLop"));
            user.setTenKhoa(rs.getString("tenKhoa"));
            user.setTienCanNop(rs.getDouble("tienCanNop"));
            user.setTienDaNop(rs.getDouble("tienDaNop"));
            user.setTinhTrangSoDoan(rs.getString("tinhTrangSoDoan"));
            return user;
                
       } catch (SQLException e) {
           System.out.println("Lỗi tại lấy doan vien theo khoa");
           return null;
       }
       
    }
    
    
    public void UpdateUser(User user)
    {
        Connection con = ConnectSQL.getConnectSQL();
        String sql="UPDATE DoanVien set tenDoanVien=?,queQuan=?,tienCanNop=?,tienDaNop=?,tinhTrangSoDoan=? "
                + " where idDoanVien=?";

       try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, user.getTenDoanVien());
            preparedStatement.setString(2, user.getQueQuan());
            preparedStatement.setDouble(3, user.getTienCanNop());
            preparedStatement.setDouble(4, user.getTienDaNop());
            preparedStatement.setString(5, user.getTinhTrangSoDoan());
            preparedStatement.setString(6, user.getIdDoanVien());
            
            preparedStatement.execute();
       } catch (SQLException e) {
           System.out.println("Lỗi tại update");
       }
    }
}
