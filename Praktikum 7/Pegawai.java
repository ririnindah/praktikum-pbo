/*
 * File    : Pegawai.java 04/05/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : representasi dari objek Pegawai, yang merupakan super class
 */

package com;

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}
