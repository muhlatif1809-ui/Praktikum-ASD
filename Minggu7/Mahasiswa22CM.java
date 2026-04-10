package Minggu7;

public class Mahasiswa22CM {
     String nim, nama, prodi;

    Mahasiswa22CM(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampil() {
        System.out.println(nim + " | " + nama + " | " + prodi);
    }
}
