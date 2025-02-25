package Praktikum03;

import java.util.Scanner;

public class MahasiswaDemo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String dummy;
        
        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];

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
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------");
        }

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("NIM     : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa[i].ipk);
            System.out.println("------------------------------------");
        }



        arrayOfMahasiswa[0] = new Mahasiswa();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        System.out.println("NIM     : " + arrayOfMahasiswa[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[0].ipk);
        System.out.println("------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa[1].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[1].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[1].ipk);
        System.out.println("------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa[2].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa[2].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa[2].ipk);
        System.out.println("------------------------------------");

        sc.close();
    }
}
