package Minggu2;

public class MataKuliah22 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah22(){
        
    }

    public MataKuliah22 (String kodeMk, String name, int sks, int jmlJam){
        this.kodeMK = kodeMk;
        nama = name;
        this.sks = sks;
        jumlahJam = jmlJam;
    }

    void tampilInformasi(){
        System.out.println("Kode Mata Kuliah : "+kodeMK);
        System.out.println("Nama Mata Kuliah : "+nama);
        System.out.println("SKS : "+sks);
        System.out.println("Jumlah Jam Mata Kuliah Per Minggu : "+jumlahJam);
        System.out.println();
    }

    void ubahSKS (int sksBaru){
        sks = sksBaru;
        System.out.println("SKS Telah Diubah Menjadi "+sks);
    }

    void tambahJam (int jam){
        jumlahJam += jam;
        System.out.println("Jumlah Jam Ditambah Menjadi "+jumlahJam);
    }

    void kurangiJam (int jam){
        if (jumlahJam > jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah Jam Berkurang Mennjadi "+jumlahJam);
        } else {
            System.out.println("Jumlah Jam Tidak Cukup Untuk Dikurangi!!");
        }
    }
}
