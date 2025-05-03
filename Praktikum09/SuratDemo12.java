package Praktikum09;

import java.util.Scanner;

public class SuratDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat12 stack = new StackSurat12(5);
        int pilihan;

        do {
            System.out.println("\n===== Menu Surat Izin =====");
            System.out.println("1. Tambah Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Teratas");
            System.out.println("4. Cari Surat Mahasiswa");
            System.out.println("5. Tampilkan Semua Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    stack.tambahSurat();
                    break;
                case 2:
                    stack.prosesSurat();
                    break;
                case 3:
                    stack.lihatTeratas();
                    break;
                case 4:
                    stack.cariSurat();
                    break;
                case 5:
                    stack.tampilkanSemua();
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
