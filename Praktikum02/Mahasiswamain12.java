package Praktikum02;

public class Mahasiswamain12 {
    public static void main(String[] args) {
        
        Mahasiswa12 mhs1 = new Mahasiswa12();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa12 mhs2 = new Mahasiswa12("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa12 mhs = new Mahasiswa12("Farras", "244107060032", 4.0, "SIB 1D");
        mhs.tampilkanInformasi();
    }
    
}
