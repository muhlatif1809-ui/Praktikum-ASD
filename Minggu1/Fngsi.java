package Minggu1;

public class Fngsi {
    public class fungsi {
        
    static int[][] stok = {
        {10, 5, 15, 7},   
        {6, 11, 9, 12},   
        {2, 10, 10, 5},   
        {5, 7, 12, 9}    
    };

 
    static int[] harga = {75000, 50000, 60000, 10000};
    static String[] namaCabang = {
        "RoyalGarden 1",
        "RoyalGarden 2",
        "RoyalGarden 3",
        "RoyalGarden 4"
    };

 
    public static void tampilPendapatan() {
        System.out.println("=== PENDAPATAN SETIAP CABANG ===");

        for (int i = 0; i < stok.length; i++) {
            int totalPendapatan = 0;

            for (int j = 0; j < stok[i].length; j++) {
                totalPendapatan += stok[i][j] * harga[j];
            }

            System.out.println(namaCabang[i] + 
                " = Rp " + totalPendapatan);

            tampilStatus(totalPendapatan);
            System.out.println();
        }
    }

    
    public static void tampilStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            System.out.println("Status : Sangat Baik");
        } else {
            System.out.println("Status : Perlu Evaluasi");
        }
    }

    public static void main(String[] args) {
        tampilPendapatan();
    }
}
    
}
