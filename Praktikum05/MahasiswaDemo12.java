package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah data mahasiswa: ");
        int jumMhs = input.nextInt();
        input.nextLine();
        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data untuk Mahasiswa " + (i + 1));
            System.out.print("NIM: ");
            String nim = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Kelas: ");
            String kelas = input.nextLine();
            System.out.print("IPK: ");
            double ipk = input.nextDouble();
            input.nextLine();

            list.tambah(new Mahasiswa12(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("--------------------");
        System.out.println("Pencarian Data");
        System.out.println("--------------------");
        System.out.println("Masukkan IPK yang dicari: ");
        System.out.print("IPK : ");
        double cari = input.nextDouble();
        input.nextLine();

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("--------------------");
        System.out.println("Pencarian Data");
        System.out.println("--------------------");
        System.out.println("Masukkan IPK yang dicari: ");
        System.out.print("IPK : ");
        cari = input.nextDouble();
        input.nextLine();
        System.out.println("---------------------");
        System.out.println("menggunakan binary search");
        System.out.println("---------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        /*System.out.println("Data Mahasiswa Sebelum Sorting");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil(); */
        

        input.close();
    }
}
