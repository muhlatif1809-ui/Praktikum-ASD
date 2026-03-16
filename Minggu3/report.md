|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020235|
| Nama |  Muhammad Latif Sabilis Sudur |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/muhlatif1809-ui/Praktikum-ASD.git

# Jobsheet 3 ARRAY OF OBJECTS

## 3.2.1 Percobaan 1 & Hasil Percobaan

``` java 
package Minggu3;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Mahasiswa22[] arrayofMahasiswa22 = new Mahasiswa22[3];
        arrayofMahasiswa22[0] = new Mahasiswa22();
        arrayofMahasiswa22[0] .nim = "24410706033";
        arrayofMahasiswa22[0] .nama = "AGNES TITANIA KINANTI";
        arrayofMahasiswa22[0] .kelas ="SIB-1E";
        arrayofMahasiswa22[0] .ipk = (float) 3.75;

        arrayofMahasiswa22[1] = new Mahasiswa22();
        arrayofMahasiswa22[1] .nim = "2341720172";
        arrayofMahasiswa22[1] .nama = "ACHMAD MAULANA HAMZAH";
        arrayofMahasiswa22[1] .kelas ="TI-2A";
        arrayofMahasiswa22[1] .ipk = (float) 3.36;

        arrayofMahasiswa22[2] = new Mahasiswa22();
        arrayofMahasiswa22[2] .nim = "244107023006";
        arrayofMahasiswa22[2] .nama = "DIRHAMWAN PUTRANTO";
        arrayofMahasiswa22[2] .kelas ="TI-2E";
        arrayofMahasiswa22[2] .ipk = (float) 3.80;

        System.out.println("NIM    : "+arrayofMahasiswa22[0].nim);
        System.out.println("Nama   : "+arrayofMahasiswa22[0].nama);
        System.out.println("Kelas  : "+arrayofMahasiswa22[0].kelas);
        System.out.println("IPK    : "+arrayofMahasiswa22[0].ipk);

        System.out.println("--------------------------------------");

        System.out.println("NIM    : "+arrayofMahasiswa22[1].nim);
        System.out.println("Nama   : "+arrayofMahasiswa22[1].nama);
        System.out.println("Kelas  : "+arrayofMahasiswa22[1].kelas);
        System.out.println("IPK    : "+arrayofMahasiswa22[1].ipk);

        System.out.println("--------------------------------------");

        System.out.println("NIM    : "+arrayofMahasiswa22[2].nim);
        System.out.println("Nama   : "+arrayofMahasiswa22[2].nama);
        System.out.println("Kelas  : "+arrayofMahasiswa22[2].kelas);
        System.out.println("IPK    : "+arrayofMahasiswa22[2].ipk);

        System.out.println("--------------------------------------");



    }
}

NIM    : 24410706033
Nama   : AGNES TITANIA KINANTI
Kelas  : SIB-1E
IPK    : 3.75
--------------------------------------
NIM    : 2341720172
Nama   : ACHMAD MAULANA HAMZAH
Kelas  : TI-2A
IPK    : 3.36
--------------------------------------
NIM    : 244107023006
Nama   : DIRHAMWAN PUTRANTO
Kelas  : TI-2E
IPK    : 3.8
--------------------------------------
```

## 3.2.3 Pertanyaan
 
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method Jelaskan!

    - Tidak, class yang akan dibuat di array of object tidak harus memiliki atribut dan sekaligus method, karena array of object hanya butuh tipe class, sedangkan atribut dan method adalah isi dari class. Selama class bisa dibuat objeknya (new), array tetap bisa dibuat

2. Apa yang dilakukan oleh kode program berikut?

    - membuat arrayOfMahasiswa yang dapat menampung 3 objek Mahasiwa

3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?

    - Tidak, tetap bisa dilakukan pemanggilan kosntruktor karena java otomatis menyediakan default constructor karena itu new Mahasiswa () tetap bisa dijalankan.

4. Apa yang dilakukan oleh kode program berikut?

    - Mengisi elemen array, dengan menginstansiasi objek mahasiswa

5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?

    - Class mahasiswa hanya bertugas untuk mendefinisikan objek mahasiswa sedangkan mahasiswaDemo bertugas untuk menjalankan dan mengetes class mahasiswa

## 3.3.1 Percobaan 2 & Hasil Percobaan 

``` java 
package Minggu3;

import java.util.Scanner;

public class MahasiswaDemo22Mod {
    public static void main(String[] args) {
        Scanner latif22 = new Scanner(System.in);
        Mahasiswa22[] arrayOfMahasiswa22 = new Mahasiswa22[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa22[i] = new Mahasiswa22();

            System.out.println("Masukkan Data Mahasiswa Ke- "+ (i + 1));
            System.out.print("NIM       : ");
            arrayOfMahasiswa22[i].nim = latif22.nextLine();
            System.out.print("Nama      : ");
            arrayOfMahasiswa22[i].nama = latif22.nextLine();
            System.out.print("Kelas     : ");
            arrayOfMahasiswa22[i].kelas = latif22.nextLine();
            System.out.print("IPK       : ");
            dummy = latif22.nextLine();
            arrayOfMahasiswa22[i].ipk = Float.parseFloat(dummy);
            System.out.println("--------------------------------");
        }


            for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke- "+(i + 1));
            System.out.println("NIM    : "+ arrayOfMahasiswa22[i].nim);
            System.out.println("Nama   : "+ arrayOfMahasiswa22[i].nama);
            System.out.println("Kelas  : "+ arrayOfMahasiswa22[i].kelas);
            System.out.println("IPK    : "+ arrayOfMahasiswa22[i].ipk);

            System.out.println("--------------------------------------");
            }
           
        

    }
}

Masukkan Data Mahasiswa Ke- 1
NIM       : 123048983
Nama      : Muhammad Latif 
Kelas     : TI - 1F
IPK       : 3.9
--------------------------------
Masukkan Data Mahasiswa Ke- 2
NIM       : 12320489
Nama      : Muhammad Stepen
Kelas     : TI - 1F
IPK       : 3.8
--------------------------------
Masukkan Data Mahasiswa Ke- 3
NIM       : 23989719
Nama      : Stepen
Kelas     : TI - 1F
IPK       : 3.88
--------------------------------
Data Mahasiswa ke- 1
NIM    : 123048983
Nama   : Muhammad Latif
Kelas  : TI - 1F
IPK    : 3.9
--------------------------------------
Data Mahasiswa ke- 2
NIM    : 12320489
Nama   : Muhammad Stepen
Kelas  : TI - 1F
IPK    : 3.8
--------------------------------------
Data Mahasiswa ke- 3
NIM    : 23989719
Nama   : Stepen
Kelas  : TI - 1F
IPK    : 3.88
--------------------------------------
```
## 3.3.3 Pertanyaan

1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3.

``` java
package Minggu3;

public class Mahasiswa22 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    void cetakInfo (){
        System.out.println("NIM     : "+nim);
        System.out.println("Nama    : "+nama);
        System.out.println("Kelas   : "+kelas);
        System.out.println("IPK     : "+ipk);
    }
}
```
``` java
 for (int i = 0; i < 3; i++) {
            System.out.print("Data Mahasiswa Ke - "+ (i + 1));
            arrayOfMahasiswa22[i].cetakInfo();
```

2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?

    - Karena array myArrayOfMahasiswa hanya dibuat sebagai tempat penyimpanan objek, tetapi objek Mahasiswa pada indeks array belum diinisialisasi, sehingga menyebabkan error