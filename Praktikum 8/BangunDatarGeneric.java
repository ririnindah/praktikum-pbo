/*
 * File    : BangunDatarGeneric.java 23/05/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : kelas kkosntruksi generic untuk BangunDatar
 */

package com;

public class BangunDatarGeneric <T1 extends BangunDatar>{
    private T1 bangundatar;

    public void set (T1 tipeBangunDatar){
        bangundatar = tipeBangunDatar;
    }
    
    public T1 get(){
        return bangundatar;
    }

    public double hitungKeliling(){
        return bangundatar.hitungKeliling();
    }
}
