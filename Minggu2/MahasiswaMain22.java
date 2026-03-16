package Minggu2;

public class MahasiswaMain22 {
    public static void main(String[] args) {
        Mahasiswa22 mhs1 = new Mahasiswa22();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa22 mh2 = new Mahasiswa22("Annisa Nabila","2141720160",3.25,"TI 2L");
        mh2.updateIpk(3.30);
        mh2.tampilkanInformasi();

        Mahasiswa22 mhsLatif = new Mahasiswa22("Muhammad Latif","254107020235",3.33,"TI 1F");
        mhsLatif.tampilkanInformasi();
    }
}
