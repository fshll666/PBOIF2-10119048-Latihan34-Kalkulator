/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan34.kalkulator;

import java.util.Scanner;
/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Menampilkan Program Perhitungan Kalkulator.
 */
public class PBOIF210119048Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);
        Kalkulator hitung = new Kalkulator();
        System.out.println("===== Aplikasi Kalkulator Bilangan =====");
        
        System.out.print("Masukan angka ke-1 : ");
        hitung.isi1 = masuk.nextDouble();
        
        System.out.print("Masukan angka ke-2 : ");
        hitung.isi2 = masuk.nextDouble();
        
        System.out.println();
        System.out.println("Hasil Pertambahan : " + hitung.tambahBil());
        System.out.println("Hasil Pengurangan : " + hitung.kurangBil());
        System.out.println("Hasil Perkalian : " + hitung.kaliBil());
        System.out.println("Hasil Pembagian : " + hitung.bagihBil());
        
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");
    }
    
}
