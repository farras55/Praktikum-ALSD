package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo12 {
    public static void main(String[] args) {
        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
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

        System.out.println("Data Mahasiswa Sebelum Sorting");
        list.tampil();

        System.out.println("Data Mahasiswa Setelah Sorting berdasarkan IPK (DESC)");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();

        input.close();
    }
}
