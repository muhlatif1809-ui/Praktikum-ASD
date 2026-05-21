|  | Algoritma dan Struktur Data |
|--|--|
| NIM |  254107020235|
| Nama |  Muhammad Latif Sabilis Sudur |
| Kelas | TI - 1F |
| Repository | [link] https://github.com/muhlatif1809-ui/Praktikum-ASD.git

# JOBSHEET XII DOUBLE LINKED LIST 

## 12.2 Percobaan 1: Operasi Penambahan pada Double Linked List

``` java
===== MENU DOUBLE LINKED LIST =====
1. Tambah Data Di Awal
2. Tambah Data Di Akhir
3. Sisipkan Data Di Tengah (Setelah NIM)
4. Hapus Data Di Awal
5. Hapus Data Di Akhir
6. Tampilkan Data
0. Keluar
Pilih Menu: 2
Masukkan NIM : 123005
Masukkan Nama : Harry
Masukkan Kelas : 1A
Masukkan IPK : 3.76

===== MENU DOUBLE LINKED LIST =====
1. Tambah Data Di Awal
2. Tambah Data Di Akhir
3. Sisipkan Data Di Tengah (Setelah NIM)
4. Hapus Data Di Awal
5. Hapus Data Di Akhir
6. Tampilkan Data
0. Keluar
Pilih Menu: 3
Masukkan NIM Yang Dicari: 123005
Masukkan Data Baru: 
Masukkan NIM : 123010
Masukkan Nama : Potter
Masukkan Kelas : 1B
Masukkan IPK : 3.55
Data Berhasil DIsisipkan Setelah NIM 123005

===== MENU DOUBLE LINKED LIST =====
1. Tambah Data Di Awal
2. Tambah Data Di Akhir
3. Sisipkan Data Di Tengah (Setelah NIM)
4. Hapus Data Di Awal
5. Hapus Data Di Akhir
6. Tampilkan Data
0. Keluar
Pilih Menu: 6
NIM    : 123005
Nama     : Harry
Kelas    : 1A
IPK      : 3.76
NIM    : 123010
Nama     : Potter
Kelas    : 1B
IPK      : 3.55
```

## 12.2.3 Pertanyaan

1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan
Double Linked List!
- Single Linked List memiliki satu pointer (next) sehingga traversal hanya dapat dilakukan dari depan ke belakang dan penggunaan memorinya lebih hemat. Double Linked List memiliki dua pointer (next dan prev) sehingga traversal dapat dilakukan dua arah, memudahkan operasi penyisipan dan penghapusan node, tetapi membutuhkan memori yang lebih besar.

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi
masing-masing atribut tersebut pada proses traversal dan manipulasi node!
- next digunakan untuk menunjuk ke node berikutnya sehingga memungkinkan traversal maju (head → tail) dan membantu proses penyisipan atau penghapusan node.
- prev digunakan untuk menunjuk ke node sebelumnya sehingga memungkinkan traversal mundur (tail → head) serta mempermudah manipulasi node tanpa harus mencari node sebelumnya terlebih dahulu.

3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut
terhadap kondisi awal linked list!
-  Konstruktor DoubleLinkedList berfungsi untuk menyiapkan linked list dalam keadaan kosong dengan mengatur head dan tail menjadi null. Inisialisasi ini penting agar operasi seperti penambahan, penghapusan, dan pengecekan kondisi kosong dapat berjalan dengan benar tanpa menyebabkan error.

4. Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?
- head dan tail harus menunjuk ke node yang sama ketika linked list kosong karena node yang baru ditambahkan menjadi satu-satunya node, sehingga berperan sebagai node pertama sekaligus node terakhir dalam linked lis

5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list!
- ``` java
===== MENU DOUBLE LINKED LIST =====
1. Tambah Data Di Awal
2. Tambah Data Di Akhir
3. Sisipkan Data Di Tengah (Setelah NIM)
4. Hapus Data Di Awal
5. Hapus Data Di Akhir
6. Tampilkan Data
0. Keluar
Pilih Menu: 6
Linked List Masih Kosong.

method print sudah menampilkan linked list masih kosong

6. Modifikasi kode program dengan menambahkan method printReverse() untuk menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!
- ``` java
===== MENU DOUBLE LINKED LIST =====
1. Tambah Data Di Awal
2. Tambah Data Di Akhir
3. Sisipkan Data Di Tengah (Setelah NIM)
4. Hapus Data Di Awal
5. Hapus Data Di Akhir
6. Tampilkan Data
7. Tampilkan Data Terbalik
0. Keluar
Pilih Menu: 1
Masukkan NIM : 12345
Masukkan Nama : Stepenn
Masukkan Kelas : 1F
Masukkan IPK : 3.90

