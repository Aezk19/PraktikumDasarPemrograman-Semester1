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
            totalBarang = 0;
            System.out.print("Masukkan jumlah pelanggan toko " + i + ": ");
            
            int pelanggan = sc.nextInt();
            if (pelanggan < 0) {
                System.out.println("Jumlah pelanggan tidak valid (Dibawah 0), masukkkan ulang");
                continue;
            }

            // perulangan barang
            int j = 1;
            while (j <= pelanggan) { 
                // input jumlah barang yang dibeli pelanggan ke-j di toko ke-i
                System.out.print("Masukkan barang yang dibeli pelanggan " + j + " toko " + i + ": ");
                int barang = sc.nextInt();
                if (barang < 0) {
                    System.out.println("Jumlah pelanggan tidak valid (Dibawah 0), masukkkan ulang");
                    continue;
                }
                // filter toko dengan barang terbanyak
                totalBarang += barang;
                if (barang > barangTerbanyak) {
                    barangTerbanyak = barang;
                    tokoTerbanyak = i;
                }
            j++;
            }
            ringkasanToko += "Toko "+ i + " - pelanggan: "+ pelanggan +", total barang: "+ totalBarang +"\n";
            i++; 
        }
        System.out.println("=================== Ringkasan per-Toko  ===================");
        System.out.println(ringkasanToko);
        System.out.println("================ Ringkasan seluruh toko ================");
        System.out.println("Total barang seluruh toko: "+ totalBarang);
        System.out.println("Toko dengan barang terbanyak: "+ tokoTerbanyak);
        System.out.println("--------------------------------------------------------");
        sc.close();
    }
}
