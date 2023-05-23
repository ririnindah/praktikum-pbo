/*
 * File    : BangunDatarGenericTest.java 23/05/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : main cclass untuk generic bangun datar
 */

package com;

import javax.xml.transform.SourceLocator;

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran lingkaran1 = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();

        bdg.set(lingkaran1);
        System.out.println("keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("tipe generi : "+bdg.get().getClass().getName());
    }
}
