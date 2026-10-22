import java.util.Scanner;

public class SiakadFor21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double nilai, tertinggi = 0, terendah = 100; // kenapa diinisialisasi tertinggi=0 dan terendah=100 adalah sebagai acuan awal

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) { 
                tertinggi = nilai;
            } 
            if (nilai < terendah) {
                terendah = nilai;
            }
        } 
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}