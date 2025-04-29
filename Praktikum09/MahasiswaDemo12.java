package Praktikum09;

import java.util.Scanner;

public class MahasiswaDemo12 {
    
    public static void main(String[] args) {
        StackTugasMahasiswa12 stack = new StackTugasMahasiswa12(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa12 mhs = new Mahasiswa12(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n" , mhs.nama);
                    break;
                case 2:
                    Mahasiswa12 dinilai =  stack.pop();
                    if (dinilai != null) {
                        System.out.print("Menilai tugas dari " + dinilai.nama);
                        System.out.println("Masukkan nilai (0 - 100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDiNilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai dalam biner: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa12 peekMhs = stack.peek();
                    if (peekMhs != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh: " + peekMhs.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
        scan.close();
    }
}
