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

