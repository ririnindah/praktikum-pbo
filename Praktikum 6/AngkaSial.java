/*
 * File    : AngkaSial.java 02/04/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             Pengenalan klausa 'throw' dan 'throws'
 */

package org;

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");  //baris 12
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase){  //baris 21
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukan angka!!!!");
        }
    }


    /*
     * 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java diatas dieksekusi?
     *    Jawaban:
     *    Iya tereksekusi, baris 12 diatas akan tereksekusi ketika masukan angka berupa 10 pada
     *    baris ke-22 (as.cobaAngka(10)). baris 12 dieksekusi dikarenakan angka 10 bukan merupakan angka sial
     *    Hasil eksekusi : 10 bukan angka sial
     * 
     * 2. Apakah baris 21 pada AngkaSial.java diatas dieksekusi?
     *    Jawaban:
     *    Iya tereksekusi, baris 21 diatas akan tereksekusi ketika masukan angka berupa 21 pada 
     *    baris ke 23 (as.cobaAngka(13)). baris 21 dieksekusi dikarenakan angka 13 
     *    merupakan angka sial yang didefinisikan pada baris ke 14.
     *    Hasil eksekusi : jangan memasukan angka 13 karena angka sial !!! (dari class turunan AngkaSialException)
     */
}
