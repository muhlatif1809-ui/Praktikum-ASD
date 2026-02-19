package Minggu1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner latif = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        String matkul[] = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        double nilaiAngka[] = new double[matkul.length];
        int sks[] = { 2, 2, 3, 2, 2, 2, 2, 2, 2 };

        double totalNilai = 0;
        int totalSks = 0;

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + matkul[i] + ": ");
            nilaiAngka[i] = latif.nextDouble();
            latif.nextLine();
        }

        System.out.println("======================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("======================");

        System.out.printf("%-40s %-12s %-12s %-12s\n",  "MK", "Nilai Angka", "Nilai Huruf", "Bobot");

        for (int i = 0; i < matkul.length; i++) {

            String nilaiHuruf = "";
            double bobotNilai = 0;

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf = "A";
                bobotNilai = 4;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf = "B+";
                bobotNilai = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf = "B";
                bobotNilai = 3;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf = "C+";
                bobotNilai = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf = "C";
                bobotNilai = 2;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf = "D";
                bobotNilai = 1;
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf = "E";
                bobotNilai = 0;
            }

            totalNilai += bobotNilai * sks[i];
            totalSks += sks[i];

            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                        matkul[i], nilaiAngka[i], nilaiHuruf, bobotNilai);

        }

        System.out.println("===========================");
        double ip = totalNilai / totalSks;
        System.out.println("IP : "+String.format("%.2f", ip));
    }

}