package Praktikum05;

import java.util.Scanner;

public class DosenDemo12 {
    public static void main(String[] args) {
        DataDosen12 data = new DataDosen12();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah data");
            System.out.println("2. Tampil data");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("5. Insertion Sort");
            System.out.println("6. Pencarian Data Nama");
            System.out.println("7. Pencarian Data Usia");
            System.out.println("8. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode: ");
                    String kode = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Jenis Kelamin (true untuk laki-laki, false untuk perempuan): ");
                    Boolean jenisKelamin = input.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = input.nextInt();
                    Dosen12 dsn = new Dosen12(kode, nama, jenisKelamin, usia);
                    data.tambah(dsn);
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.SortingASC();
                    System.out.println("Data telah diurutkan secara ascending.");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data telah diurutkan secara descending.");
                    break;
                case 5:
                    data.insertionSort();
                    System.out.println("Data telah diurutkan menggunakan insertion sort.");
                    break;
                case 6:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cariNama = input.nextLine();
                    data.PencarianDataSequential12(cariNama);
                    break;
                case 7:
                    System.out.print("Masukkan usia yang dicari: ");
                    int cariUsia = input.nextInt();
                    data.PencarianDataBinary12(cariUsia);
                    break;
                case 8:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 8);

        input.close();
    }
}
