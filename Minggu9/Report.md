|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020235|
| Nama |  Muhammad Latif Sabilis Sudur |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/muhlatif1809-ui/Praktikum-ASD.git

# JOBSHEET IX STACK

## 2.1 Percobaan 1: Mahasiswa Mengumpulkan Tugas
``` java
package Minggu9;

import java.util.Scanner;
import java.util.Stack;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner latif22 = new Scanner(System.in);
        StackTugasMahasiswa22 stack = new StackTugasMahasiswa22(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Menngumoulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = latif22.nextInt();
            latif22.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = latif22.nextLine();
                    System.out.print("NIM: ");
                    String nim = latif22.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = latif22.nextLine();
                    Mahasiswa22 mhs = new Mahasiswa22(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s Berhasil Dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa22 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai Tugas Dari " + dinilai.nama);
                        System.out.print("Masukkan Nilai (1-100): ");
                        int nilai = latif22.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s Adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa22 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas Terakhir Dikummpulkan Oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar Semua Tugas");
                    System.out.println("Nama\tNIM\tkelas");
                    stack.print();
                    break;
                default: 
                    System.out.println("Pilihan Tidak Valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
```

## Hasil Run
``` java

Menu:
1. Menngumoulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Dilla
NIM: 1001
Kelas: 1A
Tugas Dilla Berhasil Dikumpulkan

Menu:
1. Menngumoulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Eerik
NIM: 1002
Kelas: 1B
Tugas Eerik Berhasil Dikumpulkan

Menu:
1. Menngumoulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 3
Tugas Terakhir Dikummpulkan Oleh Eerik

Menu:
1. Menngumoulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Tika 
NIM: 1003
Kelas: 1C
Tugas Tika  Berhasil Dikumpulkan

Menu:
1. Menngumoulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar Semua Tugas
Nama    NIM     kelas
Dilla   1001    1A
Eerik   1002    1B
Tika    1003    1C


Menu:
1. Menngumoulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 2
Menilai Tugas Dari Tika 
Masukkan Nilai (1-100): 87
Nilai Tugas Tika  Adalah 87

Menu:
1. Menngumoulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar Semua Tugas
Nama    NIM     kelas
Dilla   1001    1A
Eerik   1002    1B


Menu:
1. Menngumoulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 5
Pilihan Tidak Valid.
```