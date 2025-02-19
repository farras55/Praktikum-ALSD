package Praktikum02;

public class Dosen12 {
    
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Status: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Bergabung mulai tahun: " + tahunBergabung);
        System.out.println("Ahli pada bidang: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        int hasil = 0;
        hasil = thnSkrg - tahunBergabung;
        return hasil;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

    public Dosen12() {

    }

    public Dosen12(String idDsn, String nm, boolean stsAktif, int thnBrgbng, String bdngKeahlian) {
        idDosen = idDsn;
        nama = nm;
        statusAktif = stsAktif;
        tahunBergabung = thnBrgbng;
        bidangKeahlian = bdngKeahlian;
    }
}
