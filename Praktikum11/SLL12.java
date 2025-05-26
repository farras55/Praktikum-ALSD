package Praktikum11;

import java.util.Scanner;

public class SLL12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList12 sll = new SingleLinkedList12();

        Mahasiswa12[] mhsArr = new Mahasiswa12[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("Nama    : ");
            String nama = sc.nextLine();
            System.out.print("NIM     : ");
            String nim = sc.nextLine();
            System.out.print("Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("IPK     : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            mhsArr[i] = new Mahasiswa12(nama, nim, kelas, ipk);
        }

        sll.print();
        sll.addFirst(mhsArr[3]);
        sll.print();
        sll.addLast(mhsArr[0]);
        sll.print();
        sll.insertAfter("Budi", mhsArr[2]);
        sll.insertAt(2, mhsArr[1]);
        sll.print();


        System.out.println("Index ke-2");
        sll.getData(2);
        System.out.println("Data Mahasiswa Bimon berada pada index: " + sll.indexOf("Arya"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        sc.close();
    }
}