===== MENU DOUBLE LINKED LIST =====
1. Tambah Data Di Awal
2. Tambah Data Di Akhir
3. Sisipkan Data Di Tengah (Setelah NIM)
4. Hapus Data Di Awal
5. Hapus Data Di Akhir
6. Tampilkan Data
7. Tampilkan Data Terbalik
0. Keluar
Pilih Menu: 1
Masukkan NIM : 123456
Masukkan Nama : Latif
Masukkan Kelas : 1F
Masukkan IPK : 9.70

===== MENU DOUBLE LINKED LIST =====
1. Tambah Data Di Awal
2. Tambah Data Di Akhir
3. Sisipkan Data Di Tengah (Setelah NIM)
4. Hapus Data Di Awal
5. Hapus Data Di Akhir
6. Tampilkan Data
7. Tampilkan Data Terbalik
0. Keluar
Pilih Menu: 7
Data dari tail ke head:
NIM    : 12345
Nama     : Stepenn
Kelas    : 1F
IPK      : 3.9
NIM    : 123456
Nama     : Latif
Kelas    : 1F
IPK      : 9.7

===== MENU DOUBLE LINKED LIST =====
1. Tambah Data Di Awal
2. Tambah Data Di Akhir
3. Sisipkan Data Di Tengah (Setelah NIM)
4. Hapus Data Di Awal
5. Hapus Data Di Akhir
6. Tampilkan Data
7. Tampilkan Data Terbalik
0. Keluar
Pilih Menu: 0
Program Selesai.

## 12.3 Percobaan 2: Operasi Penghapusan pada Double Linked List

``` java
===== MENU DOUBLE LINKED LIST =====
1. Tambah Data Di Awal
2. Tambah Data Di Akhir
3. Sisipkan Data Di Tengah (Setelah NIM)
4. Hapus Data Di Awal
5. Hapus Data Di Akhir
6. Tampilkan Data
7. Tampilkan Data Terbalik
0. Keluar
Pilih Menu: 5
Data berhasil dihapus.
NIM    : 123005
Nama     : Harry
Kelas    : 1A
IPK      : 3.76

===== MENU DOUBLE LINKED LIST =====
1. Tambah Data Di Awal
2. Tambah Data Di Akhir
3. Sisipkan Data Di Tengah (Setelah NIM)
4. Hapus Data Di Awal
5. Hapus Data Di Akhir
6. Tampilkan Data
7. Tampilkan Data Terbalik
0. Keluar
Pilih Menu: 6
NIM    : 123010
Nama     : Potter
Kelas    : 1B
IPK      : 3.55
```

## 12.3.3 Pertanyaan
1. Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!
    - head = head.next; digunakan untuk menggeser head ke node berikutnya sehingga node pertama lama tidak lagi menjadi head.
    - head.prev = null; digunakan untuk memutus hubungan antara head baru dengan node yang dihapus, sehingga head baru tidak memiliki referensi ke node sebelumnya dan struktur Double Linked List tetap valid.
2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data yang berhasil dihapus!
``` java
 public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        }
    
        Node22 deleted = head;
        
        if (head == tail) {
            head = tail = null;
        } else {

            head = head.next;
            head.prev = null;
        }

        System.out.println("Data Berhasil Dihapus");
        deleted.data.tampil();
    }

  public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        Node22 deleted = tail;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        System.out.println("Data berhasil dihapus.");
        deleted.data.tampil();
    }
```

## 12.5 Tugas Praktikum

1. Tambahkan method add(int index, Mahasiswa data) untuk menambahkan node pada indeks tertentu!
``` java
public void add(int index, Mahasiswa22 data) {
        if (index < 0 || index > size) {
            System.out.println("Index tidak valid!");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node22 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        Node22 newNode = new Node22(data);
        current.prev.next = newNode;
        current.prev = newNode;

        size++;
    }
```

2. Tambahkan method removeAfter() untuk menghapus node setelah node yang memiliki data key tertentu!
``` java
public void removeAfter(String nim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        Node22 current = head;

        while (current != null &&
                !current.data.nim.equals(nim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak ada node setelah data tersebut");
            return;
        }

        Node22 deleted = current.next;

        if (deleted == tail) {
            tail = current;
            tail.next = null;
        } else {
            current.next = deleted.next;
            deleted.next.prev = current;
        }

        System.out.println("Data berhasil dihapus:");
        deleted.data.tampil();

        size--;
    }
```

3. Tambahkan method remove(int index) untuk menghapus node pada indeks tertentu!
``` java
public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        Node22 current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Data berhasil dihapus:");
        current.data.tampil();

        size--;
    }
```

4. Tambahkan method: a. getFirst() b. getLast() c. getIndex() untuk menampilkan data pada node pertama, node terakhir, dan node pada indeks tertentu.
``` java
public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data pertama:");
        head.data.tampil();
    }
    
    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data terakhir:");
        tail.data.tampil();
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Index tidak valid");
            return;
        }
        Node22 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada index " + index + ":");
        current.data.tampil();
    }
``` 

5. Tambahkan atribut dan method untuk menghitung jumlah data (size) pada Double Linked List
``` java
public int size() {
        return size;
    }
```







