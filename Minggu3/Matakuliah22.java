package Minggu3;

public class Matakuliah22 {
    public String kode;
    public String nama;
    public int sks;
    public int JumlahJam;

    public Matakuliah22(String kode, String nama, int sks, int JumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.JumlahJam = JumlahJam;
    }
    
    void cetakInfo(){
        System.out.println("Kode        : "+ kode);
        System.out.println("Nama        : "+ nama);
        System.out.println("SKS         : "+ sks);
        System.out.println("Jumlah Jam  : "+ JumlahJam);
    }
}
