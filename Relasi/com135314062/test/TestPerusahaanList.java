/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com135314062.test;

import com135314062.model.Manajer;
import com135314062.model.Marketing;
import com135314062.model.Pekerja;
import com135314062.model.PerusahaanList;

/**
 *
 * @author Irenius Kristanto
 */
public class TestPerusahaanList {
    public static void main(String[] args) {
        PerusahaanList list = new PerusahaanList();
        
        Pekerja pek1 = new Pekerja("Kris", "Tempel", "03-01-1995", "123", 1);
        Pekerja pek2 = new Pekerja("Tanto", "Turi", "04-01-1995", "124", 2);
        Manajer man1 = new Manajer("Kris", "Tempel", "05-01-1995", "125", 4, 3000);
        Manajer man2 = new Manajer("Krist", "Bantul", "04-01-1995", "126", 3, 4000);
        Marketing mar1 = new Marketing("Chris", "Jogja", "08-01-1995", "223", 1);
        Marketing mar2 = new Marketing("Christ", "Semarang", "09-01-1995", "323", 2);
        
        list.tambahPekerja(pek1);
        list.tambahPekerja(pek2);
        list.tambahPekerja(man1);
        list.tambahPekerja(man2);
        list.tambahPekerja(mar1);
        list.tambahPekerja(mar2);
        
        for (int i = 0; i < list.getListPekerja().size(); i++) {
            System.out.println("Nama : "+list.getListPekerja().get(i).getNama());
            System.out.println("Nip : "+list.getListPekerja().get(i).getNip());
            System.out.println("Tempat Lahir : "+list.getListPekerja().get(i).getTempatLahir());
            System.out.println("Tanggal Lahir : "+list.getListPekerja().get(i).getTanggalLahir());
            System.out.println("Golongan : "+list.getListPekerja().get(i).getGolongan());
            System.out.println("Gaji : "+list.getListPekerja().get(i).gaji());
            System.out.println();
        }
        
        System.out.println("Gaji Total : "+list.gajiTotal());
    }
}
