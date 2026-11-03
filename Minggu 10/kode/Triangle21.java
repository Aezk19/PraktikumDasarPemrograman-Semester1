import java.util.Scanner;

public class Triangle21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        
        // Segitiga biasa
        System.out.println("Segitiga biasa");
        int i = 1;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
        // Segitiga terbalik
        System.out.println();
        System.out.println("Segitiga terbalik");
        i = n;
        while (i >= 1) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i--;
            System.out.println();
        }

        sc.close();
    }
}