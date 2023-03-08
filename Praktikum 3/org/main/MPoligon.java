/*
 * File    : MPoligon.java 08/03/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : driver class untuk poligon , persegi panjang dan segitiga
 */


package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        //PersegiPanjang
        System.out.println("\n------ PERSEGI PANJANG ------ ");
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        //Segitiga
        System.out.println("\n------ SEGITIGA ------ ");
        Segitiga segitiga = new Segitiga(4, 10, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas2());
    }
}
