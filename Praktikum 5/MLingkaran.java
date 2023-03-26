/*
 * File    : MLingkaran.java 26/03/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : implementasi cara menghitung luas lingkaran
 */


package org;

import java.util.Scanner; 

public class MLingkaran {
    public static void main(String[] args) {
        //Kamus Lokal
        double jari2;

        //input dari user
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input jejari : ");
        jari2 = userInput.nextDouble();

        Lingkaran lingkaran = new Lingkaran(jari2);

        System.out.println("Luas lingkaran : " + lingkaran.hitungLuas());


    }
}
