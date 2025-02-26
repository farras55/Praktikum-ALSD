package Praktikum03;

import java.util.Scanner;

public class Mahasiswa {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
    Scanner sc = new Scanner(System.in);

    public void cetakInfo(Mahasiswa[] arrayOfMahasiswa, int i) {
        System.out.println("NIM     : " + arrayOfMahasiswa[i].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[i].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[i].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[i].ipk);
        System.out.println("------------------------------------");
        }

    public void tambahData(Mahasiswa[] arrayOfMahasiswa) {
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa();

            System.out.println("Masukkan data Mahasiswa ke-" + (i+1));
            System.out.print("NIM      : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama     : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas    : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK      : ");
            String dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------");
        }
    }
}
