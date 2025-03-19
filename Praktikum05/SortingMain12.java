package Praktikum05;

public class SortingMain12 {
    public static void main(String[] args) {
        
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};

        Sorting12 dataUrut1 = new Sorting12(a, a.length);
        Sorting12 dataUrut2 = new Sorting12(b, b.length);
        Sorting12 dataUrut3 = new Sorting12(c, c.length);

        System.out.println("Data Awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();

        System.out.println("Data Awal 2");
        dataUrut2.tampil();
        dataUrut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataUrut2.tampil();

        System.out.println("Data Awal 3");
        dataUrut3.tampil();
        dataUrut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataUrut3.tampil();
    }
}
