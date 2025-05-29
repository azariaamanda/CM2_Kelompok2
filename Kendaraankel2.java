public class Kendaraankel2 {
    String platNomor;
    String tipe;
    String merk;

    public Kendaraankel2(String plat, String tipe, String merk) {
        platNomor = plat;
        this.tipe = tipe;
        this.merk = merk;
    }

    void tampilkanInfo() {
        System.out.println("-- Antrian Kendaraan --");
        System.out.println("Antrian Kendaraan:");
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Tipe: " + tipe);
        System.out.println("Merk: " + merk);
    }
    
}