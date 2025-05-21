package Praktikum11;

public class Mahasiswa12 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa12() {

    }
    public Mahasiswa12(String nama, String nim, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilinformasi() {
        System.out.printf("%-10s %-10s %-10s %-10.2f\n", nama, nim, kelas, ipk);
    }
}
