import java.util.Scanner;

public class Tugas1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int total = 0;

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }
            total += i;
            i++;
            System.out.println();
        }
        System.out.println("Total angka tercetak : " + total);
        sc.close();
    }
}
