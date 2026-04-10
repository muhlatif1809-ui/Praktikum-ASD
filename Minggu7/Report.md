|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020235|
| Nama |  Muhammad Latif Sabilis Sudur |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/muhlatif1809-ui/Praktikum-ASD.git

# Jobsheet 6 SEARCHING

## 6.2.1. Langkah-langkah Percobaan Sequential Search

``` java
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

        System.out.println("Menggunakan Sequential Searching");
        double Posisi = List.squentialSearching(Cari);
        int PSS = (int)Posisi;
        List.tampilPosisi(Cari, PSS);
        List.tampilDataSearch(Cari, PSS);
    }
}
```
## 6.2.2. Verifikasi Hasil Percobaan   

``` java
Masukkan Data Nahasiswa Ke-1
NIM     : 111
Nama    : Adi
Kelas   : 2
IPK     : 3.6
Masukkan Data Nahasiswa Ke-2
NIM     : 222
Nama    : Tio
Kelas   : 2
IPK     : 3.8
Masukkan Data Nahasiswa Ke-3
NIM     : 333
Nama    : Ila
Kelas   : 2
IPK     : 3.0
Masukkan Data Nahasiswa Ke-4
NIM     : 444
Nama    : Lia  
Kelas   : 2
IPK     : 3.5
Masukkan Data Nahasiswa Ke-5
NIM     : 555
Nama    : Fia
Kelas   : 2
IPK     : 3.3

Nama: Ila
NIM: 333
Kelas: 2
IPK: 3.0
-----------------
Nama: Fia
NIM: 555
Kelas: 2
IPK: 3.3
-----------------
Nama: Lia
NIM: 444
Kelas: 2
IPK: 3.5
-----------------
Nama: Adi
NIM: 111
Kelas: 2
IPK: 3.6
-----------------
Nama: Tio
NIM: 222
Kelas: 2
Kelas: 2
IPK: 3.3
-----------------
Nama: Lia
NIM: 444
Kelas: 2
IPK: 3.5
-----------------
-----------------------------------------------------------
Pencarian Data
-----------------------------------------------------------
Masukkan IPK Mahasiswa yang Dicari:
IPK: 3.5
Menggunakan Sequential Searching
Data Mahasiswa Dengan IPk: 3.5 Ditemukan Pada Indeks 2
niat     : 444
Nama     : Lia
Kelas    : 2
Ipk      : 3.5
PS C:\Users\ReviOS\Documents\Prakdas2026>
```

## 6.2.3. Pertanyaan

1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
    - tampilPosisi hanya menampilkan informasi posisi/indeks di mana data ditemukan, tanpa menampilkan detail datanya. Contoh output: "data mahasiswa dengan IPK : 3.5 ditemukan pada indeks 3".
    - Sedangkan tampilDataSearch menampilkan detail lengkap data mahasiswa (nim, nama, kelas, ipk) yang ditemukan pada indeks tersebut. Keduanya sama-sama menerima parameter pos untuk mengecek apakah data ditemukan (pos != -1) atau tidak.

2.  Jelaskan fungsi break pada kode program di bawah ini! 
    - break berfungsi untuk menghentikan perulangan for lebih awal begitu data yang dicari sudah ditemukan. Tanpa break, loop akan terus berjalan hingga elemen terakhir meskipun data sudah ketemu, yang berarti membuang waktu komputasi. Dengan break, program langsung keluar dari loop sehingga lebih efisien.

3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
    - Variabel pos berfungsi sebagai penanda lokasi (indeks array) di mana data yang dicari ditemukan. Nilai awalnya -1 sebagai tanda bahwa data belum/tidak ditemukan. Jika data ditemukan, pos diisi dengan nilai indeks j tempat data tersebut berada. Nilai pos ini kemudian digunakan oleh method tampilPosisi dan tampilDataSearch untuk menentukan apakah data berhasil ditemukan atau tidak, serta untuk mengakses elemen listMhs[pos].

4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.
    - Akan menampilkan data yang pertama kali ditemukan (indeks terkecil). Karena pada sequential search loop berjalan dari indeks 0 ke atas, dan begitu data pertama yang cocok ditemukan langsung dieksekusi break sehingga loop berhenti. Data kedua yang nilainya sama tidak akan pernah dicapai.

5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari
kode di atas?
   - Jika break dihapus, loop akan terus berjalan hingga elemen terakhir meskipun data sudah ditemukan di tengah. Akibatnya, jika ada lebih dari satu data dengan nilai IPK yang sama, variabel posisi akan terus ditimpa (overwrite) dengan indeks yang lebih baru. Sehingga hasil akhirnya bukan data pertama yang ditemukan, melainkan data terakhir yang memiliki nilai sama. Selain itu, performa menjadi lebih buruk karena tidak ada early exit.

