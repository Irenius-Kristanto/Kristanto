/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface2.test;

import Interface2.Penduduk;

/**
 *
 * @author Irenius Kristanto
 */
public class TestPenduduk {
    public static void main(String[] args) {
        
        Penduduk pen1 = new Penduduk("Iren", "Sleman", "01-01-1995");
        Penduduk pen2 = new Penduduk("Ireni", "Slemani", "02-01-1995");
        Penduduk pen3 = new Penduduk("Irena", "Slemana", "03-01-1995");
        
        System.out.println("Nama : "+pen1.getNama());
        System.out.println("Tempat Lahir : "+pen1.getTempatLahir());
        System.out.println("Tanggal lahir : "+pen1.getTanggalLahir());
        
        System.out.println("Nama : "+pen2.getNama());
        System.out.println("Tempat Lahir : "+pen2.getTempatLahir());
        System.out.println("Tanggal lahir : "+pen2.getTanggalLahir());
        
        System.out.println("Nama : "+pen3.getNama());
        System.out.println("Tempat Lahir : "+pen3.getTempatLahir());
        System.out.println("Tanggal lahir : "+pen3.getTanggalLahir());
    }
}
