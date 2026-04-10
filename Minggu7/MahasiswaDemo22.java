package Minggu7;

import java.util.Scanner;

public class MahasiswaDemo22 {
     public static void main(String[] args) {
        Scanner latif22 = new Scanner(System.in);
        MahasiswaBerprestasi22 List = new MahasiswaBerprestasi22();
        int JmlMhs = 5;

        for (int i = 0; i < JmlMhs; i++) {
            System.out.println("Masukkan Data Nahasiswa Ke-" + (i+1));
            System.out.print("NIM     : ");
            String NIM = latif22.nextLine();
            System.out.print("Nama    : ");
            String Nama = latif22.nextLine();
            System.out.print("Kelas   : ");
            String Kelas = latif22.nextLine();
            System.out.print("IPK     : ");
            String InputIPK = latif22.nextLine();
            double IPK = Double.parseDouble(InputIPK);

            Mahasiswa22 m = new Mahasiswa22(NIM, Nama, Kelas, IPK);
            List.tambah(m);
        }
        //MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        // Mahasiswa22 m1 = new Mahasiswa22("123","Zidan" , "2A", 3.2);
        // Mahasiswa22 m2 = new Mahasiswa22("124", "Ayu", "2A", 3.5);
        // Mahasiswa22 m3 = new Mahasiswa22("123", "Sofi", "2A", 3.1);
        // Mahasiswa22 m4 = new Mahasiswa22("125", "Sita", "2A", 3.9);
        // Mahasiswa22 m5 = new Mahasiswa22("127", "Miki", "2A", 3.7);
        
        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting: ");
        List.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC) : ");
        List.bubleSort();
        List.tampil();

        System.out.println("Data yang sudah Terurut Menggunakan SELECTION SORT (ASC)");
        List.selectionSort();
        List.tampil();
        
        System.out.println("Data yang sudah Terurut Menggunakan INSERTION SORT (ASC)");
        List.insertionSort();
        List.tampil();

        List.tampil();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang Dicari: ");
        System.out.print("IPK: ");
        double Cari = latif22.nextDouble();
        System.out.println("--------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("---------------------");
        double posisi2 = List.findBinarySearch(Cari, 0, JmlMhs - 1);
        int pss2= (int)posisi2;
        List.tampilPosisi(Cari, pss2);
        List.tampilDataSearch(Cari, pss2);

        System.out.println("Menggunakan Sequential Searching");
        double Posisi = List.squentialSearching(Cari);
        int PSS = (int)Posisi;
        List.tampilPosisi(Cari, PSS);
        List.tampilDataSearch(Cari, PSS);
    }
}
    


