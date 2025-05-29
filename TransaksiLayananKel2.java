public class TransaksiLayananKel2 {
    PasienKel2 pasien;
    DokterKel2 dokter;
    int durasiLayanan;
    int biaya;

    void TransaksiLayananKel2(PasienKel2 pasien, DokterKel2 dokter, int durasi) {
        this.pasien = pasien;
        this.dokter = dokter;
        durasiLayanan = durasi;
    }

    int hitungBiaya(int durasi) {
        int biaya = durasi * 50000;
        return biaya;
    }
}
