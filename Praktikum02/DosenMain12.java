package Praktikum02;

public class DosenMain12 {
    public static void main(String[] args) {
        
        Dosen12 dsn1 = new Dosen12();
        dsn1.nama = "Sholikin";
        dsn1.idDosen = "A1";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Informatika";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(false);
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2025) + " Tahun");
        dsn1.ubahKeahlian("Sistem Informasi");
        dsn1.tampilInformasi();

        Dosen12 dsn2 = new Dosen12("A2", "Annisa", true, 2017, "Basis Data");
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2025) + " Tahun");
        dsn2.tampilInformasi();
    }
}
