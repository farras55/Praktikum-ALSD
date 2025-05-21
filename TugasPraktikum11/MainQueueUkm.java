package TugasPraktikum11;

import java.util.Scanner;

public class MainQueueUkm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList queue = new QueueLinkedList(); // contoh max 10

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Daftar Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian Terdepan");
            System.out.println("4. Tampilkan Antrian Paling Akhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Tampilkan Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Antrian penuh!");
                        break;
                    }
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Angkatan: ");
                    int angkatan = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, angkatan);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.tampilDepan();
                    break;
                case 4:
                    queue.tampilBelakang();
                    break;
                case 5:
                    queue.tampilSemua();
                    break;
                case 6:
                    queue.jumlahAntrian();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}
