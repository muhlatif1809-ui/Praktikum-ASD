import java.util.Scanner;

public class LaporanKeuanganMain {
    public static void main(String[] args) {  
        Scanner latif22 = new Scanner(System.in);
        LaporanKeuangan[] Laporan = new LaporanKeuangan[3];

        Laporan[0] = new LaporanKeuangan();


        System.out.println("=====================");
        System.out.println("Menghitung Keuntungan");
        System.out.println("=====================");
        System.out.println();
        System.out.print("Masukkan Nama Perusahaan: ");
        Laporan[0].namaPerusahaan = latif22.nextLine();
        System.out.print("Masukkan Pendapatan: "); // masukkkan pendapatan
        Laporan [0].pendapatanBulanan = latif22.nextDouble();
        System.out.print("Masukkan Biaya Operasional: "); // memasukkan biaya operasional
        Laporan [0].biayaOperasional = latif22.nextDouble(); 
        System.out.print("Keuntungan: "+ Laporan[0].Keuntungan());
    }
}
