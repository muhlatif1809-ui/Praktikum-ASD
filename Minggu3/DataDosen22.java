package Minggu3;

public class DataDosen22 {
    void dataSemuaDosen(Dosen22[] data) {
        for (Dosen22 d : data) {
            d.tampil();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen22[] data) {
        int laki = 0, perempuan = 0;

        for (Dosen22 d : data) {
            if (d.jk) {
                laki++;
            } else {
                perempuan++;
            }
        }

        System.out.println("Laki-laki : " + laki);
        System.out.println("Perempuan : " + perempuan);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen22[] data) {
        int totalL = 0, totalP = 0, jmlL = 0, jmlP = 0;

        for (Dosen22 d : data) {
            if (d.jk) {
                totalL += d.usia;
                jmlL++;
            } else {
                totalP += d.usia;
                jmlP++;
            }
        }

        if (jmlL > 0) {
            System.out.println("Rata-rata usia Laki-laki : " + (totalL / jmlL));
        }
        if (jmlP > 0) {
            System.out.println("Rata-rata usia Perempuan : " + (totalP / jmlP));
        }
    }

    void infoDosenPalingTua(Dosen22[] data) {
        Dosen22 tertua = data[0];

        for (Dosen22 d : data) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.tampil();
    }

    void infoDosenPalingMuda(Dosen22[] data) {
        Dosen22 termuda = data[0];

        for (Dosen22 d : data) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.tampil();
    }
}

