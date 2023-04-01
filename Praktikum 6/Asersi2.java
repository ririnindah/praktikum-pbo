/*
 * File    : Asersi2.java 02/04/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : Program untuk demo asersi, yang akan menolak 
 *             input jari-jari lingkaran yang bernilai nol
 */

package org;

class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;

        assert(jariJari>0):"jari jari tidak boleh nol";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }

    /*
     * Secara konsep, ada yang kurang tepat pada program Asersi2 diatas?
     * jawaban:
     * Pada baris ke 26 terdapat kesalahan, dikarenakan nilai dari AssertionError adalah "jari-jari tidak boleh nol" tetapi
     * kondisi pada assersi adalah (jariJari > 0). seharusnya kondisi asersi (jariJari<=0)   
     */
}
