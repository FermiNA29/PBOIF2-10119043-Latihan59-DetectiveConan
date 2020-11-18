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
public class PBOIF210119043Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //output
        //Nama : 
        //Jenis Kelamin : 
        //Status :
        
        System.out.println("=== Karakter Dalam Serial Detective Conan ===");
        DetectiveSenior karakter1 = new DetectiveSenior("Conan Edogawa/Shinici Kudo", "Laki-Laki");
        karakter1.tampilKarakter();
        karakter1.status("Detective");
        karakter1.statusDetective();
        karakter1.deskripsi("Conan Edogawa (江戸川コナン Edogawa Konan) adalah seorang anggota Grup Detektif Cilik yang identitas aslinya adalah Shinichi Kudo");
        
        BelaDiri karakter2 = new BelaDiri("Ran Mouri", "Perempuan");
        karakter2.tampilKarakter();
        karakter2.status("Ahli Bela Diri, Anak Kogoro Mouri");
        karakter2.deskripsi("Ran Mouri adalah teman Shinichi Kudo sejak kecil.");
        
        DetectiveSenior karakter3 = new DetectiveSenior("Kogoro Mouri", "Laki-Laki");
        karakter3.tampilKarakter();
        karakter3.status("Detective");
        karakter3.statusDetective();
        karakter3.deskripsi("Kogoro Mouri adalah seorang detektif swasta yang sangat terkenal karena sering memecahkan kasus.");
        
        BelaDiri karakter4 = new BelaDiri("Sonoko Suzuki", "Perempuan");
        karakter4.tampilKarakter();
        karakter4.status("Ahli Bela Diri, sahabat  Ran");
        karakter4.deskripsi("Sonoko Suzuki (鈴木 園子 Suzuki Sonoko) adalah sahabat terbaik Ran.");
        
        Pasangan karakter5 = new Pasangan("Eri Kisaki", "Perempuan");
        karakter5.tampilKarakter();
        karakter5.status("Istri Kogoro Mouri");
        karakter5.deskripsi("Eri Kisaki (妃 英里 Kisaki Er) adalah ibu Ran Mouri sekaligus istri Kogoro Mouri.");
        
        Profesor karakter6 = new Profesor("Hiroshi Agasa", "Laki-Laki");
        karakter6.tampilKarakter();
        karakter6.status("Ilmuan");
        karakter6.deskripsi("Profesor Hiroshi Agasa (阿笠 博士 Agasa Hiroshi) adalah seorang profesor linglung yang menemukan beberapa perangkat untuk membantu Conan.");
        
        OrganisasiHitam karakter7 = new OrganisasiHitam("Ai Haibara", "Perempuan");
        karakter7.tampilKarakter();
        karakter7.status("Mantan anggota organisasi hitam");
        karakter7.deskripsi("Ai Haibara (灰原哀 Haibara Ai) adalah seorang anggota Organisasi Hitam yang berkhianat pada organisasi");
        
        DetectiveJunior karakter8 = new DetectiveJunior("Ayumi Yoshida", "Perempuan");
        karakter8.tampilKarakter();
        karakter8.status("Detective");
        karakter8.statusDetective();
        karakter8.deskripsi("Ayumi Yoshida (吉田歩美 Yoshida Ayumi) adalah teman Conan sekaligus anggota Grup Detektif Cilik.");
        
        DetectiveJunior karakter9 = new DetectiveJunior("Genta Kojima", "Laki-Laki");
        karakter9.tampilKarakter();
        karakter9.status("Detective");
        karakter9.statusDetective();
        karakter9.deskripsi("Genta Kojima (小嶋元太 Kojima Genta) adalah pendiri Grup Detektif Cilik.");
        
        DetectiveJunior karakter10 = new DetectiveJunior("Mitsuhiko Tsuburaya", "Laki-Laki");
        karakter10.tampilKarakter();
        karakter10.status("Detective");
        karakter10.statusDetective();
        karakter10.deskripsi("Mitsuhiko Tsuburaya (円谷光彦 Tsuburaya Mitsuhiko) adalah seorang anggota Grup Detektif Cilik.");
        
        DetectiveSenior karakter11 = new DetectiveSenior("Heiji Hattori", "Laki-Laki");
        karakter11.tampilKarakter();
        karakter11.status("Detective");
        karakter11.statusDetective();
        karakter11.deskripsi("Heiji Hattori (服部平次 Hattori Heiji) adalah rival Shinichi Kudo yang berasal dari Osaka.");
        
        Pasangan karakter12 = new Pasangan("Kazuha Toyama", "Perempuan");
        karakter12.tampilKarakter();
        karakter12.status("Kekasih Heiji");
        karakter12.deskripsi("Kazuha Toyama (远山和叶 Tōyama Kazuha) adalah teman masa kanak- kanak Heiji Hattori");
        
        
    }
    
}
