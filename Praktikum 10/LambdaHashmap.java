/* 
* File    : LambdaHashmap.java 04/06/2023
* Penulis : Ririn Indah Cahyani - 24060121130069
* Lab     : PBO B1
* Deskripsi : Implementasi lambda pada Map, digunakan sebagai parameter pada method
              program diatas akan emnampilkan key sebagai NIM dan value sebagai Nama Mahasiswa
*/

import java.util.*;

public class LambdaHashmap {
    public static void main(String[] args) {
        Map<Long, String> map = new HashMap<Long, String>();

        map.put(24060121130069L, "Ririn Indah Cahyani");
        map.put(24060121130077L, "Hana Sabrina");
        map.put(24060121140015L, "Prisca Della Budiman");

        //lambda sebagai parameter
        map.forEach((nim, nama) -> System.out.println("NIM : " + nim + ", Nama : " + nama));
    }
}
