/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Huong
 */
public class SvienDAO {
    private Connection conn;
    String imageSV = null;
    
    ArrayList<Student> listSV = new ArrayList<>();
    
    public SvienDAO(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=FPL_DaoTao;user=sa;password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Student> getListStudent(){        
        try {           
            String sql = "SELECT * FROM STUDENTS";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()==true){
                Student sv = new Student();
                sv.setMaSV(rs.getString(1));
                sv.setName(rs.getString(2));
                sv.setEmail(rs.getString(3));
                sv.setPhone(rs.getString(4));
                sv.setGender(rs.getString(5));
                sv.setAddress(rs.getString(6));
                sv.setImg(rs.getString(7));
                listSV.add(sv);
            }
//            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSV;
    }
    
    public boolean InsertSV(Student sv){
        String sql = "INSERT INTO STUDENTS (MASV,HOTEN,EMAIL,SODT,GIOITINH,DIACHI,HINH) VALUES (?,?,?,?,?,?,?)";
        
        try {            
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sv.getMaSV());
            ps.setString(2, sv.getName());
            ps.setString(3, sv.getEmail());
            ps.setString(4, sv.getPhone());
            ps.setString(5, sv.getGender());
            ps.setString(6, sv.getAddress());
            if(sv.getImg()==null){
                ps.setString(7, null);
            }else{
                ps.setString(7, sv.getImg());
            }
            ps.executeUpdate();
//            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; 
    }
    
    public boolean UpdateSV(Student sv){
        try {
            String sql = "UPDATE STUDENTS SET HOTEN = ?, EMAIL = ?, SODT = ?, GIOITINH = ?, DIACHI = ?, HINH = ? WHERE MASV = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
               
            ps.setString(1, sv.getName());
            ps.setString(2, sv.getEmail());
            ps.setString(3, sv.getPhone());
            ps.setString(4, sv.getGender());
            ps.setString(5, sv.getAddress());
            ps.setString(6, sv.getImg());
            ps.setString(7, sv.getMaSV());
            
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false; 
    }
    
    public int delete(String maSV) {
        try {
            String query = "DELETE FROM Students WHERE MaSV = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, maSV);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
