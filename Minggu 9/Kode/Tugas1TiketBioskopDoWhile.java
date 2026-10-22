import java.util.Scanner;

public class Tugas1TiketBioskopDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Deklarasi variabel
        int tiket, totalTiket = 0;
        double diskon;
        int hargaTiket = 50000;
        double totalHarga = 0;
        int pelanggan = 0;
        
        System.out.println("Masukkan 0 jika sudah tidak ada pelanggan lagi");
        // perulangan do while tiket
        do { 
            System.out.print("Masukkan jumlah tiket yang dibeli pelanggan " + (pelanggan + 1) +": ");
            tiket = sc.nextInt();
            if (tiket < 0) {
                System.out.println("jumlah tiket tidak valid, masukkan ulang");
                continue;
            } 
            if (tiket == 0){
                System.out.println("Input pelanggan sudah selesai");
                break;
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
            pelanggan++;

        } while (true);

        // output total
        System.out.println("---------------------------------------");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total total harga penjualan tiket: " + totalHarga);
        System.out.println("Jumlah pelanggan hari ini: "+ pelanggan);
        System.out.println("---------------------------------------");

        sc.close();
    }
}