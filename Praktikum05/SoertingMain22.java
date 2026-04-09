package Praktikum05;

public class SoertingMain22 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};

        Sorting22 dataurut1 = new Sorting22(a, a.length);

        System.out.println("Data Awal 1");
        dataurut1.tampil();
        dataurut1.bubleSort();
        System.out.println("Data Sudah Diurutkan Dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        Sorting22 dataurut2 = new Sorting22(a, a.length);

        System.out.println("Data Awal 2");
        dataurut2.tampil();
        dataurut2.bubleSort();
        System.out.println("Data Sudah Diurutkan Dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
    }
}

