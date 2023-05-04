/*
 * File    : Manajer.java 04/05/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : representasi dari objek Manajer, turunan kelas Pegawai
 */


package com;

public class Manajer extends Pegawai{
    private int tunjangan = 7000000;

    public Manajer(String nama) {
        super(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
