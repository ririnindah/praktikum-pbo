/*
 * File    : MKubus.java 18/03/2023
 * Penulis : Ririn Indah Cahyani - 24060121130069
 * Lab     : PBO B1
 * Deskripsi : driver class untuk kubus
 */

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args) {
        System.out.println("\n----- KUBUS -----\n");
        BujurSangkar sisi = new BujurSangkar(4);
        Kubus kubus = new Kubus(sisi);

        kubus.printSisi();
        System.out.println("Volume Kubus : " + kubus.hitungVolume());
        System.out.println("Luas Alas Kubus : "+ kubus.hitungLuasAlas());
    }
}
