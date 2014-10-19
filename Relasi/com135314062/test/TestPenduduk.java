/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com135314062.test;

import com135314062.model.Penduduk;

/**
 *
 * @author Irenius Kristanto
 */
public class TestPenduduk {

    public static void main(String[] args) {
        Penduduk pen1 = new Penduduk("Iren", "Sleman", "01-01-1995");
        Penduduk pen2 = new Penduduk("Nius", "Turi", "02-01-1995");
    
        System.out.println("Nama : "+pen1.getNama());
        System.out.println("Tempat Lahir : "+pen1.getTempatLahir());
        System.out.println("Tanggal Lahir : "+pen1.getTanggalLahir());
        System.out.println();
        System.out.println("Nama : "+pen2.getNama());
        System.out.println("Tempat Lahir : "+pen2.getTempatLahir());
        System.out.println("Tanggal Lahir : "+pen2.getTanggalLahir());
    }
}
