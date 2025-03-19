package Praktikum05;

public class Mahasiswa12 {
    String nama, nim, kelas;
    double ipk;

    Mahasiswa12(){
    }

    Mahasiswa12(String nm, String name, String kls, double ip){
        nama = nm;
        nim = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
}
