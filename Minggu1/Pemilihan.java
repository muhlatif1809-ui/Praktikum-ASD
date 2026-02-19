package Minggu1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner latif23 = new Scanner(System.in);
        int nilai =0;
        int nilaiTugas,nilaiKuis,nilaiUTS,nilaiUAS;
        double nilaiTugasAkhir = 0, nilaiKuisAkhir = 0, nilaiUTSAkhir = 0,nialiUASAkhir = 0;
        String nilaiHuruf = "";

        System.out.println("Program Menghitung NIlai Akhir ");
        System.out.println("=========================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = latif23.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = latif23.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = latif23.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = latif23.nextInt();

        System.out.println("=========================");
        System.out.println("=========================");


        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai Tidak Valid ");
        } else if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai Tidak Valid ");
        } else if (nilaiUTS < 0 || nilaiUTS > 100) {
            System.out.println("Nilai Tidak Valid");
        } else if (nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai Tidak Valid ");
        }
        if (nilaiTugas <= 100 && nilaiTugas >= 0 && nilaiKuis <= 100 && nilaiKuis >= 0 && nilaiUTS <= 100 && nilaiUTS >= 0 && nilaiUAS <= 100 && nilaiUAS >= 0 ) {
            nilaiTugasAkhir = 0.20 * nilaiTugas;
            nilaiKuisAkhir = 0.20 * nilaiKuis;
            nilaiUTSAkhir = 0.30 * nilaiUTS;
            nialiUASAkhir = 0.40 * nilaiUAS;
        }
        
        double nilaiAkhir = nilaiTugasAkhir + nilaiKuisAkhir + nilaiUTSAkhir + nialiUASAkhir;
        System.out.println("NIlai Akhir: "+nilaiAkhir);

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir < 79 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir < 65 && nilaiAkhir <= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir < 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir < 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
        }

        System.out.println("NIlai Huruf: "+ nilaiHuruf);
        
        System.out.println("=========================");
        System.out.println("=========================");
    }
}

