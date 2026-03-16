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
