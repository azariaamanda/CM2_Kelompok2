public class TransaksiPengisianKel2 {
    KendaraanKel2 kendaraan;
    BBMKel2 bbm;
    double liter;
    double totalBayar;
    NodeKendaraanKel2 head;
    NodeKendaraanKel2 tail;
    int MAX = 100;
    String[] transaksi = new String[MAX];
    double[] totalTransaksi = new double[MAX];
    int front = -1;
    int rear = -1;

    public TransaksiPengisianKel2() {
    }

    TransaksiPengisianKel2(KendaraanKel2 kendaraan, BBMKel2 bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }

    boolean isEmpty() {
        return (head == null);
    }

    public void tambahAntrian(KendaraanKel2 kendaraan) {
        NodeKendaraanKel2 newNode = new NodeKendaraanKel2(kendaraan, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public KendaraanKel2 lihatKendaraanDepan() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    public KendaraanKel2 removeFirst() {
        if (isEmpty()) {
            return null;
        }
        KendaraanKel2 data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public KendaraanKel2 layaniKendaraan(BBMKel2 bbm, double liter) {
        if (isEmpty()) {
            System.out.println("Tidak ada kendaraan dalam antrian");
            return null;
        }

        KendaraanKel2 kendaraan = removeFirst();
        TransaksiPengisianKel2 transaksiBaru = new TransaksiPengisianKel2(kendaraan, bbm, liter);

        String data = kendaraan.platNomor + " : " + transaksiBaru.totalBayar;
        simpanTransaksi(data, transaksiBaru.totalBayar);

        return kendaraan;
    }

    public void tampilAntrian() {
        if (!isEmpty()) {
            NodeKendaraanKel2 tmp = head;
            while (tmp != null) {
                tmp.data.tampilkanInfo();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian Kosong");
        }
    }

    public void jumlahAntrian() {
        int count = 0;
        NodeKendaraanKel2 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println(">>> Jumlah Kendaraan dalam Antrian: " + count);
    }

    public void tampilkanRiwayatTransaksi() {
        if (isEmpty()) {
            System.out.println("Belum ada transaksi yang tercatat.");
            return;
        }
        System.out.println("=== Riwayat Transaksi ===");
        System.out.println("Daftar Transaksi: ");
        for (int i = front; i <= rear; i++) {
            System.out.println(transaksi[i]);
        }
    }

    public void simpanTransaksi(String data, double nilai) {
        if (rear == MAX - 1) {
            System.out.println("Riwayat transaksi penuh!");
            return;
        }
        if (front == -1)
            front = 0;
        transaksi[++rear] = data;
        totalTransaksi[rear] = nilai;
    }

    public double hitungTotalKeseluruhanTransaksi() {
        double total = 0;
        for (int i = front; i <= rear; i++) {
            total += totalTransaksi[i];
        }
        return total;
    }

}
