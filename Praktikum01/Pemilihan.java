package Praktikum01;

import java.util.Scanner;

public class Pemilihan {

    public static void main(String[] args) {
        System.out.println("====== Program Menghitung Nilai Akhir ======");

        Scanner sc = new Scanner(System.in);
        double tugas, kuis, uts, uas, nilaiAkhir;

        System.out.print("Masukkan nilai tugas (0 - 100): ");
        tugas = sc.nextDouble();
        if (tugas < 0 || tugas > 100) {
            System.out.println("Nilai Tidak Valid !!");
        }

        System.out.print("Masukan nilai kuis (0 - 100): ");
        kuis = sc.nextDouble();
        if (kuis < 0 || kuis > 100) {
            System.out.println("Nilai Tidak Valid !!");
        }

        System.out.print("Masuikan nilai UTS (0- 100): ");
        uts = sc.nextDouble();
        if (uts < 0 || uts > 100) {
            System.out.println("Nilai Tidak Valid !!");
        }

        System.out.print("Masukkan nilai UAS (0 - 100): ");
        uas = sc.nextDouble();
        if (uas < 0 || uas > 100) {
            System.out.println("Nilai Tidak Valid !!");
        }
        System.out.println("==============================");

        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.4 * uas);

        String nilaiHuruf, keterangan;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            keterangan = "LULUS";
        }
        else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            keterangan = "LULUS";
        }
        else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            keterangan = "LULUS";
        }
        else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            keterangan = "LULUS";
        }
        else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            keterangan = "LULUS";
        }
        else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            keterangan = "TIDAK LULUS";
        }
        else {
            nilaiHuruf = "E";
            keterangan = "TIDAK LULUS";
        }

        System.out.println("Nilai Akhir = " + nilaiAkhir);
        System.out.println("Nilai Huruf = " + nilaiHuruf);
        System.out.println("==============================");
        if (keterangan.equals("LULUS")) {
            System.out.println("SELAMAT ANDA LULUS");
        }
        else {
            System.out.println("MOHON MAAF ANDA TIDAK LULUS");
        }
        sc.close();
    } 
}