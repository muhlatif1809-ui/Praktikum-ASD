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

## 2.1.3 Pertanyaan

1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?
    - bagian method print pada perulangan diganti jadi

``` java
    yang sebelumnya
for (int i = 0; i <= top; i++)
diganti jadi
for (int i = top; i >= 0; i--)

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 1
Nama    : dila
NIM     : 1001
Kelas   : 1A
Tugas dila berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 1   
Nama    : erik
NIM     : 1002
Kelas   : 1B
Tugas erik berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 1
Nama    : tika
NIM     : 1003
Kelas   : 1C
Tugas tika berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 4
Daftar semua tugas 
Nama    NIM     Kelas 
tika    1003    1C
erik    1002    1B
dila    1001    1A
 

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 2
Menilai tugas dari tika
Masukkan nilai (0-100): 87
Nilai Tugas tika adalah 87

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 4
Daftar semua tugas 
Nama    NIM     Kelas 
erik    1002    1B
dila    1001    1A
 

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih : 5
Pilihan tidak valid. 
```

2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!
    - ada 5 data yang dapat ditampung, yaitu pada potongan kode program
``` java
 StackTugasMahasiswa22 stack = new StackTugasMahasiswa22(5);
 ```

 3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?
    - karena untuk melakukan pengecekan kondisi untuk memastikan apakah stack masih mempunyai ruang sebelum menambahkan data baru. jika tidak ada kondisi if-else maka yg terjadi yaitu akan terjadi error array index out of bounds.

4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!
    - dilakukan modifikasi pada class MahasiswaDemo22 dan class StackTugasMahasiswa22 yaitu penambahan kode berikut,
``` java
public Mahasiswa22 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }
case 5:
    Mahasiswa22 m = stack.peekBottom();
        if (m != null) {
            System.out.println("Tugas pertama dikumpulkan oleh "+m.nama);
        }
    break;
```

sehingga output yg dihasilkan yaitu sebagai berikut

``` java
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
Pilih : 1
Nama    : dila
NIM     : 1001
Kelas   : 1f
Tugas dila berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
Pilih : 1
Nama    : erik
NIM     : 1002
Kelas   : 1f
Tugas erik berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
Pilih : 1
Nama    : tika
NIM     : 1003
Kelas   : 1f
Tugas tika berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
Pilih : 3
Tugas terakhir dikumpulkan oleh tika

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
Pilih : 5
Tugas pertama dikumpulkan oleh dila

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
Pilih : 6
Pilihan tidak valid.
```

5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!
    - ditambahkan method count pada class StackTugasMahasiswa22 dan penambahan case pada class MahasiswaDemo22

sehingga output yg dihasilkan yaitu sebagai berikut

``` java
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 1
Nama    : dila
NIM     : 1001
Kelas   : 1f
Tugas dila berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 1
Nama    : erik
NIM     : 1002
Kelas   : 1f
Tugas erik berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 1
Nama    : tika
NIM     : 1003
Kelas   : 1f
Tugas tika berhasil dikumpulkan
 
Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 6
Jumlah tugas yang sudah terkumpul : 3

Menu : 
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Jumlah Tugas Terkumpul
Pilih : 7
Pilihan tidak valid. 
```

## 2.2 Percobaan 2: Konversi Nilai Tugas ke Biner

## Hasil Run
``` java
Pilih: 2
Menilai Tugas Dari tika
Masukkan Nilai (1-100): 87
Nilai Tugas tika Adalah 87
Nilai Biner Tugas: 1010111

Menu:
1. Menngumoulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar Semua Tugas
Nama    NIM     kelas
dilla   1001    1A
```

## 2.2.3 Pertanyaan
1. Jelaskan alur kerja dari method konversiDesimalKeBiner!
    - method konversiDesimalKeBiner bekerja dengan cara membagi bilangan desimal secara berulang dengan 2 dan menyimpan sisa pembagian ke dalam stack. karena stack bersifat LIFO, saat data diambil kembali menggunakan operasi pop, urutan sisa menjadi terbalik sehingga menghasilkan representasi bilangan biner yang benar.

2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!
    - akan terjadi error karena variabel kode tidak pernah di deklarasikan, kecuali variabel kode menggantikan variabel nilai, hasilnya akan tetap sama

## 2.4 Latihan Praktikum

``` java
Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 1
ID Surat: 1001   
Nama: Dilla
Kelas: 1f
Jenis Izin (S/I): i
Durasi: 1

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 1
ID Surat: 1002
Nama: Stepenn
Kelas: 1f
Jenis Izin (S/I): i
Durasi: 1

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 1   
ID Surat: 1003
Nama: Erik 
Kelas: 1f
Jenis Izin (S/I): i
Durasi: 1

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 2
Verifikasi Surat 
ID Surat        Nama    Kelas   Jenis Izin      Durasi 
1001            Dilla   1f      i               1
1002            Stepenn 1f      i               1
1003            Erik    1f      i               1
 

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 3
Surat terakhir di input pada mahasiswa  Erik

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 4
Cari nama: Stepenn
Surat ditemukan!

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 4
Cari nama: Budi
Surat tidak ditemukan!

Menu : 
1. Masukkan Data Surat
2. Memverifikasi Surat
3. Melihat Surat Teratas
4. Cari Surat Berdasarkan Nama Mahasiswa
Pilih : 5
Pilihan Tidak Valid! 
```