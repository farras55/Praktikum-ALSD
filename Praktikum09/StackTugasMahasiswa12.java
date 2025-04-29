package Praktikum09;

public class StackTugasMahasiswa12 {
    Mahasiswa12[] Stack;
    int top;
    int size;

    public StackTugasMahasiswa12(int size) {
        this.size = size;
        Stack = new Mahasiswa12[size];
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

    public void push(Mahasiswa12 mhs) {
        if (!isFull()) {
            top++;
            Stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa12 pop() {
        if (!isEmpty()) {
            Mahasiswa12 m = Stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack Kosong! Tidak ada tugas untuk di nilai.");
            return null;
        }
    }

    public Mahasiswa12 peek() {
        if (!isEmpty()) {
            return Stack[top];
        } else {
            System.out.println("Stack Kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void print() {
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                System.out.println(Stack[i].nama + "\t" + Stack[i].nim + "\t" + Stack[i].kelas);
            }
        } 
        System.out.println("");
    }

    public String konversiDesimalKeBiner (int nilai) {
        StackKonversi12 stack = new StackKonversi12(nilai);
        while (nilai > 0) {
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
