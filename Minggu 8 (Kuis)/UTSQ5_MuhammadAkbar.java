// Nama : Muhammad Akbar
// Kelas : TI-1D
// NIM : 264107020029

import java.util.Scanner;

public class UTSQ5_MuhammadAkbar {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String senjata;
        String hit;
        int dmgFinal;
        int dmgRompi;
        int dmgDasar;
        
        //Memasukkan jenis senjata
        System.out.print("Masukkan jenis senjata(AR/SMG/Sniper): ");
        senjata = sc.nextLine();

        //Kondisi jika senjata adalah (AR/SMG/Sniper)
        if (senjata.equalsIgnoreCase("AR")) {
            System.out.print("Masukkan bagian tubuh yang terkena tembakan(Kepala/badan): "); // input bagian yang terkena tembak
            hit = sc.nextLine();
            if (hit.equalsIgnoreCase("badan")) { // proses dan otput perhitungan setelah diinput bagian yang terkena tembak
                dmgDasar = 35;
                System.out.println("Damage dasar = "+ dmgDasar);
                dmgRompi = dmgDasar*20/100;
                System.out.println("Pengurangan rompi (20%):  "+dmgRompi);
                dmgFinal = dmgDasar-dmgRompi;
                System.out.println("Damage akhir : "+ dmgFinal);
            } else if (hit.equalsIgnoreCase("kepala")) {
                dmgDasar = 60;
                System.out.println("Damage dasar = " + dmgDasar);
                dmgRompi = 0;
                System.out.println("Pengurangan rompi (0%) : "+ dmgRompi);
                dmgFinal = dmgDasar-dmgRompi;
                System.out.println("Damage akhir : "+ dmgFinal);
            } else { // Jika input tidak valid
                System.out.println("Input tidak valid. Pastikan bagian = (kepala/badan).");
            }
        } else if (senjata.equalsIgnoreCase("SMG")) {
            System.out.print("Masukkan bagian tubuh yang terkena tembakan(Kepala/badan): "); // input bagian yang terkena tembak
            hit = sc.nextLine();
            if (hit.equalsIgnoreCase("badan")) { // proses dan otput perhitungan setelah diinput bagian yang terkena tembak
                dmgDasar = 25;
                System.out.println("Damage dasar = " +dmgDasar);
                dmgRompi = dmgDasar*30/100;
                System.out.println("Pengurangan rompi (30%) : "+ dmgRompi);
                dmgFinal = dmgDasar-dmgRompi;
                System.out.println("Damage akhir : "+ dmgFinal);
            } else if (hit.equalsIgnoreCase("kepala")) {
                dmgDasar = 45;
                System.out.println("Damage dasar = "+ dmgDasar);
                dmgRompi = dmgDasar*30/100;
                System.out.println("Pengurangan rompi (30%) : "+ dmgRompi);
                dmgFinal = dmgDasar-dmgRompi;
                System.out.println("Damage akhir : " + dmgFinal);
            } else { // Jika input tidak valid
                System.out.println("Input tidak valid. Pastikan bagian = (kepala/badan).");
            }
        } else if (senjata.equalsIgnoreCase("sniper")) {
            System.out.print("Masukkan bagian tubuh yang terkena tembakan(Kepala/badan): "); // input bagian yang terkena tembak
            hit = sc.nextLine();
            if (hit.equalsIgnoreCase("badan")) { // proses dan otput perhitungan setelah diinput bagian yang terkena tembak
                dmgDasar = 90;
                System.out.println("Damage dasar = "+ dmgDasar);
                dmgRompi = 0;
                System.out.println("Pengurangan rompi (0%): "+ dmgRompi);
                dmgFinal = dmgDasar-dmgRompi;
                System.out.println("Damage akhir : "+ dmgFinal);
            } else if (hit.equalsIgnoreCase("kepala")) {
                System.out.println("HEADSHOT! Musuh langsung knock.");
            } else { // Jika input tidak valid
                System.out.println("Input tidak valid. Pastikan bagian = (kepala/badan).");
            }
        } else { // Jika input tidak valid
            System.out.println("Input tidak valid. Pastikan senjata = (AR/SMG/Sniper)."); //Kondisi jika senjata adalah (lainnya)
        }
    } 
}

