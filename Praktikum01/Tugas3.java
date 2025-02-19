package Praktikum01;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = sc.nextLine();
            System.out.print("SKS: ");
            sks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            
            if (pilihan == 1) {
                tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hariKuliah);
            } else if (pilihan == 2) {
                System.out.print("Masukkan hari kuliah: ");
                String hari = sc.nextLine();
                tampilkanJadwalBerdasarkanHari(namaMataKuliah, sks, semester, hariKuliah, hari);
            } else if (pilihan == 3) {
                System.out.print("Masukkan semester: ");
                int sem = sc.nextInt();
                sc.nextLine();
                tampilkanJadwalBerdasarkanSemester(namaMataKuliah, sks, semester, hariKuliah, sem);
            } else if (pilihan == 4) {
                System.out.print("Masukkan nama mata kuliah: ");
                String nama = sc.nextLine();
                cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, nama);
            } else if (pilihan == 5) {
                System.out.println("Keluar dari program.");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
        
        sc.close();
    }
    
    public static void tampilkanSeluruhJadwal(String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < nama.length; i++) {
            System.out.printf("%-30s | SKS: %-2d | Semester: %-2d | Hari: %s%n", nama[i], sks[i], semester[i], hari[i]);
        }
    }
    
    public static void tampilkanJadwalBerdasarkanHari(String[] nama, int[] sks, int[] semester, String[] hari, String targetHari) {
        System.out.printf("\nJadwal Kuliah pada %s:\n", targetHari);
        for (int i = 0; i < nama.length; i++) {
            if (hari[i].equalsIgnoreCase(targetHari)) {
                System.out.printf("%-30s | SKS: %-2d | Semester: %-2d%n", nama[i], sks[i], semester[i]);
            }
        }
    }
    
    public static void tampilkanJadwalBerdasarkanSemester(String[] nama, int[] sks, int[] semester, String[] hari, int targetSemester) {
        System.out.printf("\nJadwal Kuliah untuk Semester %d:\n", targetSemester);
        for (int i = 0; i < nama.length; i++) {
            if (semester[i] == targetSemester) {
                System.out.printf("%-30s | SKS: %-2d | Hari: %s%n", nama[i], sks[i], hari[i]);
            }
        }
    }
    
    public static void cariMataKuliah(String[] nama, int[] sks, int[] semester, String[] hari, String targetNama) {
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(targetNama)) {
                System.out.println("\nInformasi Mata Kuliah:");
                System.out.printf("Nama: %s%n", nama[i]);
                System.out.printf("SKS: %d%n", sks[i]);
                System.out.printf("Semester: %d%n", semester[i]);
                System.out.printf("Hari Kuliah: %s%n", hari[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}
