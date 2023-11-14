package Tugas;

import java.util.Scanner;
import java.lang.Math;

public class APIcalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
        System.out.println("=== Calculator ===\n" +
                            "1. Akar Kuadrat\n" +
                            "2. Pangkat\n" +
                            "3. Logaritma\n" +
                            "4. Faktorial\n" +
                            "5. Keluar");
        System.out.println("Pilih operasi (1/2/3/4/5): ");
        int cal = sc.nextInt();
        
        if(cal==5){
            System.out.println("Terima kasih telah menggunakan kalkulator ini.");
            break;
        }
        
        double result = 0;
        switch(cal){
            case 1:
                System.out.println("Masukkan angka: ");
                double Akar = sc.nextDouble();
                result = Math.sqrt(Akar);
                System.out.println("Hasil akar kuadrat dari " + Akar +" adalah "+ result);
                break;
            case 2:
                System.out.println("Masukkan angka: ");
                double angka = sc.nextDouble();
                System.out.println("Masukkan pangkat: ");
                double Pangkat = sc.nextDouble();
                result = Math.pow(angka, Pangkat);
                System.out.println( angka +" pangkat "+ Pangkat + " adalah " + result);
                break;
            case 3:
                System.out.println("Masukkan angka: ");
                double Logaritma = sc.nextDouble();
                result = Math.log(Logaritma);
                System.out.println("Logaritma natural dari " + Logaritma + " adalah " + result);
                break;
            case 4:
                System.out.println("Masukkan angka: ");
                double Factorial = sc.nextDouble();
                int i = 1, fact = 1;
                while(i<=Factorial){
                    fact = fact*i;
                    i++;
                }
                System.out.println("Faktorial dari " + Factorial + " adalah " + fact);
                break;
            default:
                System.out.println("Pilihan tidak Valid !!");
        }
        }
    }
}