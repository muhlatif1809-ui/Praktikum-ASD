package Minggu3;

import java.util.Scanner;

public class MataKuliahDemo22 {
    public static void main(String[] args) {
        Scanner latif22 = new Scanner(System.in);
        Matakuliah22[] arrayOfMatakuliah22 = new Matakuliah22[3];
        String kode, nama, dummy;
        int sks, JumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kliah Ke- " + (i + 1));
            System.out.print("Kode          : ");
            kode = latif22.nextLine();
            System.out.print("Nama          : ");
            nama = latif22.nextLine();
            System.out.print("SKS           : ");
            dummy = latif22.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam    : ");
            dummy = latif22.nextLine();
            JumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------");


        }
    }
}
