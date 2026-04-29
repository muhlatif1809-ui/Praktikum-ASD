package Minggu9;

import java.util.Scanner;

public class SuratMain22 {
     public static void main(String[] args) {
        StackSurat22 stack = new StackSurat22(10);
        Scanner latif22 = new Scanner (System.in);
        int pilih;
        do {
            System.out.println("\nMenu : ");
            System.out.println("1. Masukkan Data Surat");
            System.out.println("2. Memverifikasi Surat");
            System.out.println("3. Melihat Surat Teratas");
            System.out.println("4. Cari Surat Berdasarkan Nama Mahasiswa");
            System.out.print("Pilih : ");
            pilih = latif22.nextInt();
            latif22.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = latif22.nextLine();
                    System.out.print("Nama: ");
                    String nama = latif22.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = latif22.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = latif22.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = latif22.nextInt();
                    Surat22 s = new Surat22(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;
                case 2:
                    System.out.println("Verifikasi Surat ");
                    System.out.println("ID Surat\tNama\tKelas\tJenis Izin\tDurasi ");
                    stack.print();
                    break;  
                case 3:
                    Surat22 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir di input pada mahasiswa  " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Cari nama: ");
                    String cari = latif22.nextLine();
                    if (stack.cariNama(cari)) {
                        System.out.println("Surat ditemukan!");
                    } else {
                        System.out.println("Surat tidak ditemukan!");
                    }
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid! ");
            }
            
        } while (pilih >= 1 && pilih <= 4);
    }
    
}

