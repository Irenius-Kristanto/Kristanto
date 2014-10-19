/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com135314062.test;

import com135314062.model.Marketing;

/**
 *
 * @author Irenius Kristanto
 */
public class TestMarketing {
    public static void main(String[] args) {
        Marketing mar1 = new Marketing("Chris", "Jogja", "08-01-1995", "223", 1);
        Marketing mar2 = new Marketing("Christ", "Semarang", "09-01-1995", "323", 2);
        
        System.out.println("Nama : "+mar1.getNama());
        System.out.println("Nip : "+mar1.getNip());
        System.out.println("Tempat Lahir : "+mar1.getTempatLahir());
        System.out.println("Tanggal lahir : "+mar1.getTanggalLahir());
        System.out.println("Golongan : "+mar1.getGolongan());
        System.out.println("Gaji : "+mar1.gaji());
        System.out.println();
        System.out.println("Nama : "+mar2.getNama());
        System.out.println("Nip : "+mar2.getNip());
        System.out.println("Tempat Lahir : "+mar2.getTempatLahir());
        System.out.println("Tanggal lahir : "+mar2.getTanggalLahir());
        System.out.println("Golongan : "+mar2.getGolongan());
        System.out.println("Gaji : "+mar2.gaji());
        
    }
}
