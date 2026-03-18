package Minggu3;

import java.util.Scanner;

public class DosenDemo22 {
    public static void main(String[] args) {
        Scanner latif = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Dosen: ");
        int JmlData = latif.nextInt();
        latif.nextLine();

        Dosen22[] arrDosen22 = new Dosen22[JmlData];

        for (int i = 0; i < JmlData; i++) {
            System.out.println("\nData Dosen ke- " + (i + 1));

            System.out.print("Kode  : ");
            String kode = latif.nextLine();

            System.out.print("Nama  : ");
            String nama = latif.nextLine();

            System.out.print("Jenis Kelamin (true = Laki-laki, false = Perempuan): ");
            boolean jk = latif.nextBoolean();

            System.out.print("Usia  : ");
            int usia = latif.nextInt();
            latif.nextLine();

            arrDosen22[i] = new Dosen22(kode, nama, jk, usia);
        }

        DataDosen22 data = new DataDosen22();

        System.out.println("\n===== Data Semua Dosen =====");
        data.dataSemuaDosen(arrDosen22);

        System.out.println("\n===== Jumlah Dosen Per Jenis Kelamin =====");
        data.jumlahDosenPerJenisKelamin(arrDosen22);

        System.out.println("\n===== Rata-rata Usia Dosen =====");
        data.rerataUsiaDosenPerJenisKelamin(arrDosen22);

        System.out.println("\n===== Dosen Paling Tua =====");
        data.infoDosenPalingTua(arrDosen22);

        System.out.println("\n===== Dosen Paling Muda =====");
        data.infoDosenPalingMuda(arrDosen22);
    }
}    

