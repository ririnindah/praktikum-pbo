/*
 * File    : ArrayListTest.java 23/05/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : program penggunaan objek ArrayList sebagai Collection class
 */

package com;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        //inisialisasi ArrayList yang hanya dapat berisi objek string
        ArrayList<String> strings = new ArrayList<String>();
        
        //menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        //menghapus elemen
        strings.remove("praktikum");

        //iterasi pada keseluruhan ArrayList
        for (String s : strings){
            System.out.println(s+" ");
        }
    }
}
