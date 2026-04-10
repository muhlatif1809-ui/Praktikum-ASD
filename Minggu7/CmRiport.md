|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020235|
| Nama |  Muhammad Latif Sabilis Sudur |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/muhlatif1809-ui/Praktikum-ASD.git

# JOBSHEET Studi Kasus 1

```java
package Minggu7;

import java.util.Scanner;

import Minggu5.Mahasiswa;

public class Main22 {
    static Peminjaman22CM[] pinjam;

    public static void main(String[] args) {
        Scanner latif22 = new Scanner(System.in);

        Mahasiswa22CM m1 = new Mahasiswa22CM("22001", "Andi", "Teknik Informatika");
        Mahasiswa22CM m2 = new Mahasiswa22CM("22002", "Budi", "Teknik Informatika");
        Mahasiswa22CM m3 = new Mahasiswa22CM("22003", "Citra", "Sistem Informasi Bisnis");

        Buku22CM b1 = new Buku22CM("B001", "Algoritma", 2020);
        Buku22CM b2 = new Buku22CM("B002", "Basis Data", 2019);
        Buku22CM b3 = new Buku22CM("B003", "Pemrograman", 2021);
        Buku22CM b4 = new Buku22CM("B004", "Fisika", 2024);

        pinjam = new Peminjaman22CM[] {
            new Peminjaman22CM(m1, b1, 7),
            new Peminjaman22CM(m2, b2, 3),
            new Peminjaman22CM(m3, b3, 10),
            new Peminjaman22CM(m3, b4, 6),
            new Peminjaman22CM(m1, b2, 4)
        };

        int pilih;
        do {
           
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Data Mahasiswa & Buku");
            System.out.println("2. Tampilkan Data Peminjaman");
            System.out.println("3. Hitung Denda");
            System.out.println("4. Urutkan Denda (Insertion Sort)");
            System.out.println("5. Cari berdasarkan NIM (Binary Search)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = latif22.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nData Mahasiswa:");
                    m1.tampil();
                    m2.tampil();
                    m3.tampil();

                    System.out.println("\nData Buku:");
                    b1.tampil();
                    b2.tampil();
                    b3.tampil();
                    b4.tampil();
                    break;

                case 2:
                    System.out.println("\nData Peminjaman:");
                    tampilPeminjaman();
                    break;

                case 3:
                    System.out.println("\nDenda sudah dihitung otomatis:");
                    tampilPeminjaman();
                    break;

                case 4:
                    insertionSort();
                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    tampilPeminjaman();
                    break;

                case 5:
                    insertionSortNIM();
                    System.out.print("Masukkan NIM: ");
                    String cari = latif22.next();
                    binarySearch(cari);
                    break;
            }
        } while (pilih != 0);
    }
     static void tampilPeminjaman() {
        for (Peminjaman22CM p : pinjam) {
            p.tampil();
        }
    }

    static void insertionSort() {
        for (int i = 1; i < pinjam.length; i++) {
            Peminjaman22CM temp = pinjam[i];
            int j = i - 1;

            while (j >= 0 && pinjam[j].denda < temp.denda) {
                pinjam[j + 1] = pinjam[j];
                j--;
            }
            pinjam[j + 1] = temp;
        }
    }

    static void insertionSortNIM() {
        for (int i = 1; i < pinjam.length; i++) {
            Peminjaman22CM temp = pinjam[i];
            int j = i - 1;

            while (j >= 0 && pinjam[j].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                pinjam[j + 1] = pinjam[j];
                j--;
            }
            pinjam[j + 1] = temp;
        }
    }

    static void binarySearch(String nim) {
        int left = 0, right = pinjam.length - 1;
        boolean ketemu = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            int hasil = pinjam[mid].mhs.nim.compareTo(nim);

            if (hasil == 0) {
                pinjam[mid].tampil();
                ketemu = true;
                break;
            } else if (hasil < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!ketemu) {
            System.out.println("Data tidak ditemukan");
        }
    }
}
```

## Berikut adalah hasil running program:
``` java
=== SISTEM PEMINJAMAN RUANG BACA JTI ===
1. Tampilkan Data Mahasiswa & Buku
2. Tampilkan Data Peminjaman
3. Hitung Denda
4. Urutkan Denda (Insertion Sort)
5. Cari berdasarkan NIM (Binary Search)
0. Keluar
Pilih: 1

Data Mahasiswa:
22001 | Andi | Teknik Informatika
22002 | Budi | Teknik Informatika
22003 | Citra | Sistem Informasi Bisnis

Data Buku:
B001 | Algoritma | 2020
B002 | Basis Data | 2019
B003 | Pemrograman | 2021
B004 | Fisika | 2024

=== SISTEM PEMINJAMAN RUANG BACA JTI ===
1. Tampilkan Data Mahasiswa & Buku
2. Tampilkan Data Peminjaman
3. Hitung Denda
4. Urutkan Denda (Insertion Sort)
5. Cari berdasarkan NIM (Binary Search)
0. Keluar
Pilih: 2

Data Peminjaman:
22001 | Andi | Algoritma | 7 hari | Denda: 4000
22002 | Budi | Basis Data | 3 hari | Denda: 0
22003 | Citra | Pemrograman | 10 hari | Denda: 10000
22003 | Citra | Fisika | 6 hari | Denda: 2000
22001 | Andi | Basis Data | 4 hari | Denda: 0

=== SISTEM PEMINJAMAN RUANG BACA JTI ===
1. Tampilkan Data Mahasiswa & Buku
2. Tampilkan Data Peminjaman
3. Hitung Denda
4. Urutkan Denda (Insertion Sort)
5. Cari berdasarkan NIM (Binary Search)
0. Keluar
Pilih: 3

Denda sudah dihitung otomatis:
22001 | Andi | Algoritma | 7 hari | Denda: 4000
22002 | Budi | Basis Data | 3 hari | Denda: 0
22003 | Citra | Pemrograman | 10 hari | Denda: 10000
22003 | Citra | Fisika | 6 hari | Denda: 2000
22001 | Andi | Basis Data | 4 hari | Denda: 0

=== SISTEM PEMINJAMAN RUANG BACA JTI ===
1. Tampilkan Data Mahasiswa & Buku
2. Tampilkan Data Peminjaman
3. Hitung Denda
4. Urutkan Denda (Insertion Sort)
5. Cari berdasarkan NIM (Binary Search)
0. Keluar
Pilih: 0
PS C:\Users\ReviOS\Documents\Prakdas2026> 
```