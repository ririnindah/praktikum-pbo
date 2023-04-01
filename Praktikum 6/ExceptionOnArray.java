/*
 * File    : ExceptionOnArray.java 02/04/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : Program penggunaan eksepsi menggunakan class library java
 */

package org;

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayIntegers = new Integer[4];

        try{
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
