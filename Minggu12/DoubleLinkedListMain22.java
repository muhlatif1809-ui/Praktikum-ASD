package Minggu12;

import java.util.Scanner;

public class DoubleLinkedListMain22 {
    public static Mahasiswa22 inputMahasiswa22(Scanner scan) {
        System.out.print("Masukkan NIM : ");
        String nim = scan.nextLine();
    
        System.out.print("Masukkan Nama : ");
        String nama = scan.nextLine();
    
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();

        System.out.print("Masukkan IPK : ");
        double ipk = scan.nextDouble();

    
        return new Mahasiswa22(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        Scanner latif22 = new Scanner(System.in);
        DoubelLinkedList22 list = new DoubelLinkedList22();
        int pilihan;
        

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah Data Di Awal");
            System.out.println("2. Tambah Data Di Akhir");
            System.out.println("3. Sisipkan Data Di Tengah (Setelah NIM)");
            System.out.println("4. Hapus Data Di Awal");
            System.out.println("5. Hapus Data Di Akhir");
            System.out.println("6. Tampilkan Data");
            System.out.println("7. Tampilkan Data Terbalik");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = latif22.nextInt();
            latif22.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa22 mhsAwal = inputMahasiswa22(latif22);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa22 MhsAkhir = inputMahasiswa22(latif22);
                    list.addLast(MhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM Yang Dicari: ");
                    String keyNim = latif22.nextLine();
                    System.out.println("Masukkan Data Baru: ");
                    Mahasiswa22 dataBaru = inputMahasiswa22(latif22);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6: 
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Menu Tidak Valid.");
            }
        } while (pilihan != 0);
            latif22.close();
        }
    }

