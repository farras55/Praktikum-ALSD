package TugasJobsheet10;

import java.util.Scanner;

public class KRSMain {
    public static void menu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Antrian Mahasiswa");
        System.out.println("2. Proses KRS (2 mahasiswa sekaligus)");
        System.out.println("3. Tampilkan Semua Antrian");
        System.out.println("4. Tampilkan 2 Antrian Terdepan");
        System.out.println("5. Tampilkan Antrian Paling Akhir");
        System.out.println("6. Cetak Jumlah Antrian");
        System.out.println("7. Cetak Jumlah Sudah Proses KRS");
        System.out.println("8. Cetak Jumlah Belum Proses KRS");
        System.out.println("9. Kosongkan Antrian");
        System.out.println("0. Keluar");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);

        int pilih;
        do {
            menu();
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    if (antrian.isFull()) {
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
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.Layani2Mahasiswa();
                    break;
                case 3:
                    antrian.tampilkanAntrian();
                    break;
                case 4:
                    antrian.AntiranTerdepan();
                    break;
                case 5:
                    antrian.AntrihanTerakhir();
                    break;
                case 6:
                    antrian.jumlahAntrian();
                    break;
                case 7:
                    antrian.jumlahSudahKRS();
                    break;
                case 8:
                    antrian.jumlahBelumKRS();
                    break;
                case 9:
                    antrian.clear();
                    System.out.println("Antrian dikosongkan.");
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
