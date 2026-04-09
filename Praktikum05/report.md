|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020235|
| Nama |  Muhammad Latif Sabilis Sudur |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/muhlatif1809-ui/Praktikum-ASD.git

# Jobsheet 5 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

## 5.2 Praktikum 1 - Mengimplementasikan Sorting menggunakan objec

``` java
package Praktikum05;

public class SoertingMain22 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};

        Sorting22 dataurut1 = new Sorting22(a, a.length);
        
        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubleSort();
        System.out.println("Data Sudah Diurutkan Dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
    }
}

Data Awal 1
20 10 2 7 12
Data Sudah Diurutkan Dengan BUBBLE SORT (ASC)
2 7 10 12 20
PS C:\Users\ReviOS\Documents\Prakdas2026>

package Praktikum05;

public class SoertingMain22 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};

        Sorting22 dataurut1 = new Sorting22(a, a.length);

        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubleSort();
        System.out.println("Data Sudah Diurutkan Dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        Sorting22 dataurut2 = new Sorting22(a, a.length);

        System.out.println("Data Awal 2");
        dataurut2.tampil();
        dataurut2.bubleSort();
        System.out.println("Data Sudah Diurutkan Dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
    }
}

Data Awal 1
20 10 2 7 12
Data Sudah Diurutkan Dengan BUBBLE SORT (ASC)
2 7 10 12 20
Data Awal 2
20 10 2 7 12
Data Sudah Diurutkan Dengan SELECTION SORT (ASC)
2 7 10 12 20
PS C:\Users\ReviOS\Documents\Prakdas2026> 
```

## 5.2.5 Pertanyaan!

1. Jelaskan fungsi kode program berikut
  
    - Digunakan untuk menempatkan nilai temp ke posisi yang benar setelah proses pergeseran selesai.

2. Tunjukkan kode pencarian nilai minimum pada selection sort!

    - int min = i;
for (int j = i + 1; j < jumData; j++) {
    if (data[j] < data[min]) {
        min = j;
    }
}

3. Pada insertion sort, jelaskan kondisi perulangan!
    
    - Kondisi tersebut berarti:

j > 0 → memastikan indeks tidak keluar dari array
data[j-1] > temp → membandingkan apakah data sebelumnya lebih besar

Jika kondisi terpenuhi, maka data akan digeser ke kanan.

4. Tujuan perintah berikut pada insertion sort!
    
    - Digunakan untuk menempatkan nilai temp ke posisi yang benar setelah proses pergeseran selesai.
 

## 5.3.2 Langkah-langkah Praktikum 2
``` java
package Praktikum05;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        Mahasiswa22 m1 = new Mahasiswa22("123","Zidan" , "2A", 3.2);
        Mahasiswa22 m2 = new Mahasiswa22("124", "Ayu", "2A", 3.5);
        Mahasiswa22 m3 = new Mahasiswa22("123", "Sofi", "2A", 3.1);
        Mahasiswa22 m4 = new Mahasiswa22("125", "Sita", "2A", 3.9);
        Mahasiswa22 m5 = new Mahasiswa22("127", "Miki", "2A", 3.7);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Disortir: ");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Soertir Berdasarkan IPK (DESC)");
        list.bubleSort();
        list.tampil();
    }    
}

Data Mahasiswa Sebelum Disortir: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------
Nama: Sofi
NIM: 123
Kelas: 2A
IPK: 3.1
-----------------
Nama: Sita
NIM: 125
Kelas: 2A
IPK: 3.9
-----------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------
Data Mahasiswa Setelah Soertir Berdasarkan IPK (DESC)
Nama: Sita
NIM: 125
Kelas: 2A
IPK: 3.9
-----------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------
Nama: Sofi
NIM: 123
Kelas: 2A
IPK: 3.1
-----------------
PS C:\Users\ReviOS\Documents\Prakdas2026> 
```

## 5.3.5 Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)

