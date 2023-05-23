/*
 * File    : MapTest.java 23/05/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : Program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */

package com;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //kunci : integer, nilai : string
        Map<Integer, String> map = new HashMap<Integer, String>();

        //menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");

        //mengambil elemen pertama
        System.out.println(map.get(1));

        //mengambil keseluruhan kunci sebagai onjek collection set
        Set<Integer> key = map.keySet();

        //iterasi untuk mengambil keseluruhan Map
        for (Integer m : map.keySet()) {
            System.out.println(m + "." + map.get(m));
        }
    }
}
