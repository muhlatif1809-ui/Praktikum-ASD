package Minggu1;

import java.util.Scanner;

public class Perulangan {
public static void main(String[] args) {
    Scanner latif23 = new Scanner(System.in);
    int nim, n = 0;

    System.out.print("Masukkan 2 Angka Nim Terakhir Anda :");
        n = latif23.nextInt();

        while (n < 10) {
            System.out.println(n += 10);
        }
        for (int i = 1; i < n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("#");
            }else if (i % 2 == 0) {
                System.out.print(i);
            } else{
                System.out.print("*");
            }
        }
    }

    // nim 35
}
   
