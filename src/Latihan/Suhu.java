/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author SMK TELKOM
 */
import java.util.Scanner;
public class Suhu {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float r, f, k;
        System.out.print("Masukkan nilai dari suhu celcius : ");
        float c = masukan.nextInt();
        System.out.print("Pilih konversi ke r, f, k : ");
        String pilihan = masukan.next();
        switch (pilihan) {
            case "k" :
                System.out.println("Hasil : "+(k = c+273));
                break;
            case "r" :
                System.out.println("Hasil : "+(r = c*4/5));
                break;
            case "f" :
                System.out.println("Hasil : "+(f = c*9/5+32));
                break;
        }
    }
}
