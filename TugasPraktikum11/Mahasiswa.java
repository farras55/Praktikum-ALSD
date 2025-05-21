package TugasPraktikum11;

public class Mahasiswa {
    String nim, nama, prodi;
    int angkatan;

    public Mahasiswa(String nim, String nama, String prodi, int angkatan) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.angkatan = angkatan;
    }

    public void tampil() {
        System.out.printf("%-10s %-20s %-15s %-5d\n", nim, nama, prodi, angkatan);
    }
}
