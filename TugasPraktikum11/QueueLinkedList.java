package TugasPraktikum11;

public class QueueLinkedList {
    Node front, rear;
    int size, max;

    public QueueLinkedList() {
        this.front = this.rear = null;
        this.size = 0;
        this.max = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        Node baru = new Node(mhs);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil masuk antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dipanggil.");
            return;
        }
        System.out.print("Mahasiswa yang dipanggil: ");
        front.data.tampil();
        front = front.next;
        size--;
        if (front == null) rear = null;
    }

    public void tampilDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        }
    }

    public void tampilBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Antrian paling akhir: ");
            rear.data.tampil();
        }
    }

    public void tampilSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Antrian Mahasiswa:");
        System.out.println("NIM        Nama                 Prodi           Angkatan");
        Node temp = front;
        while (temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size);
    }
}
