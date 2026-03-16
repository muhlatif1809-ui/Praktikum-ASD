package Minggu2;

public class Mahasiswa22 {
    String nama;
    String nim;
    String kelas;
    double ipk;

     public Mahasiswa22(){

    }

    public Mahasiswa22 (String name, String nim, double ipk, String kls){
        nama = name;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }

    void tampilkanInformasi() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("IPK: " + ipk);
            System.out.println("Kelas: " + kelas);
        }

    void ubahKelas(String KelasBaru){
            kelas = KelasBaru;
        }
        void updateIpk(double ipkBaru){
            if (ipk <= 4.0 && ipk >= 0.0) {
                ipk = ipkBaru;
            } else {
                System.out.println("Ipk Tidak Valid. Harus Antara 0.0 Dan 4.0");
        }
            
    }
        String  nilaiKnerja(double ipk){
            if (ipk >= 3.5 ) {
                return "Kinerja Sangat Baik";
            } else if (ipk >= 3.0) {
                return "Kinerja Baik";
            } else if (ipk >= 2.0) {
                return "Kinerja Cukup";
            } else {
                return "Kinerja Kurang";
            }
        }
    }   

        

