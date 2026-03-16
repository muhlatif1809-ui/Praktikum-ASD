package Minggu2;

public class Dosen22 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen22 (){

    }

    public Dosen22 (String id, String nama, boolean status, int thn, String bidang){
        idDosen = id;
        this.nama = nama;
        statusAktif = status;
        tahunBergabung = thn;
        bidangKeahlian = bidang;
    }

    void tampilInformasi (){
        System.out.println("Id Dosen : "+idDosen);
        System.out.println("Nama Dosen : "+nama);

        if (statusAktif) {
            System.out.println("Status Dosen : aktif");
        } else {
            System.out.println( "Status Dosen : tidak aktif");
        }

        System.out.println("Tahun bergabung : "+tahunBergabung);
        System.out.println("Spesialisasi dosen : "+bidangKeahlian);
        System.out.println();
    }

    void setStatusAktif (boolean status){
        statusAktif = status;
        if (statusAktif) {
            System.out.println("Status Dosen berubah menjadi : aktif");
        } else {
            System.out.println( "Status Dosen berubah menjadi : tidak aktif");
        }
    }

    int hitungMasaKerja (int thnSkrg){
        int masaKerja = thnSkrg - tahunBergabung;
        System.out.println("Masa kerja dosen yaitu "+masaKerja+" tahun");
        return masaKerja;
    }

    void ubahKeahlian (String bidang){
        bidangKeahlian = bidang;
    }
}

