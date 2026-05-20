package Minggu11;

import java.util.Scanner;

public class SLLMain22 {
    public static void main(String[] args) {
        Scanner latif22 = new Scanner(System.in);
        SingleLinkedList22 sll = new SingleLinkedList22();
        int jumlah;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlah = latif22.nextInt();
        latif22.nextLine();

    for (int i = 0; i < jumlah; i++) {
        System.out.println("\nData Mahasiswa ke- " + (i + 1));
        System.out.print("NIM   : ");
        String nim = latif22.nextLine();
        System.out.print("Nama  : ");
        String nama = latif22.nextLine();
        System.out.print("Kelas : ");
        String kelas = latif22.nextLine();
        System.out.print("IPK   : ");
        double ipk = Double.parseDouble(latif22.nextLine());

        Mahasiswa22 mhs = new Mahasiswa22(nim, nama, kelas, ipk);
        sll.addLast(mhs);
        sll.print();
}

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        // Mahasiswa22 mhs1 = new Mahasiswa22("24212200", "Alvaro", "1A", 4.0);
        // Mahasiswa22 mhs2 = new Mahasiswa22("23212201", "Bimon", "2B", 3.8);
        // Mahasiswa22 mhs3 = new Mahasiswa22("22212202", "Cintia", "3C", 3.5);
        // Mahasiswa22 mhs4 = new Mahasiswa22("21212203", "Dirga", "4D", 3.6);

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs3);
        // sll.insertAt(2, mhs2);
        // sll.print();
        }
}
