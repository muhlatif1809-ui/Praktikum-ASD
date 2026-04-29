package Minggu9;

public class StackSurat22 {
    Surat22[] stack;
    int top;
    int size;

    public StackSurat22(int size) {
        this.size = size;
        stack = new Surat22[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

     public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat22 Srt) {
        if (!isFull()) {
            top++;
            stack[top] = Srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi. ");
        }
    }

    public Surat22 pop() {
        if (!isEmpty()) {
            Surat22 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai. ");
            return null;
        }
    }

    public Surat22 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan ");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].idSurat + "\t\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" + stack[i].jenisIzin + "\t\t" + stack[i].durasi);
        }
        System.out.println(" ");
    }

    public boolean cariNama (String nama){
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }

    
}

