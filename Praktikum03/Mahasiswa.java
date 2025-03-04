package Praktikum03;

import java.util.Scanner;

public class Mahasiswa {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    public void cetakInfo() {
        System.out.println("NIM     : " + this.nim);
        System.out.println("Nama    : " + this.nama);
        System.out.println("Kelas   : " + this.kelas);
        System.out.println("IPK     : " + this.ipk);
        System.out.println("------------------------------------");
    }

    public void inputData(Scanner sc, int index) {
        System.out.println("\nMasukkan data Mahasiswa ke-" + (index + 1));
        System.out.print("NIM      : ");
        this.nim = sc.nextLine();
        System.out.print("Nama     : ");
        this.nama = sc.nextLine();
        System.out.print("Kelas    : ");
        this.kelas = sc.nextLine();
        System.out.print("IPK      : ");
        this.ipk = sc.nextFloat();
        sc.nextLine();
    }
}
