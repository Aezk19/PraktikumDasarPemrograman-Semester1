import java.util.Scanner;

public class Tugas1TiketBioskopFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Deklarasi variabel
        int tiket, totalTiket = 0;
        double diskon;
        int hargaTiket = 50000;
        double totalHarga = 0;
        int i;
        int pelanggan;

        // input jumlah pelanggan
        System.out.println("---------------------------------------");
        do { 
            System.out.print("Masukkan jumlah pelanggan dalam satu hari: ");
            pelanggan = sc.nextInt();
            if (pelanggan < 0) {
                System.out.println("jumlah pelanggan tidak valid, masukkan ulang");
            }
        } while (pelanggan < 0);
        System.out.println("---------------------------------------");
        
        // perulangan while tiket
        for (i=0; i < pelanggan; i++) {
            //input jumlah tiket
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan " + (i + 1) +": ");
            tiket = sc.nextInt();
            if (tiket < 0) {
                System.out.println("jumlah tiket tidak valid, masukkan ulang");
                continue;
            }
            // perhitungan total harga dan tiket
            if (tiket > 10) {
                diskon = 0.15;
                totalHarga += (hargaTiket-hargaTiket*diskon)*tiket;
                totalTiket += tiket;
            } else if (tiket > 4) {
                diskon = 0.1;
                totalHarga += (hargaTiket-hargaTiket*diskon)*tiket;
                totalTiket += tiket;
            } else {
                diskon = 0;
                totalHarga += (hargaTiket-hargaTiket*diskon)*tiket;
                totalTiket += tiket;
            }
        }

        // output total
        System.out.println("---------------------------------------");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total total harga penjualan tiket: " + totalHarga);
        System.out.println("---------------------------------------");

        sc.close();
    }
}