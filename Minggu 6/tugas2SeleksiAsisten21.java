import java.util.Scanner;

public class tugas2SeleksiAsisten21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean aktif;
        boolean sanksi;
        boolean sertif;
        byte nilaiDaspro;
        byte nilaiWawancara;
        String pesan;

        System.out.println("---Seleksi Asisten Praktikum Dasar Pemograman---");
        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        aktif = sc.nextBoolean();

        if (aktif) {
            System.out.print("Apakah mahasiswa sedang mendapatkan sanksi akademik? (true/false): ");
            sanksi = sc.nextBoolean();
            if (!sanksi) {
                System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
                sertif = sc.nextBoolean();
                System.out.print("Masukkan nilai dasar pemograman: ");
                nilaiDaspro = sc.nextByte();
                if (nilaiDaspro >= 80 || sertif) {
                    System.out.print("Masukkan nilai wawancara: ");
                    nilaiWawancara = sc.nextByte();
                    if (nilaiWawancara >= 75) {
                        pesan = "Selamat, anda diterima menjadi asisten praktikum";
                    } else {
                        pesan = "Anda ditolak karena nilai wawancara kurang dari 75";
                    }
                } else {
                    pesan = "Anda ditolak karena nilai daspro kurang dari 80 atau tidak memiliki sertifikat kompetensi pemograman";
                }
            } else {
                pesan = "Anda ditolak karena sedang mendapatkan sanksi akademik";
            }
        } else {
        pesan = "Anda ditolak karena berstatus mahasiswa tidak aktif";
        }
        System.out.println("---Pengumuman Seleksi Asisten Praktikum ---\n"+pesan);
    }
}