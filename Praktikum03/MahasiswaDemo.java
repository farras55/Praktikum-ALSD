package Praktikum03;

import java.util.Scanner;

public class MahasiswaDemo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int panjangArray = 0;
        
        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[panjangArray];
        System.out.println("Masukkan panjang Array : ");
        panjangArray = sc.nextInt();


        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("NIM     : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa[i].ipk);
            System.out.println("------------------------------------");
        }
        Mahasiswa demoMahasiswa = new Mahasiswa();

        demoMahasiswa.tambahData(arrayOfMahasiswa);


        
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            demoMahasiswa.cetakInfo(arrayOfMahasiswa, i);
        }
        
        
        sc.close();
    }
}
