/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface2.test;

import Interface2.Mahasiswa;
import Interface2.Nilai;

/**
 *
 * @author Irenius Kristanto
 */
public class TestNilai {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Iren", "1234", "Sleman", "01-01-1995");
        Mahasiswa mhs2 = new Mahasiswa("Irena", "1235", "Slemana", "02-01-1995");
        Mahasiswa mhs3 = new Mahasiswa("Ireni", "1236", "Slemani", "03-01-1995");
        
        Nilai nil1 = new Nilai(mhs1, 80, 80);
        Nilai nil2 = new Nilai(mhs2, 90, 80);
        Nilai nil3 = new Nilai(mhs3, 90, 90);
        
        System.out.println("Nama : "+nil1.getMahasiswa().getNama());
        System.out.println("Nilai uts : "+nil1.getUts());
        System.out.println("Nilai uas : "+nil1.getUas());
        
        System.out.println("Nama : "+nil2.getMahasiswa().getNama());
        System.out.println("Nilai uts : "+nil2.getUts());
        System.out.println("Nilai uas : "+nil2.getUas());
        
        System.out.println("Nama : "+nil3.getMahasiswa().getNama());
        System.out.println("Nilai uts : "+nil3.getUts());
        System.out.println("Nilai uas : "+nil3.getUas());
    }
}
