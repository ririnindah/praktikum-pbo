/*
 * File    : BujurSangkar.java 18/03/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : representasi dari objek bujur sangkar, turunan kelas poligon
 */

package org.bangundatar;

import org.poligon.*;

public class BujurSangkar extends Poligon{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas(){
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi(){
        return this.panjangSisi;
    }
}
