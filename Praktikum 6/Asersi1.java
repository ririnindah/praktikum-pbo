/*
 * File    : Asersi1.java 02/04/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : Program untuk menunjukkan asersi
 */

package org;

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x > 0){
            System.out.println("x bilangan positif");
        } else {
            assert (x < 0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
