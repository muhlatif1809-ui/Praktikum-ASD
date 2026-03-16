package Minggu1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
    Scanner latif = new Scanner(System.in);

    double tugas, kuis, uts, uas;
    double nilaiAkhirTugas;
    double nilaiAkhirKuis;
    double nilaiAkhirUts;
    double nilaiAkhirUas;
    double nilaiAkhir;
    String nilaiHuruf = "";

    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("=========================");

    System.out.print("Masukkan Nilai Tugas: ");
    tugas = latif.nextDouble();
    System.out.print("Masukkan Nilai Kuis: ");
    kuis = latif.nextDouble();
    System.out.print("Masukkan Nilai UTS: ");
    uts = latif.nextDouble();
    System.out.print("Masukkan Nilai UAS: ");
    uas = latif.nextDouble();

    System.out.println("=========================");
    System.out.println("=========================");

    if (tugas <= 100 && tugas >= 0 && kuis <= 100 && kuis >= 0 && uts <= 100 && uts >= 0 && uas <= 100 && uas >= 0) {
            nilaiAkhirTugas = 0.20 * tugas;
            nilaiAkhirKuis = 0.20 * kuis;
            nilaiAkhirUts = 0.30 * uts;
            nilaiAkhirUas = 0.40 * uas;

            nilaiAkhir = nilaiAkhirTugas + nilaiAkhirKuis + nilaiAkhirUts + nilaiAkhirUas;
            System.out.print("Nilai akhir : " + nilaiAkhir);
            System.out.println();

            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else if (nilaiAkhir <= 39) {
                nilaiHuruf = "E";
            }
            System.out.print("Nilai Huruf : " + nilaiHuruf);
            System.out.println();

        } else {
            System.out.println("nilai tidak valid!");
        }

        System.out.println("=========================");
        System.out.println("=========================");

        if (nilaiHuruf == "A" || nilaiHuruf == "B+" || nilaiHuruf == "B" || nilaiHuruf == "C+" || nilaiHuruf == "C") {
            System.out.println("SELAMAT ANDA LULUS!!");
        } else if (nilaiHuruf == "D" || nilaiHuruf == "E"){
            System.out.println("MOHON MAAF ANDA TIDAK LULUS!!");
        }

    }
}

