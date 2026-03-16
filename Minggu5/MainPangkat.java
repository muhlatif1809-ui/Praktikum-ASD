package Minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner latif = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen: ");
        int elemen = latif.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Nilai Basis Elemen Ke- "+ (i+1)+": ");
            int basis = latif.nextInt();
            System.out.print("Masukkan Nilai Pangkat Elemen Ke- "+(i+1)+": ");
            int pangkat = latif.nextInt();
            png[i] = new Pangkat(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (Pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for (Pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