## 6.3.1. Langkah-langkah Percobaan Binary Search
```java
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
```    

## 6.3.2. Verifikasi Hasil Percobaan

```java
Masukkan Data Nahasiswa Ke-1
NIM     : 111
Nama    : Adi
Kelas   : 2
IPK     : 3.1
Masukkan Data Nahasiswa Ke-2
NIM     : 222
Nama    : Ila
Kelas   : 2
IPK     : 3.2
Masukkan Data Nahasiswa Ke-3
NIM     : 333
Nama    : Lia
Kelas   : 2
IPK     : 3.3
Masukkan Data Nahasiswa Ke-4
NIM     : 444
Nama    : Susi
Kelas   : 2
IPK     : 3.5
Masukkan Data Nahasiswa Ke-5
NIM     : 555
Nama    : Anita
Kelas   : 2
IPK     : 3.7
-----------------
Nama: Adi
NIM: 111
Kelas: 2
IPK: 3.1
-----------------
Nama: Ila
NIM: 222
Kelas: 2
IPK: 3.2
-----------------
Nama: Lia
NIM: 333
Kelas: 2
IPK: 3.3
-----------------
Nama: Susi
NIM: 444
Kelas: 2
IPK: 3.5
-----------------
Nama: Anita
NIM: 555
Kelas: 2
IPK: 3.7
-----------------
-----------------------------------------------------------
Pencarian Data
-----------------------------------------------------------
Masukkan IPK Mahasiswa yang Dicari:
IPK: 3.7
--------------------
Menggunakan Binary Search
---------------------
Data Mahasiswa Dengan IPk: 3.7 Ditemukan Pada Indeks 4
niat     : 555
Nama     : Anita
Kelas    : 2
Ipk      : 3.7
PS C:\Users\ReviOS\Documents\Prakdas2026> 
```
## 6.3.3. Pertanyaan

1. Tunjukkan pada kode program yang mana proses divide dijalankan!
```java
 mid = (left + right) / 2
```

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
``` java
else if (listMhs[mid].ipk > cari) {
        return findBinarySearch(cari, left, mid - 1);  // cari di bagian kiri
    } else {
        return findBinarySearch(cari, mid + 1, right); // cari di bagian kanan
    }
```

3. Apa fungsi left, right, dan mid?
    - left → batas indeks paling kiri dari rentang array yang sedang ditelusuri. Awalnya bernilai 0.
    - right → batas indeks paling kanan dari rentang array yang sedang ditelusuri. Awalnya bernilai n-1.
    - mid → indeks tengah yang dihitung dari (left + right) / 2. Digunakan sebagai titik perbandingan untuk menentukan apakah pencarian dilanjutkan ke kiri atau ke kanan.


4.  Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian?
   - Program tetap bisa berjalan (tidak error), namun hasilnya bisa salah atau data tidak ditemukan meskipun sebenarnya ada. Binary search mengasumsikan data sudah terurut. Jika tidak urut, logika perbandingan left dan right yang mempersempit rentang pencarian menjadi tidak valid — program bisa "salah arah" membuang sisi yang justru berisi data yang dicari, sehingga mengembalikan -1 (tidak ditemukan) secara keliru. 
5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen
yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka
ubahlah kode program binary seach agar hasilnya sesuai
   - Hasilnya tidak akan ditemukan (return -1). Karena kode asli mengasumsikan data urut ascending, sedangkan data dimasukkan secara descending. Pada kondisi ini ketika listMhs[mid].ipk > cari, program akan mencari ke kiri — padahal data yang lebih kecil justru ada di kanan.
``` java
int findBinarySearch(double cari, int left, int right) {
    int mid;
    if (right >= left) {
        mid = (left + right) / 2;
        if (cari == listMhs[mid].ipk) {
            return mid;
        } else if (listMhs[mid].ipk < cari) {
            // data descending: yang lebih besar ada di KIRI
            return findBinarySearch(cari, left, mid - 1);
        } else {
            // yang lebih kecil ada di KANAN
            return findBinarySearch(cari, mid + 1, right);
        }
    }
    return -1;
        }
```

6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam
array
   - Binary search menentukan data tidak ditemukan ketika kondisi right >= left tidak lagi terpenuhi, yaitu saat right < left. Ini berarti rentang pencarian sudah habis dipersempit hingga tidak ada elemen tersisa untuk diperiksa, namun tidak ada yang cocok. Pada titik itu fungsi mengembalikan nilai -1 sebagai tanda data tidak ada dalam array 

7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan
dari keyboard.
``` java
System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi27 list = new MahasiswaBerprestasi27(jumlah)
```






