package Minggu3;

public class Dosen22 {
    String kode;
    String nama;
    boolean jk; 
    int usia;

    public Dosen22(String kode, String nama, boolean jk, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jk = jk;
        this.usia = usia;
    }

    public void tampil() {
        String jenisKelamin = jk ? "Laki-laki" : "Perempuan";
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("JK    : " + jenisKelamin);
        System.out.println("Usia  : " + usia);
        System.out.println("---------------------------");
    }
}


