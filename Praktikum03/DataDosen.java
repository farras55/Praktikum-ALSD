package Praktikum03;

public class DataDosen {
    
    public String kode, nama;
    public Boolean jenisKelamin;
    public int usia;
    public void dataSemuaDosen (Dosen[] arrayOfDosen) {
        for (Dosen dosen : arrayOfDosen) {
            System.out.println("Kode          : " + dosen.kode);
            System.out.println("Nama          : " + dosen.nama);
            System.out.println("Jenis Kelamin : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia (l/p)    : " + dosen.usia);
            System.out.println("------------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin (Dosen[] arrayOfDosen) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.jenisKelamin == true) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int usiaPria = 0, usiaWanita = 0, jumlahPria = 0, jumlahWanita = 0;
        double rerataUsiaPria, rerataUsiaWanita;

        for (Dosen dosen : arrayOfDosen) {
            if (dosen.jenisKelamin == true) {
                usiaPria += dosen.usia;
                jumlahPria++;
            } else {
                usiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }
        if (jumlahPria > 0) {
            rerataUsiaPria = usiaPria / jumlahPria;
            System.out.println("Rata-Rata Usia Dosen Pria : " + rerataUsiaPria);
        }
        if (jumlahWanita > 0) {
            rerataUsiaWanita = usiaWanita / jumlahWanita;
            System.out.println("Rata-Rata Usia Dosen Wanita " + rerataUsiaWanita);
        }
        if (jumlahPria == 0 && jumlahWanita == 0) {
            System.out.println("Tidak ada Dosen yang terdata.");
        }
    }

    public void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        int usiaTertua = arrayOfDosen[0].usia;
        String namaTertua = arrayOfDosen[0].nama;

        for (Dosen dosen : arrayOfDosen) {
            if (dosen.usia > usiaTertua) {
                usiaTertua = dosen.usia;
                namaTertua = dosen.nama;
            }
        }
        System.out.println("Dosen Tertua : " + namaTertua);
    }

    public void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        int usiaTermuda = arrayOfDosen[0].usia;
        String namaTermuda = arrayOfDosen[0].nama;

        for (Dosen dosen : arrayOfDosen) {
            if (dosen.usia < usiaTermuda) {
                usiaTermuda = dosen.usia;
                namaTermuda = dosen.nama;
            }
        }
        System.out.println("Dosen Tertua : " + namaTermuda);
    }

}
