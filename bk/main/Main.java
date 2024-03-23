/*
    Nama        : Chandra Wijayakusuma
    NIM         : 24060122140106
    Nama File   : bukuFiksi.java
    Deskripsi   : File Main dari proyek buku
*/
package bk.main;

import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class Main {
    public static void main(String[] args) {
        bukuAkademik CryptoDemy = new bukuAkademik("Akademi Crypto", "Kalimasada", "2024", "Crypto", 300, 200000);
        CryptoDemy.view();

        bukuNovel RiseTheDark = new bukuNovel("Solo Leveling", "Sung Jin Woo", "2015", "Manhwa", 200, 100000);
        RiseTheDark.view();
    }
} 