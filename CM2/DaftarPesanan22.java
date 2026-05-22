package CM2;

public class DaftarPesanan22 {
    private Pesanan22 head;
    private Pesanan22 tail;
 
    DaftarPesanan22() {
        head = null;
        tail = null;
    }
 
    /** Tambah pesanan baru di akhir list */
    public void tambah(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        Pesanan22 baru = new Pesanan22(kodePesanan, namaPesanan, harga, namaPembeli);
 
        if (head == null) {
            head = baru;
            tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
    }
 
    /**
     * Urutkan pesanan berdasarkan namaPesanan secara ascending
     * menggunakan Insertion Sort pada Double Linked List
     */
    private void sortByNama() {
        if (head == null || head.next == null) return;
 
        Pesanan22 sorted = null;   // kepala list terurut
 
        Pesanan22 current = head;
        while (current != null) {
            Pesanan22 nextNode = current.next;
 
            // Lepas current dari list
            current.prev = null;
            current.next = null;
 
            // Sisipkan current ke posisi yang tepat di 'sorted'
            if (sorted == null || current.namaPesanan.compareToIgnoreCase(sorted.namaPesanan) <= 0) {
                current.next = sorted;
                if (sorted != null) sorted.prev = current;
                sorted = current;
            } else {
                Pesanan22 tmp = sorted;
                while (tmp.next != null &&
                       tmp.next.namaPesanan.compareToIgnoreCase(current.namaPesanan) < 0) {
                    tmp = tmp.next;
                }
                current.next = tmp.next;
                if (tmp.next != null) tmp.next.prev = current;
                tmp.next     = current;
                current.prev = tmp;
            }
 
            current = nextNode;
        }
 
        // Rebuild head & tail
        head = sorted;
        tail = head;
        while (tail != null && tail.next != null) tail = tail.next;
    }
 
    /** Cetak laporan pesanan terurut berdasarkan nama pesanan */
    public void cetakLaporan() {
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
 
        if (head == null) {
            System.out.println("Belum ada pesanan.");
            return;
        }
 
        sortByNama();
 
        int totalPendapatan = 0;
        System.out.printf("%-14s %-25s %-10s %s%n",
                "Kode Pesanan", "Nama Pesanan", "Harga", "Pemesan");
 
        Pesanan22 current = head;
        while (current != null) {
            System.out.printf("%-14d %-25s %-10d %s%n",
                    current.kodePesanan, current.namaPesanan,
                    current.harga, current.namaPembeli);
            totalPendapatan += current.harga;
            current          = current.next;
        }
 
        System.out.println("--------------------------------------");
        System.out.printf("Total Pendapatan : Rp %,d%n", totalPendapatan);
        System.out.println("======================================");
    }
 
    public boolean isEmpty() {
        return head == null;
    }
}

