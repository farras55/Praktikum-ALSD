package Praktikum01;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        char[][] KOTA = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = sc.next().toUpperCase().charAt(0);
        sc.close();
        
        boolean found = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                System.out.print("Kota yang sesuai: ");
                for (char c : KOTA[i]) {
                    System.out.print(c);
                }
                System.out.println();
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
