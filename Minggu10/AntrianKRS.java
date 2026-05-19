package Minggu10;

public class AntrianKRS {
    MahasiswaKRS22[] data;
    int front;
    int rear;
    int size;
    int max;
    int jmlDiproses;
    int totalMahasiswa = 30;

     public AntrianKRS(int n) {
        max = n;
        data = new MahasiswaKRS22[max];
        size = 0;
        front = rear = -1;
        jmlDiproses = 0;
    }

     public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

     public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

     public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

       public void tambahAntrian(MahasiswaKRS22 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        if (IsEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

     public void dequeue2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa");
        } else {
            System.out.println("Mahasiswa diproses KRS:");

            for (int i = 0; i < 2; i++) {
                data[front].tampilkanData();

                front = (front + 1) % max;
                size--;
                jmlDiproses++;
            }

            if (size == 0) {
                front = rear = -1;
            }
        }
    }

     public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();

        }
    }

     public int getJumlahAntrian() {
        return size;
    }

      public void lihat2Terdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("2 Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            int kedua = (front + 1) % max;
            if (size > 1) {
                data[kedua].tampilkanData();
            }
        }
    }

      public void lihatAkhir() {
        if (!IsEmpty()) {
            System.out.println("Antrian paling belakang: ");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

     public void jumlahDiproses() {
        System.out.println("Jumlah mahasiswa sudah proses KRS : " + jmlDiproses);
    }

    public void belumProses() {
        System.out.println("Belum proses KRS : " + (totalMahasiswa - jmlDiproses));
    }

}
