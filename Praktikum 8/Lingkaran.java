/*
 * File    : Lingkaran.java 23/05/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : implementasi Lingkaran sebagai BangunDatar
 */

package com;

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
