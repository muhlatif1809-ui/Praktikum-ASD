package Minggu9;

public class StackTugasMahasiswa22 {
    
    Mahasiswa22[] stack;
    int top, size;
    
    public StackTugasMahasiswa22(int size){
        this.size = size;
        stack = new Mahasiswa22[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpety(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa22 mhs){
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh! Tidak BIsa Menambah Tugas Lagi.");
        }
    }

    public Mahasiswa22 pop(){
        if (!isEmpety()) {
            Mahasiswa22 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack Kosong! Tidak Ada Tugas.");
            return null;
        }
    }

    public Mahasiswa22 peek(){
        if (!isEmpety()) {
            return stack[top];
        } else {
            System.out.println("Stack Kosong! Tidak Ada Tugas Yang Dikumpulkan");
            return null;
        }
    }

    public void print(){
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println(" ");
    }

     public String konversiDesimalKeBiner(int nilai){
        StackKonversi22 stack = new StackKonversi22 ();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}   

