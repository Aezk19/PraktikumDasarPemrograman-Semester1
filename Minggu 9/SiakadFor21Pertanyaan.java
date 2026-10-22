import java.util.Scanner;

public class SiakadFor21Pertanyaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double nilai, tertinggi = 0, terendah = 100;
        byte lulus = 0, tidakLulus= 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            } 
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                System.out.println("(Mahasiswa lulus)");
                lulus++;
            } else {
                System.out.println("(Mahasiswa tidak lulus)");
                tidakLulus++;
            }
        } 
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Mahasiswa lulus: " + lulus);
        System.out.println("Mahasiswa tidak lulus: " + tidakLulus);
    }
}