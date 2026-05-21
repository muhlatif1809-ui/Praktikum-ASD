package Minggu12;

public class DoubelLinkedList22 {
    Node22 head;
    Node22 tail;

    public DoubelLinkedList22(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(Mahasiswa22 data){
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa22 data){
        Node22 newNode = new Node22(data);
        if (isEmpty()) {
            head = tail = newNode; 
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa22 data){
        Node22 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data Dengan NIM " + keyNim + "Tidak Ditemukan.");
            return;
        }

        Node22 newNode22 = new Node22(data);

        // Jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode22.prev = current;
            current.next = newNode22;
            tail = newNode22;
        } else { //Node baru disisipkan di tengah
            newNode22.prev = current;
            newNode22.next = current.next;
            current.next.prev = newNode22;
            current.next = newNode22;
        }
        System.out.println("Data Berhasil DIsisipkan Setelah NIM " + keyNim);
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Linked List Masih Kosong.");
            return;
        }

        Node22 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

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
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        System.out.println("Data dari tail ke head:");

        Node22 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

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

    public int size() {
        return size;
    }
}
