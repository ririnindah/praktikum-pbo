/*
 * File    : Lingkaran.java 26/03/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : Class implementasi IArea berupa cara mengitung luas lingkaran
 */


package org;

import static java.lang.Math.PI;

public class Lingkaran {
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
