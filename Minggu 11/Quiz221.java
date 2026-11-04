import java.util.Scanner;

public class Quiz221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String nama = "Muhammad Akbar";
        int noAbsen = 21;
        int k = noAbsen % 5;
        System.out.println("Nama : " + nama);
        System.out.println("Kode personal K = " + k);


        System.out.print("Jumlah kamar: ");
        int jumlahKamar = sc.nextInt();

        int meteranRusak = 0;
        double rataRata;
        String kategoriKamar;
        int palingBoros = 0;
        int boros = 0;
        double kamarkWhTinggi = 0;
        int kWhTertinggi = 0;
        boolean kamarRusak = false;
        int hariMeteranRusak = 0;
        
        // Badan outerloop dijalankan sebanyak jumlah input kamar yang dimasukkan user. Jika mengikuti contoh ilustrasi maka badan outerloop dijalankan sebanyak 2 kali karena jumlah kamar yang diinput user adalah 2
        for (int i = 1; i <= jumlahKamar; i++ ) {
            double total = 0;
            System.out.println("Kamar " + i );
            for (int j = 1; j<= 5; j++) {
                System.out.print("  Hari " + j +" (kWh): ");
                int kWhHari = sc.nextInt();
                if (kWhHari == -1) {
                    meteranRusak ++;
                    kamarRusak = true;
                    hariMeteranRusak = j;
                    break;
                }
                total += kWhHari;
            }
            rataRata = total / 5;
            if (kamarRusak) {
                kategoriKamar = "Rusak (hari ke-"+ hariMeteranRusak +")";
            } else if (rataRata < 5 + k ) {
                kategoriKamar = "Hemat";
            } else {
                kategoriKamar = "Boros";
            }
            System.out.println(String.format("  Total: %.2f | %s ", total, kategoriKamar));
            if (total > palingBoros) {
                boros = i;
            }
            if (total > kWhTertinggi) {
                kamarkWhTinggi = total;
            }  
        }
        System.out.println("====================== ");
        System.out.println("Kamar paling boros\t: " + boros);
        System.out.println(String.format("Total kWh Tertinggi\t: %.2f ", kamarkWhTinggi));
        System.out.println("Jumlah meteran rusak\t: " + meteranRusak);
    }
}