package Minggu12.CM2;

import java.util.Scanner;

public class Main22 {
    private static final Scanner latif22 = new Scanner(System.in);
    private static final AntrianPembeli22 antrian = new AntrianPembeli22();
    private static final DaftarPesanan22  pesanan = new DaftarPesanan22();
 
    private static void printHeader() {
        System.out.println("==============================");
        System.out.println("  SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("==============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu : ");
    }
 
    private static void tambahAntrian() {
        System.out.print("Nama Pembeli : ");
        String nama = latif22.nextLine().trim();
        System.out.print("No HP        : ");
        String hp = latif22.nextLine().trim();
 
        int noAntrian = antrian.tambah(nama, hp);
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + noAntrian);
    }
 
    private static void cetakAntrian() {
        antrian.cetak();
    }
 
    private static void hapusAntrian() {
        System.out.print("Masukkan No. Antrian yang dipanggil : ");
        int noAntrian;
        try {
            noAntrian = Integer.parseInt(latif22.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid.");
            return;
        }
 
        Pembeli22 pembeli = antrian.hapus(noAntrian);
        if (pembeli == null) {
            System.out.println("No. antrian " + noAntrian + " tidak ditemukan.");
            return;
        }
 
        System.out.println("Pembeli " + pembeli.namaPembeli + " dipanggil ke kasir.");
        System.out.println("--- Input Pesanan ---");
        System.out.print("Kode Pesanan  : ");
        int kodePesanan;
        try {
            kodePesanan = Integer.parseInt(latif22.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Kode pesanan tidak valid. Antrian tetap dihapus.");
            return;
        }
 
        System.out.print("Nama Pesanan  : ");
        String namaPesanan = latif22.nextLine().trim();
        System.out.print("Harga         : ");
        int harga;
        try {
            harga = Integer.parseInt(latif22.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Harga tidak valid. Pesanan tidak disimpan.");
            return;
        }
 
        pesanan.tambah(kodePesanan, namaPesanan, harga, pembeli.namaPembeli);
        System.out.println(pembeli.namaPembeli + " telah memesan " + namaPesanan);
    }
 
    private static void laporanPesanan() {
        pesanan.cetakLaporan();
    }
 
    private static void isiDataDemo() {
        antrian.tambah("Ainra", "08224500000");
        antrian.tambah("Danra", "08224511111");
        antrian.tambah("Sanri", "08224522222");
        antrian.tambah("Vania", "08422234556");
    }
 
    public static void main(String[] args) {
        isiDataDemo();
 
        boolean running = true;
        while (running) {
            System.out.println();
            printHeader();
 
            String input = latif22.nextLine().trim();
            System.out.println();
 
            switch (input) {
                case "1": tambahAntrian();  break;
                case "2": cetakAntrian();   break;
                case "3": hapusAntrian();   break;
                case "4": laporanPesanan(); break;
                case "0":
                    System.out.println("Terima kasih. Program selesai.");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 0-4.");
            }
        }
 
        latif22.close();
    }
}

