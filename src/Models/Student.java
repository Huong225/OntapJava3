/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Huong
 */
public class Student {
    private String maSV, name, email, phone, gender, address, img;

    public Student() {
    }

    public Student(String maSV, String name, String email, String phone, String gender, String address, String img) {
        this.maSV = maSV;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
        this.img = img;
    }

    public Student(String maSV, String name) {
        this.maSV = maSV;
        this.name = name;
    }
    
    public Student(String maSV) {
        this.maSV = maSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
//        ImageIcon icon = new ImageIcon("C:\\Users\\Huong\\OneDrive\\Documents\\NetBeansProjects\\TestAssignmentJava\\src\\AssignmentJava3\\image\\");
//        Image image = icon.getImage();
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
}
