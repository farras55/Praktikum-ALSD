package Praktikum02;

public class MataKuliahMain12 {
    public static void main(String[] args) {
        
        MataKuliah12 matkul1 = new MataKuliah12();
        matkul1.kodeMK = "1F01";
        matkul1.nama = "Matematika";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        matkul1.tampilInformasi();
        matkul1.ubahSKS(3);
        matkul1.tambahJam(2);
        matkul1.kurangiJam(6);
        matkul1.tampilInformasi();

        MataKuliah12 matkul2 = new MataKuliah12("1F02", "Daspro", 2, 6);
        matkul2.kurangiJam(6);
        matkul2.tampilInformasi();
    }
}
