package Minggu2;

public class DosenMain22 {

    public static void main(String[] args) {
        Dosen22 dsn1 = new Dosen22();
        dsn1.idDosen = "1965";
        dsn1.nama = "Muhammad Latif";
        dsn1.statusAktif = false;
        dsn1.tahunBergabung = 2010;
        dsn1.bidangKeahlian = "Olahraga";

        dsn1.tampilInformasi();
        dsn1.hitungMasaKerja(2026);
        dsn1.setStatusAktif(true);
        dsn1.ubahKeahlian("Daspro");
        dsn1.tampilInformasi();


        Dosen22 dsn2 = new Dosen22("1809","Muhammad Stepen",true,2015,"Matematika");
        dsn2.tampilInformasi();

        dsn2.setStatusAktif(false);
        dsn2.hitungMasaKerja(2025);
        dsn2.ubahKeahlian("Agama");
        dsn2.tampilInformasi();

        Dosen22 dsn3 = new Dosen22("8973","Stepen",true,2013,"Sistem Operasi");
        dsn3.tampilInformasi();
        dsn3.hitungMasaKerja(2026);


        
    }
}

