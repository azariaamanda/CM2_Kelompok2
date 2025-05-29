public class TransaksiPengisianKel2 {
    KendaraanKel2 kendaraan;
    BBMKel2 bbm;
    double liter;
    double totalBayar;

    TransaksiPengisianKel2(KendaraanKel2 kendaraan, BBMKel2 bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }
}