package Minggu1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner latif22 = new Scanner(System.in);
        String nama_mahasiswa, nim;
        int nilai_Pancasila, nilai_Daspro, nilai_Bing,nilai_KTI,nilai_ctps,niai_matdas,nilai_prakdaspro,nilai_K3;
        int sksPancasila = 2;
        int sksDaspro = 3;
        int sksBing = 2;
        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester ");
        System.out.println("===============================");
        // System.out.print("Masukkan Nilai Angka Untuk MK Pancasila: ");
        // np = latif22.nextInt();
        // System.out.print("Masukkan Nilai Angka Untuk MK Konsep Teknologi Informasi: ");
        // nkti = latif22.nextInt();
        // System.out.print("Masukkan Nilai Angka Untuk MK Critical Thinking dan Problem Solving: ");
        // nctps = latif22.nextInt();
        // System.out.print("Masukkan Nilai Angka Untuk MK Matematika Dasar: ");
        // nmd = latif22.nextInt();
        // System.out.print("Masukkan Nilai Angka Untuk MK Bahasa Inggris: ");
        // nbi = latif22.nextInt();
        // System.out.print("Masukkan Nilai Angka Untuk MK Praktikum Dasar Pemograman: ");
        // npdp = latif22.nextInt();
        // System.out.print("Masukkan Nilai Angka Untuk MK Keselamatan dan Kesehatan Kerja: ");
        // nk3 = latif22.nextInt();
      

        
        System.out.print("Masukkan Nilai Angka Untuk MK Pancasila: ");
        nilai_Pancasila = latif22.nextInt();
        System.out.print("Masukkan Nilai Angka Untuk MK Konsep Teknologi Informasi: ");
        nilai_KTI = latif22.nextInt();
        System.out.print("Masukkan Nilai Angka Untuk MK Critical Thinking dan Problem Solving: ");
        nilai_ctps = latif22.nextInt();
        System.out.print("Masukkan Nilai Angka Untuk MK Matematika Dasar: ");
        niai_matdas = latif22.nextInt();
        System.out.print("Masukkan Nilai Angka Untuk MK Bahasa Inggris: ");
        nilai_Bing = latif22.nextInt();
        System.out.print("Masukkan Nilai Angka Untuk MK Dasar Pemograman: ");
        nilai_Daspro = latif22.nextInt();
        System.out.print("Masukkan Nilai Angka Untuk MK Praktikum Dasar Pemograman: ");
        nilai_prakdaspro = latif22.nextInt();
        System.out.print("Masukkan Nilai Angka Untuk MK Keselamatan dan Kesehatan Kerja: ");

        
        


        // if (nilai_Pancasila < 0 || nilai_Pancasila > 100) {
        //     System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        // } else if (nilai_Daspro < 0 || nilai_Daspro > 100) {
        //     System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        // } else if (nilai_Bing < 0 || nilai_Bing > 100) {
        //     System.out.println("[ERROR] Nilai tidak valid! Semua nilai harus berada di antara 0 - 100");
        // }

        String nilaiHurufP, nilaiHurufD, nilaiHurufB;
        if (nilai_Pancasila > 80 && nilai_Pancasila <= 100) {
            nilaiHurufP = "A";
        } else if (nilai_Pancasila > 73 && nilai_Pancasila <= 80) {
            nilaiHurufP = "B+";
        } else if (nilai_Pancasila > 65 && nilai_Pancasila <= 73) {
            nilaiHurufP = "B";
        } else if (nilai_Pancasila > 60 && nilai_Pancasila <= 65) {
            nilaiHurufP = "C+";
        } else if (nilai_Pancasila > 50 && nilai_Pancasila <= 60) {
            nilaiHurufP = "C";
        } else if (nilai_Pancasila > 39 && nilai_Pancasila <= 50) {
            nilaiHurufP = "D";
        } else {
            nilaiHurufP = "E";
        }

        if (nilai_Daspro > 80 && nilai_Daspro <= 100) {
            nilaiHurufD = "A";
        } else if (nilai_Daspro > 73 && nilai_Daspro <= 80) {
            nilaiHurufD = "B+";
        } else if (nilai_Daspro > 65 && nilai_Daspro <= 73) {
            nilaiHurufD = "B";
        } else if (nilai_Daspro > 60 && nilai_Daspro <= 65) {
            nilaiHurufD = "C+";
        } else if (nilai_Daspro > 50 && nilai_Daspro <= 60) {
            nilaiHurufD = "C";
        } else if (nilai_Daspro > 39 && nilai_Daspro <= 50) {
            nilaiHurufD = "D";
        } else {
            nilaiHurufD = "E";
        }

        if (nilai_Bing > 80 && nilai_Bing <= 100) {
            nilaiHurufB = "A";
        } else if (nilai_Bing > 73 && nilai_Bing <= 80) {
            nilaiHurufB = "B+";
        } else if (nilai_Bing > 65 && nilai_Bing <= 73) {
            nilaiHurufB = "B";
        } else if (nilai_Bing > 60 && nilai_Bing <= 65) {
            nilaiHurufB = "C+";
        } else if (nilai_Bing > 50 && nilai_Bing <= 60) {
            nilaiHurufB = "C";
        } else if (nilai_Bing > 39 && nilai_Bing <= 50) {
            nilaiHurufB = "D";
        } else {
            nilaiHurufB = "E";
        }

        double nilaiSetaraP, nilaiSetaraD, nilaiSetaraB;
        if (nilaiHurufP.equals("A")) {
            nilaiSetaraP = 4;
        } else if (nilaiHurufP.equals("B+")) {
            nilaiSetaraP = 3.5;
        } else if (nilaiHurufP.equals("B")) {
            nilaiSetaraP = 3;
        } else if (nilaiHurufP.equals("C+")) {
            nilaiSetaraP = 2.5;
        } else if (nilaiHurufP.equals("C")) {
            nilaiSetaraP = 2;
        } else if (nilaiHurufP.equals("D")) {
            nilaiSetaraP = 1;
        } else {
            nilaiSetaraP = 0;
        }

        if (nilaiHurufD.equals("A")) {
            nilaiSetaraD = 4;
        } else if (nilaiHurufD.equals("B+")) {
            nilaiSetaraD = 3.5;
        } else if (nilaiHurufD.equals("B")) {
            nilaiSetaraD = 3;
        } else if (nilaiHurufD.equals("C+")) {
            nilaiSetaraD = 2.5;
        } else if (nilaiHurufD.equals("C")) {
            nilaiSetaraD = 2;
        } else if (nilaiHurufD.equals("D")) {
            nilaiSetaraD = 1;
        } else {
            nilaiSetaraD = 0;
        }

        if (nilaiHurufB.equals("A")) {
            nilaiSetaraB = 4;
        } else if (nilaiHurufB.equals("B+")) {
            nilaiSetaraB = 3.5;
        } else if (nilaiHurufB.equals("B")) {
            nilaiSetaraB = 3;
        } else if (nilaiHurufB.equals("C+")) {
            nilaiSetaraB = 2.5;
        } else if (nilaiHurufB.equals("C")) {
            nilaiSetaraB = 2;
        } else if (nilaiHurufB.equals("D")) {
            nilaiSetaraB = 1;
        } else {
            nilaiSetaraB = 0;
        }

        System.out.println("==========================================================================");
        System.out.println("                        HASIL KONVERSI NILAI                              ");
        System.out.println("==========================================================================");
        
        System.out.println();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Mata Kuliah                SKS   Nilai   Huruf   Setara                   ");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Pancasila                  2     " + nilai_Pancasila + "      " + nilaiHurufP + "       "
                + nilaiSetaraP);
        System.out.println(
                "Dasar Pemrograman          3     " + nilai_Daspro + "      " + nilaiHurufD + "       " + nilaiSetaraD);
        System.out.println(
                "Bahasa Inggris             2     " + nilai_Bing + "      " + nilaiHurufB + "       " + nilaiSetaraB);
        System.out.println("--------------------------------------------------------------------------");

        double totalSKS = 2 + 3 + 2;
        double totalNilai = (nilaiSetaraP * sksPancasila) + (nilaiSetaraD * sksDaspro) + (nilaiSetaraB * sksBing);
        double ip = totalNilai / totalSKS;
        double bobot = totalNilai;

        System.out.println("Total SKS   : " + totalSKS);
        System.out.println("Bobot       : " + bobot);
        System.out.println(String.format("%.2f", ip));


        String status="";
        String status1;
        

        if (nilaiHurufP.equals("D") || nilaiHurufP.equals("E")) {
            status = "TIDAK LULUS SEMESTER (Nilai Pancasila D/E)";
        } else if (ip < 2) {
            status = "TIDAK LULUS SEMESTER (IP kurang dari 2)";
        } else if (nilai_Pancasila >= 60 && nilai_Daspro >= 60 && nilai_Bing >= 60) {
            status = "LULUS SEMESTER";
            if (ip > 2.0 || ip < 2.75) {
                status1 = "Lulus percobaan";
            } else if (ip > 2.75) {
                status1 = "LULUS";
        } else {
            status = "TIDAK LULUS SEMESTER";
        }
        
        }
        System.out.println("Status Semester : " + status);
       
      

        

    }
}

        // Scanner latif22 = new Scanner(System.in);

        // int np,nkti,nctps,nmd,nbi,ndp,npdp,nk3;

        // System.out.println("===============================");
        // System.out.println("Program Menghitung IP Semester ");
        // System.out.println("===============================");

        // System.out.print("Masukkan Nilai Angka Untuk MK Pancasila: ");
        // np = latif22.nextInt();
        // System.out.print("Masukkan Nilai Angka Untuk MK Konsep Teknologi Informasi: ");
        // nkti = latif22.nextInt();
        // System.out.print("Masukkan Nilai Angka Untuk MK Critical Thinking dan Problem Solving: ");
        // nctps = latif22.nextInt();
        // System.out.print("Masukkan Nilai Angka Untuk MK Matematika Dasar: ");
        // nmd = latif22.nextInt();
        // System.out.print("Masukkan Nilai Angka Untuk MK Bahasa Inggris: ");
        // nbi = latif22.nextInt();
        // System.out.print("Masukkan Nilai Angka Untuk MK Praktikum Dasar Pemograman: ");
        // npdp = latif22.nextInt();
        // System.out.print("Masukkan Nilai Angka Untuk MK Keselamatan dan Kesehatan Kerja: ");
        // nk3 = latif22.nextInt();

        // System.out.println("===============================");
        // System.out.println("Hasil Konversi Nilai");
        // System.out.println("===============================");
        
    
