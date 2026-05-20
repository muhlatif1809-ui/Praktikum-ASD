package Minggu11;

public class MahasiswaQueue22 {
     String nim;
    String nama;

    public MahasiswaQueue22(
            String nim,
            String nama) {

        this.nim = nim;
        this.nama = nama;
    }

    void tampil() {
        System.out.println(
                nim + " - " + nama
        );
    }
}

