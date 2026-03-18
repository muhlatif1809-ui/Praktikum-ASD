package Minggu5;

public class NilaiMhs {
    double utsTertinggi(Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].NUTS;
        }
        int mid = (l + r) / 2;
        double lmax = utsTertinggi(arr, l, mid);
        double rmax = utsTerendah(arr, mid + 1, r);
        return Math.max(lmax, rmax);

    }

    double utsTerendah (Mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].NUTS;
        }
        int mid = (l + r) / 2;
        double lmin = utsTerendah(arr, l, mid);
        double rmin = utsTerendah(arr, mid + 1, r);
        return Math.min(lmin, rmin);

    }

    double rataUas (Mahasiswa[]arr){
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i].NUAS;
        }
        return total / arr.length;
        
    }
}


