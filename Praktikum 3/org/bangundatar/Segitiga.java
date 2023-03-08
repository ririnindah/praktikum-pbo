/*
 * File    : Segitiga.java 08/03/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : representasi dari objek segitiga, turunan kelas poligon
 */

package org.bangundatar;

import java.io.PushbackInputStream;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    double alas, tinggi;

    public Segitiga (double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas2(){
        return (alas*tinggi)/2;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga Bersisi " + this.getJumlahSisi());

    }

}
