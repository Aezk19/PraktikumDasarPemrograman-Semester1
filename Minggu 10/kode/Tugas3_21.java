import java.util.Scanner;

public class Tugas3_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // input jumlah toko
        int toko;
        do { 
            System.out.print("Masukkan jumlah toko: ");
            toko = sc.nextInt();
            if (toko < 1) {
                System.out.println("jumlah toko tidak valid (Dibawah 1) , masukkan ulang");
            }
        } while (toko < 1);

        // Perulangan pelanggan dan barang
        int i = 1;
        int totalBarang = 0;
        int barangTerbanyak = 0;
        String ringkasanToko = "";
        int tokoTerbanyak = 0;
        while (i <= toko) { 
            // input jumlah pelanggan
            int totalBarangToko = 0;
            int pelanggan;
            do{
                System.out.print("Masukkan jumlah pelanggan toko " + i + ": ");
                pelanggan = sc.nextInt();
                if (pelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak valid (Dibawah 0), masukkkan ulang");
                }
            } while (pelanggan < 0);

            // perulangan barang
            int j = 1;
            while (j <= pelanggan) { 
                // input jumlah barang yang dibeli pelanggan ke-j di toko ke-i
                int barang;
                do {
                    System.out.print("Masukkan barang pelanggan " + j + ": ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("Jumlah barang tidak valid, Masukkan ulang!");
                    }
                } while (barang < 0);
                //penjumlahan barang
                totalBarang += barang;
                totalBarangToko += barang;
                j++;
            }
            // filter toko dengan barang terbanyak
            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }
            ringkasanToko += "Toko "+ i + " - pelanggan: "+ pelanggan +", total barang: "+ totalBarangToko +"\n";
            i++; 
        }
        // Output program
        System.out.println();
        System.out.println("================= Ringkasan per-Toko =====================");
        System.out.println(ringkasanToko);
        System.out.println("================= Ringkasan seluruh toko =================");
        System.out.println("Total barang seluruh toko: "+ totalBarang);
        System.out.println("Toko dengan barang terbanyak: "+ tokoTerbanyak);
        System.out.println("----------------------------------------------------------");
        sc.close();
    }
}