``` java
package Praktikum05;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        Mahasiswa22 m1 = new Mahasiswa22("123","Zidan" , "2A", 3.2);
        Mahasiswa22 m2 = new Mahasiswa22("124", "Ayu", "2A", 3.5);
        Mahasiswa22 m3 = new Mahasiswa22("123", "Sofi", "2A", 3.1);
        Mahasiswa22 m4 = new Mahasiswa22("125", "Sita", "2A", 3.9);
        Mahasiswa22 m5 = new Mahasiswa22("127", "Miki", "2A", 3.7);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Disortir: ");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Soertir Berdasarkan IPK (DESC)");
        list.bubleSort();
        list.tampil();

        list.selectionSort();
        System.out.println("\nSetelah Selection Sort (ASC):");
        list.tampil();
    }    
}

Data Mahasiswa Sebelum Disortir: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------
Nama: Sofi
NIM: 123
Kelas: 2A
IPK: 3.1
-----------------
Nama: Sita
NIM: 125
Kelas: 2A
IPK: 3.9
-----------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------
Data Mahasiswa Setelah Soertir Berdasarkan IPK (DESC)
Nama: Sita
NIM: 125
Kelas: 2A
IPK: 3.9
-----------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------
Nama: Sofi
NIM: 123
Kelas: 2A
IPK: 3.1
-----------------

Setelah Selection Sort (ASC):
Nama: Sofi
NIM: 123
Kelas: 2A
IPK: 3.1
-----------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------
Nama: Sita
NIM: 125
Kelas: 2A
IPK: 3.9
-----------------
PS C:\Users\ReviOS\Documents\Prakdas2026> 
```

## 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

``` java
package Praktikum05;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        MahasiswaBerprestasi22 list = new MahasiswaBerprestasi22();
        Mahasiswa22 m1 = new Mahasiswa22("123","Zidan" , "2A", 3.2);
        Mahasiswa22 m2 = new Mahasiswa22("124", "Ayu", "2A", 3.5);
        Mahasiswa22 m3 = new Mahasiswa22("123", "Sofi", "2A", 3.1);
        Mahasiswa22 m4 = new Mahasiswa22("125", "Sita", "2A", 3.9);
        Mahasiswa22 m5 = new Mahasiswa22("127", "Miki", "2A", 3.7);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Disortir: ");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Soertir Berdasarkan IPK (DESC)");
        list.bubleSort();
        list.tampil();

        list.selectionSort();
        System.out.println("\nSetelah Selection Sort (ASC):");
        list.tampil();

        list.insertionSort();
        System.out.println("\nSetelah Insertion Sort (ASC):");
        list.tampil();
    }    
}

Data Mahasiswa Sebelum Disortir: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------
Nama: Sofi
NIM: 123
Kelas: 2A
IPK: 3.1
-----------------
Nama: Sita
NIM: 125
Kelas: 2A
IPK: 3.9
-----------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------
Data Mahasiswa Setelah Soertir Berdasarkan IPK (DESC)
Nama: Sita
NIM: 125
Kelas: 2A
IPK: 3.9
-----------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------
Nama: Sofi
NIM: 123
Kelas: 2A
IPK: 3.1
-----------------

Setelah Selection Sort (ASC):
Nama: Sofi
NIM: 123
Kelas: 2A
IPK: 3.1
-----------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------
Nama: Sita
NIM: 125
Kelas: 2A
IPK: 3.9
-----------------

Setelah Insertion Sort (ASC):
Nama: Sofi
NIM: 123
Kelas: 2A
IPK: 3.1
-----------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-----------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-----------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-----------------
Nama: Sita
NIM: 125
Kelas: 2A
IPK: 3.9
-----------------
PS C:\Users\ReviOS\Documents\Prakdas2026> 
```

## 5.5 Latihan Praktikum
``` java
package Praktikum05;

import java.util.Scanner;

public class DosenDemo22 {
    public static void main(String[] args) {
     Scanner latif22 = new Scanner(System.in);
        DataDosen22 list = new DataDosen22();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda → Tertua)");
            System.out.println("4. Sorting DSC (Tertua → Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = latif22.nextInt();
            latif22.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode   : ");
                    String kd = latif22.nextLine();
                    System.out.print("Nama   : ");
                    String nm = latif22.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = latif22.nextBoolean();
                    System.out.print("Usia   : ");
                    int usia = latif22.nextInt();

                    list.tambah(new Dosen22(kd, nm, jk, usia));
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data sudah diurutkan ASC");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data sudah diurutkan DSC");
                    list.tampil();
                    break;
            }

        } while (pilih != 5);

        latif22.close();
    }
}

=== MENU ===
1. Tambah Data Dosen
2. Tampil Data
3. Sorting ASC (Termuda ? Tertua)
4. Sorting DSC (Tertua ? Termuda)
5. Keluar
Pilih: 
```