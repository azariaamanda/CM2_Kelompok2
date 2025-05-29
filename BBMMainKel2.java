import java.util.Scanner;

public class BBMMainKel2 {
    public static void main(String[] args) {
        TransaksiPengisianKel2 trs = new TransaksiPengisianKel2();
        Scanner input = new Scanner(System.in);

        int pilih;

        do {
            System.out.println("=== Menu SPBU ===");
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
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
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
