import java.util.Scanner;

public class StudiKasus1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayar: ");
        uangBayar = sc.nextInt();
        sc.close();

        totalHarga = jumlahCup *  hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }
        totalBayar = totalHarga - diskon;
        System.out.println("Total harga         : "+totalHarga);
        System.out.println("Diskon              : "+diskon);
        System.out.println("Total bayar adalah  : "+totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembali         : "+kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("uang tidak cukup, kurang Rp."+kurang);
        }
    }
}
