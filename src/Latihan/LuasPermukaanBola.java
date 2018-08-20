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
public class LuasPermukaanBola {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan jari-jari = ");
        float jari = masukan.nextFloat();
        System.out.println("Luas Permukaan Bola = "+(4*3.14*jari*jari));
    }
}
