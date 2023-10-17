/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package awal3.Awal3.Main_Class;

import awal3.Awal3.Mata_Kuliah.Mata_Kuliah;

/**
 *
 * @author mariq
 */
public class Main_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mata_Kuliah mataKuliah1 = new Mata_Kuliah("MK101", "Pemrograman Java", 4, 3.5, 'A');
        Mata_Kuliah mataKuliah2 = new Mata_Kuliah("MK202", "Basis Data", 3, 3.0, 'B');
        Mata_Kuliah mataKuliah3 = new Mata_Kuliah("MK303", "Sistem Operasi", 3, 3.2, 'C');

        System.out.println("Mata Kuliah 1:");
        System.out.println("Kode: " + mataKuliah1.getKode());
        System.out.println("Nama: " + mataKuliah1.getNama());
        System.out.println("SKS: " + mataKuliah1.getSks());
        System.out.println("Bobot Nilai: " + mataKuliah1.getBobotNilai());
        System.out.println("Grade: " + mataKuliah1.getGrade());

        System.out.println("\nMata Kuliah 2:");
        System.out.println("Kode: " + mataKuliah2.getKode());
        System.out.println("Nama: " + mataKuliah2.getNama());
        System.out.println("SKS: " + mataKuliah2.getSks());
        System.out.println("Bobot Nilai: " + mataKuliah2.getBobotNilai());
        System.out.println("Grade: " + mataKuliah2.getGrade());

        System.out.println("\nMata Kuliah 3:");
        System.out.println("Kode: " + mataKuliah3.getKode());
        System.out.println("Nama: " + mataKuliah3.getNama());
        System.out.println("SKS: " + mataKuliah3.getSks());
        System.out.println("Bobot Nilai: " + mataKuliah3.getBobotNilai());
        System.out.println("Grade: " + mataKuliah3.getGrade());
    }
    
}
