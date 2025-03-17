package Minggu5;

public class Mahasiswa {
    String nama, nim;
    int thnMasuk, uts, uas;

    Mahasiswa(String nma, String nm, int thn, int ts, int as) {
        nama = nma;
        nim = nm;
        thnMasuk = thn;
        uts = ts;
        uas = as;
    }

    int nilaiUTS() {
        return uts;
    }
    int nilaiUAS() {
        return uas;
    }

    public static int nilaiUtsTertinggi(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS();
        }
        int mid = (l+r) / 2;
        int ltertinggi = nilaiUtsTertinggi(arr, l, mid);
        int rtertinggi = nilaiUtsTertinggi(arr, mid + 1, r);
        return Math.max(ltertinggi, rtertinggi);
    }

    public static int nilaiUtsTerendah(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS();
        }
        int mid = (l+r) / 2;
        int ltertinggi = nilaiUtsTerendah(arr, l, mid);
        int rtertinggi = nilaiUtsTerendah(arr, mid + 1, r);
        return Math.min(ltertinggi, rtertinggi);
    }

    public static double hitungRataUas(Mahasiswa[] arr) {
        int total = 0;
        for (Mahasiswa mahasiswa : arr) {
            total += mahasiswa.nilaiUAS();
        }
        return (double) total / arr.length;
    }
}
