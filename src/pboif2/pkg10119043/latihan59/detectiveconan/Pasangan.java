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
public class Pasangan extends Karakter{
    public Pasangan(String nama, String jnsKelamin) {
        super(nama, jnsKelamin);
    }
    
    @Override
    public void status(String status) {
        System.out.println("Status : " + status );
    }
    
    @Override
    public void deskripsi(String deskripsi) {
        System.out.println("Deskripsi : " + deskripsi + "\n");
    }
}
