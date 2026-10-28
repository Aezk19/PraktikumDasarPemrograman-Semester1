import java.util.Scanner;

public class Tugas2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int total = 0;
        System.out.print("Masukkan n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i*j + "\t");
                int angka = i*j;
                total += angka;
            }
            System.out.println(); 
        }
        System.out.println("Total angka tercetak : " + total);
        sc.close();
    }
}
