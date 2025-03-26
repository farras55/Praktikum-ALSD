package Praktikum05;

public class DataDosen12 {
    Dosen12[] dataDosen = new Dosen12[10];
    int idx = 0;

    public void tambah(Dosen12 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
            System.out.println();
        }
    }

    public void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen12 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia < dataDosen[j + 1].usia) {
                    Dosen12 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen12 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia > key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j = j - 1;
            }
            dataDosen[j + 1] = key;
        }
    }

    void PencarianDataSequential12(String nama) {
        boolean found = false;
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                dataDosen[i].tampil();
                found = true;
                count++;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan!");
        } else if (count > 1) {
            System.out.println("Data dengan nama " + nama + " ditemukan lebih dari satu hasil.");  
        }
    }

    void PencarianDataBinary12(int usia) {
        int left = 0;
        int right = idx - 1;
        int mid;
        boolean found = false;
        int count = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (dataDosen[mid].usia == usia) {
                dataDosen[mid].tampil();
                found = true;
                count++;

                int tempLeft = mid - 1;
                while (tempLeft >= 0 && dataDosen[tempLeft].usia == usia) {
                    dataDosen[tempLeft].tampil();
                    count++;
                    tempLeft--;
                }

                int tempRight = mid + 1;
                while (tempRight < idx && dataDosen[tempRight].usia == usia) {
                    dataDosen[tempRight].tampil();
                    count++;
                    tempRight++;
                }
                break;
            } else if (dataDosen[mid].usia < usia) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan!");
        } else if (count > 1) {
            System.out.println("Data dengan usia " + usia + " ditemukan lebih dari satu hasil.");  
        }
    }
}
