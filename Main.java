import java.util.Scanner;
// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try { //exception
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();
            
            if (hargaBarang <= 0) {
                throw new IllegalArgumentException("Harga barang harus lebih dari 0.");  //exception
            }

            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();
            if (jumlahBeli <= 0) {
                throw new IllegalArgumentException("Jumlah beli harus lebih dari 0.");  //exception
            }

            // Membuat objek transaksi
            Transaksi transaksi = new Transaksi(kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan data transaksi
            System.out.println("\n=== Data Transaksi ===");
            System.out.println("No Faktur: " + noFaktur);
            transaksi.displayTransaksi();

        } catch (IllegalArgumentException e) {  //exception
            System.out.println("Input Error: " + e.getMessage());
        } catch (Exception e) {  //exception
            System.out.println("Terjadi kesalahan ");
        } finally {  //exception
            scanner.close();
        }
    }
}

