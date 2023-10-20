/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal3.Awal3.Mata_Kuliah;

/**
 *
 * @author mariq
 */
public class MatakuliahTerori extends Mata_Kuliah {

    private String Tentang;

    public String getTentang() {
        return Tentang;
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
                Tentang);
    }

    public MatakuliahTerori(String Tentang, String kode, String nama, int sks, int bobotNilai, int grade) {
        super(kode, nama, sks, bobotNilai, grade);
        this.Tentang = Tentang;
    }

}
