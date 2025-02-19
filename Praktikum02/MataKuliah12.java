package Praktikum02;

public class MataKuliah12 {
    
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("Nama Matkul: " + nama);
        System.out.println("Kode Matkul: " + kodeMK);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sksBaru);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlahh jam setelah ditambah: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan");
        }
    }

    public MataKuliah12() {

    }

    public MataKuliah12(String kdMK, String nm, int sks, int jmljam) {
        kodeMK = kdMK;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmljam;
    }
}
