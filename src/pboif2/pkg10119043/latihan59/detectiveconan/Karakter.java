/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan59.detectiveconan;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program daftar karakter serial Detective Conan
 */
public class Karakter {
    protected String nama;
    protected String jenisKelamin;

    public Karakter(String nama, String jenisKelamin) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }
    
    public void status(String status) {
        System.out.println("Status : " + status);
    }
    
    public void deskripsi(String deskripsi) {
        System.out.println("Deskripsi : " + deskripsi + "\n");
    }
    
    public void tampilKarakter() {
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
    }
}
