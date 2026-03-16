|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020235|
| Nama |  Muhammad Latif Sabilis Sudur |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/muhlatif1809-ui/Praktikum-ASD.git

# Jobsheet 5 BRUTE FORCE DAN DIVIDE CONQUER

## 5.2 Percobaan 1 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

Hasil Run:
``` java
Masukkan Nilai: 5
Nilai Faktorial 5 Menggunakan BF: 120
Nilai Faktorial 5 Menggunakan DC: 120
```

## 5.2.1 Pertanyaan Percobaan 1

1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else! 
    - if digunakan untuk menentukan kondisi agar rekursi berhenti, sedangkan else digunakan untuk   melakukan proses pembagian masalah (divide) dan memanggil fungsi kembali

2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan! 

``` java
    int fakto = 1;
    int i = 1;
    while (i <= n) {
        fakto = fakto *i;
        i++;
    }
    return fakto;

    Masukkan Nilai: 5
    Nilai Faktorial 5Menggunakan BF: 120
    Nilai Faktorial 5Menggunakan DC: 120
```
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
    - fakto *= i; menghitung faktorial dengan menggunakan perulangan, operator *= berfungsi untuk   mengalikan nilai variabel dengan nilai lain lalu menyimpannya kembali ke variabel tsb. sedangkan fakto = n * faktorialDC(n-1); menghitung faktorial dengan rekursi (divide and conquer), nilai n dikalikan dengan hasil dari pemanggilan fungsi faktorialDC (n-1)

4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!
    - method faktorialBF () menghitung faktorial dengan perkalian berulang menggunakan perulangan (loop) dari 1 sampai n. sedangkan faktorialDC() menghitung faktorial dengan memanggil fungsi secara rekursif dari n hingga mencapai kondisi dasar, lalu hasilnya dikalikan kembali sampai ke nilai awal

## 5.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer

Hasil Run :

``` java
Masukkan Jumlah Elemen: 3
Masukkan Nilai Basis Elemen Ke- 1: 2
Masukkan Nilai Pangkat Elemen Ke- 1: 3
Masukkan Nilai Basis Elemen Ke- 2: 4
Masukkan Nilai Pangkat Elemen Ke- 2: 5
Masukkan Nilai Basis Elemen Ke- 3: 6
Masukkan Nilai Pangkat Elemen Ke- 3: 7
HASIL PANGKAT BRUTEFORCE: 
2^3: 8
4^5: 1024
6^7: 279936
HASIL PANGKAT DIVIDE AND CONQUER: 
2^3: 8
4^5: 1024
6^7: 279936
```

## 5.3.1 Pertanyaan

1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
    - pangkatBF() menghitung perpangkatan dengan cara perkalian berulang menggunakan perulangan (loop) dari 1 sampai nilai pangkat. setiap iterasi mengalikan nilai basis dengan hasil sebelumnya sampai pangkat tercapai.
    - pangkatDC() menghitung perpangkatan dengan cara membagi masalah menjadi lebih kecil menggunakan rekursi. nilai pangkat dibagi menjadi setengah (n/2), kemudian hasilnya dikalikan kembali hingga mendapatkan hasil akhir.
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
    - Sudah 
``` java
    return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
    return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
```
3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?

``` java
    perubahan di method pangkatBF()
    int pangkatBF (){
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil = hasil*nilai;
        }
        return hasil;
    }
    perubahan di MainPangkat
    System.out.println(p.nilai+ "^"+p.pangkat+": "+p.pangkatBF());
```
4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
    - method pangkatBF() bekerja dengan cara mengalikan nilai basis secara berulang menggunakan perulangan sampai jumlah perkalian sesuai dengan nilai pangkat. sedangkan pangkatDC() bekerja dengan cara membagi perhitungan pangkat menjadi bagian yang lebih kecil menggunakan rekursi, kemudian menggabungkan kembali hasilnya sampai mendapatkan hasil akhir.

## 5.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conque

Hasil Run : 

``` java
    Masukkan Jumlah Elemen: 5
    Masukkan Keuntungan Ke- 1: 10
    Masukkan Keuntungan Ke- 2: 20
    Masukkan Keuntungan Ke- 3: 30 f
    Masukkan Keuntungan Ke- 4: 40 f
    Masukkan Keuntungan Ke- 5: 50
    Total Keuntungan Menggunakan Bruteforce: 150.0
    Total Keuntungan Menggunkan Divide And Conquer: 150.0
```


