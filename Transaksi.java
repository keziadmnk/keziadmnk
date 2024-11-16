// Subclass (Inheritance)
class Transaksi extends Barang {
    private int jumlahBeli;
    private double total;

    public Transaksi(String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Memanggil constructor superclass
        this.jumlahBeli = jumlahBeli;
        calculateTotal();
    }

    private void calculateTotal() {
        total = hargaBarang * jumlahBeli;
    }

    public double getTotal() {
        return total;
    }

    public void displayTransaksi() {
        displayBarang();
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total Harga: " + total);
    }
}
