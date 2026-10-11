import java.util.Scanner;;

public class StudiKasus2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        String pesan;
        byte jumlahDokumenUp;
        byte rank;
        byte statusPendanaan;
        int dokumenKurang;

        System.out.print("Masukkan nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Masukkan penyelenggara lomba (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("belmawa") || jenisKegiatan.equalsIgnoreCase("bakorma") || jenisKegiatan.equalsIgnoreCase("mandiri")) {
            System.out.print("Jumlah dokumen yang diupload(0/1/2/3/4): ");
            jumlahDokumenUp = sc.nextByte();
            System.out.print("Masukkan peringkat juara(1/2/3/0(tidak juara/juara harapan): ");
            rank = sc.nextByte();
            if (jumlahDokumenUp == 4) {
                if (rank>= 1 && rank <= 3) {
                    pesan = String.format("Memperoleh dana penghargaan, juara %s di lomba %s", rank, jenisKegiatan);
                } else {
                    pesan = "Tidak memperoleh penghargaan, tidak juara atau juara harapan";
                }
            } else if (jumlahDokumenUp < 4 && jumlahDokumenUp >= 0) {
                dokumenKurang = 4-jumlahDokumenUp;
                pesan = String.format("Dokumen tidak lengkap (kurang %d dokumen), dana penghargaan tidak diberikan", dokumenKurang);
            } else {
                pesan = "Jumlah dokumen tidak valid";
            } 
        } else if (jenisKegiatan.equalsIgnoreCase("pkm")) {
            System.out.print("Jumlah dokumen yang diupload(0/1/2/3/4): ");
            jumlahDokumenUp = sc.nextByte();
            System.out.print("Masukkan status pendanaan(0.tidak lolos/1.lolos): ");
            statusPendanaan = sc.nextByte();
            if (jumlahDokumenUp == 4) {
                if (statusPendanaan == 1) {
                    pesan = "Memperoleh dana penghargaan, PKM lolos pendanaan";
                } else {
                    pesan = "Tidak memperoleh penghargaan, status pendanaan tidak lolos";
                }
            } else if (jumlahDokumenUp < 4 && jumlahDokumenUp >= 0) {
                dokumenKurang = 4-jumlahDokumenUp;
                pesan = String.format("Dokumen tidak lengkap (kurang %d dokumen), dana penghargaan tidak diberikan", dokumenKurang);
            } else {
                pesan = "Jumlah dokumen tidak valid";
            }
        } else {
            pesan = "Tidak memperoleh dana penghargaan, penyelenggara lomba bukan BELMAWA/BAKORMA/Mandiri/PKM";
        }
        
        sc.close();
        System.out.println("---Status dana penghargaan---");
        System.out.println(String.format("Nama              : %s\nStatus pendanaan  : %s", namaMahasiswa, pesan));
    }
}