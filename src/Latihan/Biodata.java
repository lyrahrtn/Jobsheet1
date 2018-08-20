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
public class Biodata {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String nama, tempat, tanggal, jenis, alamat, motto;
        int nis;
        System.out.print("Nama            : ");
        nama = masukan.next();
        System.out.print("NIS             : ");
        nis = masukan.nextInt();
        System.out.print("Tempat lahir    : ");
        tempat = masukan.next();
        System.out.print("Tanggal lahir   : ");
        tanggal = masukan.next();
        System.out.print("Jenis Kelamin   : ");
        jenis = masukan.next();
        System.out.print("Alamat di Malang: ");
        alamat = masukan.next();
        System.out.print("Motto Hidup     : ");
        motto = masukan.next();
        
        System.out.format("\nNama            : "+(nama));
        System.out.format("\nNIS             : "+(nis));
        System.out.format("\nTempat lahir    : "+(tempat));
        System.out.format("\nTanggal lahir   : "+(tanggal));
        System.out.format("\nJenis Kelamin   : "+(jenis));
        System.out.format("\nAlamat di Malang: "+(alamat));
        System.out.format("\nMotto Hidup     : "+(motto));
    }
}
