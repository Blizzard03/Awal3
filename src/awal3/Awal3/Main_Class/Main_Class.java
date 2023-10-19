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
        // Material 1
        final Mata_Kuliah mataKuliah1 = new Mata_Kuliah("MK101", "Pemrograman Java", 4, 3.5, 'A');
        final Mata_Kuliah mataKuliah2 = new Mata_Kuliah("MK202", "Basis Data", 3, 3.0, 'B');
        final Mata_Kuliah mataKuliah3 = new Mata_Kuliah("MK303", "Sistem Operasi", 3, 3.2, 'C');

        // Material 2
        final Mata_Kuliah mata_Kuliah4 = new Mata_Kuliah("CB-761", "Cyber Security", 4);
        final Mata_Kuliah mata_Kuliah5 = new Mata_Kuliah("HD-853", "Human Development", 8);
        final Mata_Kuliah mata_Kuliah6 = new Mata_Kuliah("WH-781", "Werewolf History", 14);

        // Material 3
        final Mata_Kuliah mata_Kuliah7 = new Mata_Kuliah();
        mata_Kuliah7.kode = "WP-851";
        mata_Kuliah7.nama = "Werewolves Philosophy";
        mata_Kuliah7.sks = 6;
        mata_Kuliah7.bobotNilai = 3.8;
        mata_Kuliah7.grade = 'A';

        final Mata_Kuliah mata_Kuliah8 = new Mata_Kuliah();
        mata_Kuliah8.kode = "WE-391";
        mata_Kuliah8.nama = "Wolf Ecology";
        mata_Kuliah8.sks = 4;
        mata_Kuliah8.bobotNilai = 3.1;
        mata_Kuliah8.grade = 'B';

        final Mata_Kuliah mata_Kuliah9 = new Mata_Kuliah();
        mata_Kuliah9.kode = "LP-563";
        mata_Kuliah9.nama = "Lion Philosophy";
        mata_Kuliah9.sks = 8;
        mata_Kuliah9.bobotNilai = 3.51;
        mata_Kuliah9.grade = 'A';

        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("AWAL 3 PROGRAMS");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Material 1");
        System.out.println("-----------------------------------------------------------");
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
        System.out.println("Grade: " + mataKuliah3.getGrade() + "\n");

        System.out.println("-----------------------------------------------------------");
        System.out.println("Material 2");
        System.out.println("-----------------------------------------------------------");

        System.out.println("\nMata Kuliah 4:");
        System.out.println("Kode: " + mata_Kuliah4.getKode());
        System.out.println("Nama: " + mata_Kuliah4.getNama());
        System.out.println("SKS: " + mata_Kuliah4.getSks());

        System.out.println("\nMata Kuliah 5:");
        System.out.println("Kode: " + mata_Kuliah5.getKode());
        System.out.println("Nama: " + mata_Kuliah5.getNama());
        System.out.println("SKS: " + mata_Kuliah5.getSks());

        System.out.println("\nMata Kuliah 6:");
        System.out.println("Kode: " + mata_Kuliah6.getKode());
        System.out.println("Nama: " + mata_Kuliah6.getNama());
        System.out.println("SKS: " + mata_Kuliah6.getSks());

        System.out.println("-----------------------------------------------------------");
        System.out.println("Material 3");
        System.out.println("-----------------------------------------------------------");

        System.out.println("Mata Kuliah 7:");
        System.out.println("Kode: " + mata_Kuliah7.getKode());
        System.out.println("Nama: " + mata_Kuliah7.getNama());
        System.out.println("SKS: " + mata_Kuliah7.getSks());
        System.out.println("Bobot Nilai: " + mata_Kuliah7.getBobotNilai());
        System.out.println("Grade: " + mata_Kuliah7.getGrade());

        System.out.println("Mata Kuliah 8:");
        System.out.println("Kode: " + mata_Kuliah8.getKode());
        System.out.println("Nama: " + mata_Kuliah8.getNama());
        System.out.println("SKS: " + mata_Kuliah8.getSks());
        System.out.println("Bobot Nilai: " + mata_Kuliah8.getBobotNilai());
        System.out.println("Grade: " + mata_Kuliah8.getGrade());

        System.out.println("Mata Kuliah 9:");
        System.out.println("Kode: " + mata_Kuliah9.getKode());
        System.out.println("Nama: " + mata_Kuliah9.getNama());
        System.out.println("SKS: " + mata_Kuliah7.getSks());
        System.out.println("Bobot Nilai: " + mata_Kuliah7.getBobotNilai());
        System.out.println("Grade: " + mata_Kuliah7.getGrade());
        System.out.println("-----------------------------------------------------------");
        System.out.println("Program Made by WPA TEAM");
        System.out.println("-----------------------------------------------------------");
    }

}
