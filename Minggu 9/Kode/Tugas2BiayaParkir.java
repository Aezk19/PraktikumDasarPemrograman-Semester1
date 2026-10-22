import java.util.Scanner;

public class Tugas2BiayaParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //deklarasi variabel
        int jenis, durasi, total = 0;

        // perulangan do-while
        do { 
            //input jenis kendaraan
            System.out.println("------------------------");
            System.out.println("1.Mobil\n2.Motor\n0.Keluar");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();
            // pemilihan jenis kendaraan
            if (jenis==1 || jenis==2) {
                System.out.println("------------------------");
                System.out.print("Masukkan durasi parkir: ");
                durasi = sc.nextInt();
                // perhitungan total biaya parkir
                if (jenis == 1) {
                    total += durasi*3000;
                } else {
                    total += durasi*2000;
                }
            }
        } while (jenis != 0);

        // output total
        System.out.println("------------------------");
        System.out.print("Total biaya parkir: Rp." + total);

        sc.close();
    }
}
