package Praktikum09;

import java.util.Scanner;

public class StackSurat12 {
    Surat12[] stack;
    int size;
    int top;
    Scanner sc = new Scanner(System.in);

    public StackSurat12(int size) {
        this.size = size;
        stack = new Surat12[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void tambahSurat() {
        if (isFull()) {
            System.out.println("Stack penuh! Tidak bisa menambah surat.");
            return;
        }

        System.out.print("ID Surat       : ");
        String id = sc.nextLine();
        System.out.print("Nama Mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Kelas          : ");
        String kelas = sc.nextLine();
        System.out.print("Jenis Izin (S/I): ");
        char jenis = sc.nextLine().toUpperCase().charAt(0);
        System.out.print("Durasi (hari)  : ");
        int durasi = sc.nextInt(); sc.nextLine();

        Surat12 surat = new Surat12(id, nama, kelas, jenis, durasi);
        stack[++top] = surat;
        System.out.println("Surat berhasil ditambahkan.");
    }

    public void prosesSurat() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
        } else {
            System.out.println("Surat berikut diproses:");
            stack[top--].printInfo();
        }
    }

    public void lihatTeratas() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
        } else {
            System.out.println("Surat di posisi teratas:");
            stack[top].printInfo();
        }
    }

    public void cariSurat() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return;
        }

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                stack[i].printInfo();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Tidak ada surat dalam stack.");
            return;
        }

        System.out.println("=== Daftar Surat Izin ===");
        for (int i = top; i >= 0; i--) {
            System.out.println("-------------------------");
            stack[i].printInfo();
        }
    }
}

