/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Huong
 */
public class Grade {
     private Student st;
    private float diemTA, diemTH, diemGDTC, DiemTB;

    public Grade() {
    }

    public Grade(Student st, float diemTA, float diemTH, float diemGDTC, float DiemTB) {
        this.st = st;
        this.diemTA = diemTA;
        this.diemTH = diemTH;
        this.diemGDTC = diemGDTC;
        this.DiemTB = DiemTB;
    }

    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }

    public float getDiemTA() {
        return diemTA;
    }

    public void setDiemTA(float diemTA) {
        this.diemTA = diemTA;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float getDiemGDTC() {
        return diemGDTC;
    }

    public void setDiemGDTC(float diemGDTC) {
        this.diemGDTC = diemGDTC;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(float DiemTB) {
        this.DiemTB = DiemTB;
    }

    
}
