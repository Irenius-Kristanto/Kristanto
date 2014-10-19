/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface2.test;

import Interface2.Mahasiswa;

/**
 *
 * @author Irenius Kristanto
 */
public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Iren", "1234", "Sleman", "01-01-1995");
        Mahasiswa mhs2 = new Mahasiswa("Irena", "1235", "Slemana", "02-01-1995");
        Mahasiswa mhs3 = new Mahasiswa("Ireni", "1236", "Slemani", "03-01-1995");
        
        System.out.println("Nama : "+mhs1.getNama());
        System.out.println("Nim : "+mhs1.getNim());
        System.out.println("Tempat Lahir : "+mhs1.getTempatLahir());
        System.out.println("Tanggal lahir : "+mhs1.getTanggalLahir());
        
        
        System.out.println("Nama : "+mhs2.getNama());
        System.out.println("Nim : "+mhs2.getNim());
        System.out.println("Tempat Lahir : "+mhs2.getTempatLahir());
        System.out.println("Tanggal lahir : "+mhs2.getTanggalLahir());
        
        System.out.println("Nama : "+mhs3.getNama());
        System.out.println("Nim : "+mhs3.getNim());
        System.out.println("Tempat Lahir : "+mhs3.getTempatLahir());
        System.out.println("Tanggal lahir : "+mhs3.getTanggalLahir());
    }
}
