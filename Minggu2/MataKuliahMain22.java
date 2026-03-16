package Minggu2;

public class MataKuliahMain22 {
    public static void main(String[] args) {
        MataKuliah22 matkul1 = new MataKuliah22();
        matkul1.kodeMK = "2541";
        matkul1.nama ="Algoritma Struktur Data";
        matkul1.sks = 4;
        matkul1.jumlahJam = 6;
        
        matkul1.tampilInformasi();
        matkul1.ubahSKS(6 );
        matkul1.tambahJam(1);
        matkul1.kurangiJam(7);
        matkul1.tampilInformasi();

        MataKuliah22 matkul2 = new MataKuliah22("5123", "Daspro", 5, 8);
        matkul2.kurangiJam(4);
        matkul2.tampilInformasi();

        MataKuliah22 matkul3 = new MataKuliah22("8976", "Basis Data", 3, 4);
        matkul3.tambahJam(2);
        matkul3.tampilInformasi();
    }
}
