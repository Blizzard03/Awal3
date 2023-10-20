/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package awal3.Awal3.Mata_Kuliah.Master;

/**
 *
 * @author mariq
 */
public class Mata_Kuliah {

    public String kode, nama;
    public int sks;
    public double bobotNilai;
    public static double jumlah_nilai = 0;

    public static double getJumlah_nilai() {
        return jumlah_nilai;
    }
    public char grade;

    // Full Constructor
    public Mata_Kuliah(String kode, String nama, int sks, double bobotNilai, char grade) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.bobotNilai = bobotNilai;
        this.grade = grade;
    }

    // Blank Constuctor
    public Mata_Kuliah() {
        this.kode = "Unknows";
        this.nama = "Unknows";
        this.sks = 0;
        this.bobotNilai = 0.0;
        this.grade = '-';
    }

    // Hanya Kode, Nama dan SKS
    public Mata_Kuliah(String Code, String Name, int SKS) {
        this.kode = Code;
        this.nama = Name;
        this.sks = SKS;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public double getBobotNilai() {
        return bobotNilai;
    }

    public char getGrade() {
        return grade;
    }
    
    public static double calculate_Average_value(double val){
        return val;
    }
    
    public void tampilkan(){
        System.out.print(nama);
    }

}
