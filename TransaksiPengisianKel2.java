public class TransaksiPengisianKel2 {
    KendaraanKel2 kendaraan;
    BBMKel2 bbm;
    double liter;
    double totalBayar;
    NodeKendaraanKel2 head;
    NodeKendaraanKel2 tail;

    public TransaksiPengisianKel2() {   
    }

    TransaksiPengisianKel2(KendaraanKel2 kendaraan, BBMKel2 bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
    }


    boolean isEmpty(){
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

    public KendaraanKel2 dequeue() {
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
        
        KendaraanKel2 kendaraan = dequeue();
        TransaksiPengisianKel2 transaksi = new TransaksiPengisianKel2(kendaraan, bbm, liter);        
        return kendaraan;
    }

}