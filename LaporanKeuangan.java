public class LaporanKeuangan {
    public String namaPerusahaan;
    public double pendapatanBulanan;
    public double biayaOperasional;
    public double hitungKeuntungan;

    double Keuntungan(){
        return pendapatanBulanan - biayaOperasional;
    }
   

    

}
