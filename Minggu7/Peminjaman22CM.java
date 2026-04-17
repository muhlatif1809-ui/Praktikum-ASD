package Minggu7;


public class Peminjaman22CM {
    Mahasiswa22CM mhs; 
    Buku22CM buku;     
    int lamaPinjam;
    int denda;
    int tahun;
    int pinjam;
    Peminjaman22CM(Mahasiswa22CM mhs, Buku22CM buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        int batas = 5;
        int telat = lamaPinjam - batas;
     
        // Hitung Denda Dibawah 2020
        if (telat > 0) {
            denda = telat * 2000;
        } else {
            if (telat >= 2020) {
                denda = telat * 2;
            } else {
                denda = 0;
            }
            
        }
    }

    void tampil() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " + buku.judul + " | " + lamaPinjam + " hari | Denda: " + denda);
    }
}
