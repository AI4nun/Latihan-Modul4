package Tugas;

import java.util.Scanner;

public class APItextAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
        System.out.println("=== MENU TEKS ANALYZER ===\n" +
                            "1. Masukkan Teks\n" +
                            "2. Hitung Jumlah Karakter\n" +
                            "3. Hitung Jumlah Kata\n" +
                            "4. Cari Kata dalam Teks\n" +
                            "5. Keluar");
        System.out.println("Pilihan Anda: ");
        int choose = sc.nextInt();
        
        if(choose==5){
            System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
            break;
        }
        
        switch(choose){
            case 1:
                System.out.println("Masukkan teks: ");
                String teks = sc.nextLine();
                break;
            case 2:
                int jumlahKarakter = hitungJumlahKarakter(teks);
                System.out.println("Jumlah karakter dalam teks: " + jumlahKarakter);
                break;
            case 3:
                int jumlahKata = hitungJumlahKata(teks);
                System.out.println("Jumlah kata dalam teks: "+ jumlahKata);
                break;
            case 4:
                System.out.println("Masukkan kata yang ingin dicari: ");
                String cari = sc.nextLine();
                boolean find = cariKata(teks, cari);
                if(find){
                    System.out.println("Kata " + cari +"  ditemukan dalam teks.");
                }else{
                    System.out.println("Kata " + cari +"  tidak ditemukan dalam teks.");
                }
            }
        }
    }
    private static int hitungJumlahKarakter(String teks) {
        return teks.length();
    }
    
    private static int hitungJumlahKata(String teks) {
        if (teks.isEmpty()) {
            return 0;
        } else {
        // Menggunakan split() untuk memisahkan kata-kata berdasarkan spasi
        String[] kataArray = teks.split("\\s+");
        return kataArray.length;
        }
    }
    
    private static boolean cariKata(String teks, String cari){
        return teks.toLowerCase().contains(cari.toLowerCase());
    }
}
