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
public class Detective extends Karakter{
    public Detective(String nama, String jnsKelamin) {
        super(nama, jnsKelamin);
    }
    
    public void statusDetective(String statusDetective) {
        System.out.println("Status Detective : " + statusDetective);
    }
}
