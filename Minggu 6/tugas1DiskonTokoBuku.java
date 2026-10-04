import java.util.Scanner;

public class tugas1DiskonTokoBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String hari;
        String jenisBuku;
        int jumlahBuku;
        String diskon;

        System.out.println("---Diskon Toko Buku---");
        System.out.print("Masukkan hari (Senin/Selasa/Rabu/Kamis/Jumat/Sabtu/Minggu): ");
        hari = sc.nextLine();

        if (hari.equalsIgnoreCase("rabu")) {
            System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
            jenisBuku = sc.nextLine();
            System.out.print(String.format("Masukkan jumlah %s yang dibeli: ",jenisBuku));
            jumlahBuku = sc.nextInt();
            if (jenisBuku.equalsIgnoreCase("kamus")) {
                if (jumlahBuku > 2) {
                    diskon = "Diskon adalah 12%";
                } else {
                    diskon = "Diskon adalah 10%";
                }
            } else if (jenisBuku.equalsIgnoreCase("novel")) {
                if (jumlahBuku > 3){
                    diskon = "Diskon adalah 9%";
                } else {
                    diskon = "Diskon adalah 8%";
                }
            } else {
                if (jumlahBuku > 3) {
                    diskon = "Diskon adalah 5%";
                } else {
                    diskon = "Tidak ada diskon, pembelian buku kurang dari 4";
                } 
            }
        } else {
            diskon = "Tidak ada diskon di hari selain rabu";
        }
        System.out.println("---Total Diskon---\n"+diskon);
    }
}