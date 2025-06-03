import java.util.Scanner;

public class BBMMainKel2 {
    public static void main(String[] args) {

        TransaksiPengisianKel2 trs = new TransaksiPengisianKel2();
        Scanner input = new Scanner(System.in);

        int pilih;

        do {
            System.out.println("\n=== Menu SPBU ===");
            System.out.println("1. Tambahkan Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Plat Nomor: ");
                    String platNomor = input.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan: ");
                    String tipe = input.nextLine();
                    System.out.print("Masukkan Merk: ");
                    String merk = input.nextLine();
                    KendaraanKel2 kendaraan = new KendaraanKel2(platNomor, tipe, merk);

                    trs.tambahAntrian(kendaraan);
                    System.out.println(">> Kendaraan masuk ke dalam antrian.");
                    break;

                case 2:
                    trs.tampilAntrian();
                    break;

                case 3:
                    trs.jumlahAntrian();
                    break;

                case 4:
                    if (trs.isEmpty()) {
                        System.out.println("Tidak ada kendaraan dalam antrian.");
                        break;
                    }

                    KendaraanKel2 kendaraanBerikutnya = trs.lihatKendaraanDepan();
                    System.out.println("Petugas melayani " + kendaraanBerikutnya.platNomor);

                    System.out.print("Masukkan Jenis BBM: ");
                    String namaBBM = input.nextLine();
                    System.out.print("Masukkan Harga per liter: ");
                    double hargaPerLiter = input.nextDouble();
                    System.out.print("Masukkan Jumlah Liter: ");
                    double liter = input.nextDouble();
                    input.nextLine();

                    BBMKel2 bbm = new BBMKel2(namaBBM, hargaPerLiter);
                    KendaraanKel2 kendaraanDilayani = trs.layaniKendaraan(bbm, liter);
                    System.out.println(">> Transaksi berhasil dicatat.");
                    break;

                case 5:
                    trs.tampilkanRiwayatTransaksi();

                    double totalKeseluruhan = trs.hitungTotalKeseluruhanTransaksi();
                    System.out.println("Total Keseluruhan Transaksi: Rp " + totalKeseluruhan);
                    break;

                case 0:
                    System.out.println("Terima Kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih != 0);
    }
}
