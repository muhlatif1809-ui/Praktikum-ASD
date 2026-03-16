package Minggu5;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner latif = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Elemen: ");
        int elemen = latif.nextInt();

        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan Keuntungan Ke- "+(i+1)+": ");
            sm.keuntungan[i] = latif.nextDouble();
        }

        System.out.println("Total Keuntungan Menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total Keuntungan Menggunkan Divide And Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen -1));
    }
}
