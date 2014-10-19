/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com135314062.test;

import com135314062.model.Manajer;



/**
 *
 * @author Irenius Kristanto
 */
public class TestManajer {
    public static void main(String[] args) {
        Manajer man1 = new Manajer("Kris", "Tempel", "05-01-1995", "125", 4, 3000);
        Manajer man2 = new Manajer("Krist", "Bantul", "04-01-1995", "126", 3, 4000);
        
        System.out.println("Nama : "+man1.getNama());
        System.out.println("Nip : "+man1.getNip());
        System.out.println("Tempat Lahir : "+man1.getTempatLahir());
        System.out.println("Tanggal lahir : "+man1.getTanggalLahir());
        System.out.println("Golongan : "+man1.getGolongan());
        System.out.println("Eselon : "+man1.getEselon());
        System.out.println("Gaji : "+man1.gaji());
        System.out.println();
        System.out.println("Nama : "+man2.getNama());
        System.out.println("Nip : "+man2.getNip());
        System.out.println("Tempat Lahir : "+man2.getTempatLahir());
        System.out.println("Tanggal lahir : "+man2.getTanggalLahir());
        System.out.println("Golongan : "+man2.getGolongan());
        System.out.println("Eselon : "+man2.getEselon());
        System.out.println("Gaji : "+man2.gaji());
    }
}
