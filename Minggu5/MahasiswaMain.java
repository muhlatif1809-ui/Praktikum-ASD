package Minggu5;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner latif = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int JumlahMhs = latif.nextInt();
        latif.nextLine();

        Mahasiswa [] data = new Mahasiswa [JumlahMhs];

        for (int i = 0; i < JumlahMhs; i++) {
            System.out.println("\nData Mahasiswa Ke- "+(i + 1));
            System.out.print("Nama          : ");
            String nama = latif.nextLine();
            System.out.print("NIM           : ");
            String nim = latif.nextLine();
            System.out.print("Tahun Masuk   : ");
            int tahun = latif.nextInt();
            System.out.print("Nilai UTS     : ");
            int NUTS = latif.nextInt();
            System.out.print("Nilai UAS     : ");
            int NUAS = latif.nextInt();
            latif.nextLine();

            data[i] = new Mahasiswa(nama, nim, tahun, NUTS, NUAS);
        }

        NilaiMhs hitung = new NilaiMhs();

        double maxUTS = hitung.utsTertinggi(data, 0, data.length-1);
        double minUTS = hitung.utsTerendah(data, 0, data.length-1);
        double rataUas = hitung.rataUas(data);
        // double maxUTS = hitung.utsTertinggi(data, 0, data.length-1);
        // double minUTS = hitung.utsTerendah(data, 0, data.length-1);
        // double rataUas = hitung.rataUas(data);

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("UTS Tertinggi : "+maxUTS);
        System.out.println("UTS Terendah : "+minUTS);
        System.out.println("Rata-rata UAS : "+ rataUas);
    }
}
