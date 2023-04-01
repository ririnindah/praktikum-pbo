/*
 * File    : AngkaSialException.java 02/04/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13
 */

package org;

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukan angka 13 karena angka sial !!!");
    }
}
