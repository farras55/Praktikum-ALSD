package Praktikum01;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("============================");
        
        String[] mataKuliah = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };
        
        double totalBobot = 0;
        double totalSKS = 0;
        int[] sksMataKuliah = {2, 2, 2, 2, 2, 2, 2, 2};
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        
        String[][] konversiNilai = {
            {"A", "4.0"}, {"B+", "3.5"}, {"B", "3.0"},
            {"C+", "2.5"}, {"C", "2.0"}, {"D", "1.0"}, {"E", "0.0"}
        };
        
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
            } else {
                nilaiHuruf[i] = "E";
            }
            
            double nilaiSetara = 0.0;
            for (String[] nilai : konversiNilai) {
                if (nilai[0].equals(nilaiHuruf[i])) {
                    nilaiSetara = Double.parseDouble(nilai[1]);
                    break;
                }
            }
            
            totalBobot += nilaiSetara * sksMataKuliah[i];
            totalSKS += sksMataKuliah[i];
        }
        
        System.out.println("\n============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("============================");
        System.out.printf("%-40s %-15s %-10s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            double nilaiSetara = 0.0;
            for (String[] nilai : konversiNilai) {
                if (nilai[0].equals(nilaiHuruf[i])) {
                    nilaiSetara = Double.parseDouble(nilai[1]);
                    break;
                }
            }
            System.out.printf("%-40s %-15.2f %-10s %-15.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara);
        }
        
        double ipSemester = totalBobot / totalSKS;
        System.out.println("============================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);

        sc.close();
    }
}