package Minggu12.CM2;

public class Pembeli22 {
    int noAntrian;
    String namaPembeli;
    String noHp;
    Pembeli22 prev;
    Pembeli22 next;
 
    Pembeli22 (int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
        this.prev = null;
        this.next = null;
    }
}

