public class TransaksiPengisianKel2 {
    Kendaraankel2 kendaraan;
    BBMKela2 bbm;
    double liter;
    double totalBayar;

    TransaksiPengisianKel2(Kendaraankel2 kendaraan, BBMKela2 bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }
}