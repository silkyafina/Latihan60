/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package akatsukicharacter;

/**
 *
 * @author User
 * Nama : Silky Afina Saly 
 * NIM : 22166017 
 * Mata Kuliah : Pemrograman Berorientasi Objek 1 
 * Program Studi: Sistem Informasi 
 * Semester : 3
 */
// Kelas Akatsuki Character sebagai Super class 
public class AkatsukiCharacter {
// Deklarasi variabel
    String asalDesa;
    int umur;
    String partner;
// Konstruktor  
      public AkatsukiCharacter(String asalDesa, int umur, String partner) {
        this.asalDesa = asalDesa;
        this.umur = umur;
        this.partner = partner;
    }
// Metode getter dan setter
    public String getAsalDesa() {
        return asalDesa;
    }
    public void setAsalDesa(String asalDesa) {
        this.asalDesa = asalDesa;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getPartner() {
        return partner;
    }
    public void setPartner(String partner) {
        this.partner = partner;
    }
// Metode menampilkan informasi pada kelas Akatsuki Character
    public void Character(){
        System.out.println("Asal Desa : "+asalDesa);
        System.out.println("Umur : "+umur +" tahun");
        System.out.println("Partner : "+partner);
}
    }
// Kelas itachi sebagai sub class turunan kelas Akatsuki Character
class Itachi extends AkatsukiCharacter{
      String elemenAlam;

// Konstruktor sebagai inisialisasi objek      
     public Itachi(String asalDesa, int umur, String partner, String elemenAlam){
         super(asalDesa, umur, partner);
         this.elemenAlam = elemenAlam;
         System.out.println("Itachi Uchiha");
     }
// Metode getter dan setter     
     public String getElemenAlam() {
        return elemenAlam;
    }
    public void setElemenAlam(String elemenAlam) {
        this.elemenAlam = elemenAlam;
    }
}
// Kelas orochimaru sebagai sub class turunan kelas Akatsuki Character
class Orochimaru extends AkatsukiCharacter{
    String kekuatan;

// Konstruktor    
     public Orochimaru(String asalDesa, int umur, String partner, String kekuatan){
         super(asalDesa,  umur,  partner);
         this.kekuatan = kekuatan;
         System.out.println("Orochimaru");
    }
// Metode getter dan setter
     public String getKekuatan() {
        return kekuatan;
    }
    public void setKekuatan(String kekuatan) {
        this.kekuatan = kekuatan;
    }
    
    public static void main(String[] args) {
        System.out.println("Nama Karakter dalam Akatsuki");
        System.out.println("");
// Membuat objek itachi dan menampilkan output
        Itachi itachi = new Itachi("Konohagakure", 21, "Kisame Hoshigaki", "Api, angin, air");
        itachi.Character();
        System.out.println("Elemen Alam : "+itachi.elemenAlam);
        System.out.println("");
        
// Membuat objek orochimaru dan menampilkan output
        Orochimaru orochimaru = new Orochimaru("Konohagakure", 54, "Sasori", "Edo tensei, fushi tensei, juinjutsu");
        orochimaru.Character();
        System.out.println("Kekuatan : "+orochimaru.kekuatan);
        System.out.println("");
    
    }     
}
    
   
