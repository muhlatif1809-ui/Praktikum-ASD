package Minggu12.CM2;

public class Pesanan22 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String namaPembeli;  
    Pesanan22 prev;
    Pesanan22 next;
 
    Pesanan22(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
        this.prev = null;
        this.next = null;
    }
}

