/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.Grade;
import Models.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huong
 */
public class GradeDAO {
    private Connection conn;

    public GradeDAO(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=FPL_DaoTao;user=sa;password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Grade> getTOP3() {
        List<Grade> listGrade = new ArrayList<>();
        try {            
            String query = "SELECT TOP 3 Grade.MaSV,Students.HoTen,TiengAnh,TinHoc,GDTC , ROUND((TiengAnh+TinHoc+GDTC)/3, 1, 1) "
                    + "AS 'DiemTB' \n"
                    + "FROM dbo.Grade JOIN dbo.Students ON Students.MaSV = Grade.MaSV ORDER BY DiemTB DESC";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maSV = rs.getString(1);
                String hoTen = rs.getString(2);
                float diemTA = rs.getFloat(3);
                float diemTH = rs.getFloat(4);
                float diemGDTC = rs.getFloat(5);
                float diemTB = rs.getFloat(6);
                Grade gr = new Grade(new Student(maSV, hoTen), diemTA, diemTH, diemGDTC, diemTB);
                listGrade.add(gr);
            }
//            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listGrade;
    }

    public Grade getMaSV(String maSV) {
        try {
            Grade gr = new Grade();
            String query = "SELECT Students.HoTen, Students.MaSV,TiengAnh,TinHoc,GDTC , (TiengAnh + TinHoc + GDTC)/3 AS 'DiemTB' \n"
                    + "FROM dbo.Grade RIGHT JOIN dbo.Students ON Students.MaSV = Grade.MaSV WHERE Students.MaSV = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, maSV);
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                gr.setSt(new Student(rs.getString(2), rs.getString(1)));
                gr.setDiemTA(rs.getFloat(3));
                gr.setDiemTH(rs.getFloat(4));
                gr.setDiemGDTC(rs.getFloat(5));
                gr.setDiemTB(rs.getFloat(6));

                return gr;
            }
//            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Grade getSearch(String maSV) {
        try {
            Grade gr = new Grade();
            String query = "SELECT Students.HoTen, Students.MaSV,TiengAnh,TinHoc,GDTC , (TiengAnh+TinHoc+GDTC)/3 AS 'DiemTB' \n"
                    + "FROM dbo.Grade JOIN dbo.Students ON Students.MaSV = Grade.MaSV WHERE Students.MaSV = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, maSV);
            ResultSet rs = ps.executeQuery();
            while (rs.next() == true) {
                gr.setSt(new Student(rs.getString(2), rs.getString(1)));
                gr.setDiemTA(rs.getFloat(3));
                gr.setDiemTH(rs.getFloat(4));
                gr.setDiemGDTC(rs.getFloat(5));
                gr.setDiemTB(rs.getFloat(6));

                return gr;
            }
//            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    public Grade insertDiem(Grade grade) {
        try {
            String query = " INSERT INTO Grade(MaSV,TiengAnh,TinHoc,GDTC) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, grade.getSt().getMaSV());
            ps.setDouble(2, grade.getDiemTA());
            ps.setDouble(3, grade.getDiemTH());
            ps.setDouble(4, grade.getDiemGDTC());
            ps.executeUpdate();
//            if ( > 0) {
                return grade;
//            }

//            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public int update(Grade grade) {
        try {
            String query = "UPDATE Grade SET TiengAnh = ?, TinHoc = ?, GDTC = ? WHERE MaSV = ?";
            PreparedStatement ps = conn.prepareStatement(query);

            ps.setDouble(1, grade.getDiemTA());
            ps.setDouble(2, grade.getDiemTH());
            ps.setDouble(3, grade.getDiemGDTC());
            ps.setString(4, grade.getSt().getMaSV());

            ps.executeUpdate();

//            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int delete(String maSV) {
        try {
            String query = "DELETE FROM Grade WHERE MaSV = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, maSV);

            if (ps.executeUpdate() > 0) {
                return 1;
            }

//            conn.close();
        } catch (Exception e) {

        }
        return -1;
    }
}
