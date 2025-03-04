package Praktikum03;

import java.util.Scanner;

public class MahasiswaDemo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int panjangArray = sc.nextInt();
        sc.nextLine();

        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[panjangArray];

        for (int i = 0; i < panjangArray; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa();
            arrayOfMahasiswa[i].inputData(sc, i);
        }

        System.out.println("\n=== Data Mahasiswa ===");
        for (int i = 0; i < panjangArray; i++) {
            arrayOfMahasiswa[i].cetakInfo();
        }

        sc.close();
    }
}
