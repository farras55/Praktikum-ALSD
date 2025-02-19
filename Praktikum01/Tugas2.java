package Praktikum01;

import java.util.Scanner;

public class Tugas2 {
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }
    
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }
    
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
    
    public static void tampilkanMenu(Scanner sc) {
        
        System.out.println("\n===== Kalkulator Kubus =====");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu (1-4): ");
        
        int pilihan = sc.nextInt();
        
        if (pilihan == 4) {
            System.out.println("Terima kasih! Keluar dari program.");
            sc.close();
            return;
        }

        System.out.println("=============================");
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc.nextDouble();
        
        switch (pilihan) {
            case 1:
                System.out.println("Volume Kubus: " + hitungVolume(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus: " + hitungKeliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        
        tampilkanMenu(sc);
        sc.close();
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tampilkanMenu(sc);
    }
}
