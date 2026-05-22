package Minggu12.CM2;

public class AntrianPembeli22 {
    private Pembeli22 head;
    private Pembeli22 tail;
    private int counterAntrian;
 
    AntrianPembeli22() {
        head = null;
        tail = null;
        counterAntrian = 0;
    }
 
    public int tambah(String namaPembeli, String noHp) {
        counterAntrian++;
        Pembeli22 baru = new Pembeli22(counterAntrian, namaPembeli, noHp);
 
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail      = baru;
        }
        return counterAntrian;
    }
 
    public Pembeli22 hapus(int noAntrian) {
        Pembeli22 current = head;
 
        while (current != null) {
            if (current.noAntrian == noAntrian) {
                if (current.prev != null) current.prev.next = current.next;
                else head = current.next;
 
                if (current.next != null) current.next.prev = current.prev;
                else tail = current.prev;
 
                current.prev = null;
                current.next = null;
                return current;
            }
            current = current.next;
        }
        return null;   
    }

    public void cetak() {
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
 
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
 
        System.out.printf("%-12s %-20s %s%n", "No Antrian", "Nama", "No HP");
        Pembeli22 current = head;
        while (current != null) {
            System.out.printf("%-12d %-20s %s%n",
            current.noAntrian, current.namaPembeli, current.noHp);
            current = current.next;
        }
    }
 
    public boolean isEmpty() {
        return head == null;
    }
}

