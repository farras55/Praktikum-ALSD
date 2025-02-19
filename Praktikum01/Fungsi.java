package Praktikum01;

public class Fungsi {
    public static void main(String[] args) {
        String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] harga = {75000, 50000, 60000, 10000};

        System.out.println("Pendapatan per cabang jika semua stok terjual:");
        for (int i = 0; i < cabang.length; i++) {
            System.out.println(cabang[i] + ": " + hitungPendapatan(stock[i], harga));
        }

        System.out.println("Stok di RoyalGarden 4 sebelum pengurangan: " + arrayToString(stock[3]));
        
        updateStokMati(stock[3]);
        System.out.println("Stok di RoyalGarden 4 setelah pengurangan: " + arrayToString(stock[3]));
    }

    public static int hitungPendapatan(int[] stok, int[] harga) {
        int total = 0;
        for (int i = 0; i < stok.length; i++) {
            total += stok[i] * harga[i];
        }
        return total;
    }

    public static void updateStokMati(int[] stok) {
        stok[0] -= 1; 
        stok[1] -= 2; 
        stok[2] -= 0; 
        stok[3] -= 5;
    }

    public static String arrayToString(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
            if (i < arr.length - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
