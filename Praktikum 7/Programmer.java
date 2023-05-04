/*
 * File    : Programmer.java 04/05/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : representasi dari objek Programmer, turunan kelas Pegawai
 */

package com;

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
