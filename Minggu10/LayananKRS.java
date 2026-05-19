package Minggu10;

import java.util.Scanner;

public class LayananKRS {
    public static void main(String[] args) {
        Scanner latif22 = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

         do {
            System.out.println("\n=== ANTRIAN PERSETUJUAN KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Belakang");
            System.out.println("6. Cek Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Proses KRS");
            System.out.println("8. Jumlah Belum Proses KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = latif22.nextInt();
            latif22.nextLine();
            
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = latif22.nextLine();
                    System.out.print("Nama  : ");
                    String nama = latif22.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = latif22.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = latif22.nextLine();
                    MahasiswaKRS22 mhs = new MahasiswaKRS22(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2: 
                    antrian.dequeue2();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihat2Terdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    antrian.jumlahDiproses();
                    break;
                case 8:
                    antrian.belumProses();
                    break;
                case 9:
                    antrian.clear();
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid.");
            }
        } while (pilihan != 0);
    }
}

