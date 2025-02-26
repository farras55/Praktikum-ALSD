package Praktikum03;

import java.util.Scanner;

public class DosenDemo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Dosen[] arrayOfDosen = new Dosen[3];
        String kode, nama;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan data Dosen ke-" + (i+1));
            System.out.print("Kode           : ");
            kode = sc.nextLine();
            System.out.print("Nama           : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin  : ");
            char jk = sc.next().charAt(0);
            jenisKelamin = (jk == 'L' || jk == 'l');
            System.out.print("Usia           : ");
            usia = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------");

            arrayOfDosen[i] = new Dosen(kode, nama, jenisKelamin, usia);
        }

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen[i].tampilInformasi(i);
        }


        for (Dosen tampilDosen : arrayOfDosen) {
            System.out.println(tampilDosen);
        }

        sc.close();
    }
}
