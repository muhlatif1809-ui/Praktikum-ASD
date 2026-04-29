package Minggu9;

import java.util.Scanner;
import java.util.Stack;

public class MahasiswaDemo22 {
    public static void main(String[] args) {
        Scanner latif22 = new Scanner(System.in);
        StackTugasMahasiswa22 stack = new StackTugasMahasiswa22(5);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Menngumoulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = latif22.nextInt();
            latif22.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = latif22.nextLine();
                    System.out.print("NIM: ");
                    String nim = latif22.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = latif22.nextLine();
                    Mahasiswa22 mhs = new Mahasiswa22(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s Berhasil Dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa22 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai Tugas Dari " + dinilai.nama);
                        System.out.print("Masukkan Nilai (1-100): ");
                        int nilai = latif22.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s Adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: "+ biner);
                    }
                    break;
                case 3:
                    Mahasiswa22 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas Terakhir Dikummpulkan Oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar Semua Tugas");
                    System.out.println("Nama\tNIM\tkelas");
                    stack.print();
                    break;
                default: 
                    System.out.println("Pilihan Tidak Valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
