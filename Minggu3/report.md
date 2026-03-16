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