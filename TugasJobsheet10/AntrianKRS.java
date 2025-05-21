package TugasJobsheet10;

public class AntrianKRS {
    Mahasiswa[] antrian;
    int front, rear, max, sudahKRS, size;

    public AntrianKRS(int n) {
        max = n;
        antrian = new Mahasiswa[max];
        front = rear = size = sudahKRS = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false; 
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false; 
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = 0;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }
        else {
            System.out.println("Queue masih Kosong");
        }
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }
        antrian[rear] = mhs;
        rear = (rear + 1) % max;
        size++;
        System.out.println(mhs.nim + "Berhasil masuk ke antrian.");
    }

    public void Layani2Mahasiswa() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak bisa proses KRS.");
            return;
        }
        System.out.println("Mahasiswa yang diproses KRS:");
        for (int i = 0; i < 2; i++) {
            antrian[front].tampil();
            front = (front + 1) % max;
            size--;
            sudahKRS++;
        }
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian Mahasiswa:");
        System.out.println("NIM           Nama                 Prodi        Angkatan");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            antrian[index].tampil();
        }
    }

    public void AntiranTerdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2.");
            return;
        }
        System.out.println("2 Antrian Terdepan:");
        int idx = front;
        for (int i = 0; i < 2; i++) {
            antrian[idx].tampil();
            idx = (idx + 1) % max;
        }
    }

    public void AntrihanTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        int idx = (rear - 1 + max) % max;
        System.out.println("Antrian Paling Akhir:");
        antrian[idx].tampil();
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }

    public void jumlahSudahKRS() {
        System.out.println("Jumlah mahasiswa yang sudah proses KRS: " + sudahKRS);
    }

    public void jumlahBelumKRS() {
        System.out.println("Jumlah mahasiswa yang belum proses KRS: " + (size));
    }

}
