/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com135314062.test;

import com135314062.model.Pekerja;

/**
 *
 * @author Irenius Kristanto
 */
public class TestPekerja {
    public static void main(String[] args) {
        Pekerja pek1 = new Pekerja("Kris", "Tempel", "03-01-1995", "123", 1);
        Pekerja pek2 = new Pekerja("Tanto", "Turi", "04-01-1995", "124", 2);
        
        System.out.println("Nama : "+pek1.getNama());
        System.out.println("Nip : "+pek1.getNip());
        System.out.println("Tempat Lahir : "+pek1.getTempatLahir());
        System.out.println("Tanggal lahir : "+pek1.getTanggalLahir());
        System.out.println("Golongan : "+pek1.getGolongan());
        System.out.println("Gaji : "+pek1.gaji());
        System.out.println();
        System.out.println("Nama : "+pek2.getNama());
        System.out.println("Nip : "+pek2.getNip());
        System.out.println("Tempat Lahir : "+pek2.getTempatLahir());
        System.out.println("Tanggal lahir : "+pek2.getTanggalLahir());
        System.out.println("Golongan : "+pek2.getGolongan());
        System.out.println("Gaji : "+pek2.gaji());
    }
}
