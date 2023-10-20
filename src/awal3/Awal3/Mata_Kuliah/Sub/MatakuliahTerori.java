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
public class MatakuliahTerori extends Mata_Kuliah {

    private String Tentang, Dosen ;

    public String getTentang() {
        return Tentang;
    }

    public String getDosen() {
        return Dosen;
    }

    @Override
    public void tampilkan() {
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println(
                "Mata Kuliah:");
        System.out.printf("%s %s %f %s %s",
                getKode(),
                getSks(),
                getBobotNilai(),
                getGrade(),
                Tentang,
                Dosen);
    }

    public MatakuliahTerori(String Tentang, String Dosen, String kode, String nama, int sks, double bobotNilai, char grade) {
        super(kode, nama, sks, bobotNilai, grade);
        this.Tentang = Tentang;
        this.Dosen = Dosen;
    }

    

   

}
