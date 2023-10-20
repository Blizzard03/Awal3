/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal3.Awal3.Mata_Kuliah.Sub;

import awal3.Awal3.Mata_Kuliah.Master.Mata_Kuliah;

/**
 *
 * @author mariq
 */
public class Matakuliah_Praktek extends Mata_Kuliah {

    private int totalbab, studenttotal;

    public int getTotalbab() {
        return totalbab;
    }

    public int getStudenttotal() {
        return studenttotal;
    }

    public Matakuliah_Praktek(int totalbab, int studenttotal, String kode, String nama, int sks, double bobotNilai, char grade) {
        super(kode, nama, sks, bobotNilai, grade);
        this.totalbab = totalbab;
        this.studenttotal = studenttotal;
    }

    

    @Override
    public void tampilkan() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(
                "Mata Kuliah:");
        System.out.printf("%s %s %f %s %d",
                getKode(),
                getSks(),
                getBobotNilai(),
                getGrade(),
                totalbab);
    }

}
