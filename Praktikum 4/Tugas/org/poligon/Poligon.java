/*
 * File    : Poligon.java 18/03/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : representasi dasar dari objek poligon (segi banyak)
 */

package org.poligon;

public class Poligon {
    protected int jumlahSisi;

    public void setJumlahSisi(int sisi){
        jumlahSisi = sisi;
    }

    public int getJumlahSisi(){
        return this.jumlahSisi;
    }
}
