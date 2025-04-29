package Praktikum09;

public class Mahasiswa12 {
    String nama, nim, kelas;
    int nilai;

    Mahasiswa12(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDiNilai(int nilai) {
        this.nilai = nilai;
    }
}
