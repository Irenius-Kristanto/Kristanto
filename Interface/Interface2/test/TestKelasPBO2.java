/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface2.test;

import Interface2.KelasPBO2;
import Interface2.Mahasiswa;
import Interface2.Nilai;

/**
 *
 * @author Irenius Kristanto
 */
public class TestKelasPBO2 {
    public static void main(String[] args) {
        KelasPBO2 tes1 = new KelasPBO2();
        
        Mahasiswa mhs1 = new Mahasiswa("Iren", "1234", "Sleman", "01-01-1995");
        Mahasiswa mhs2 = new Mahasiswa("Irena", "1235", "Slemana", "02-01-1995");
        Mahasiswa mhs3 = new Mahasiswa("Ireni", "1236", "Slemani", "03-01-1995");
        
        Nilai nil1 = new Nilai(mhs1, 80, 80);
        Nilai nil2 = new Nilai(mhs2, 90, 80);
        Nilai nil3 = new Nilai(mhs3, 90, 90);
        
        tes1.tambahMahasiswa(mhs1, nil1);
        tes1.tambahMahasiswa(mhs2, nil2);
        tes1.tambahMahasiswa(mhs3, nil3);
        
        
        
        for (int i = 0; i < tes1.getListMahasiswa().size(); i++) {
            System.out.println("Data Mahasiswa ke "+(i+1)+" : ");
            System.out.println("Nama : "+tes1.getListMahasiswa().get(i).getNama());
            System.out.println("Nim : "+tes1.getListMahasiswa().get(i).getNim());
            System.out.println("Nilai uts : "+tes1.getListNilai().get(i).getUts());
            System.out.println("Nilai uas : "+tes1.getListNilai().get(i).getUas());
            System.out.println();
        }
        
        tes1.rerataNilai();
        
        System.out.println(tes1.contains(mhs1));
        System.out.println(tes1.contains(mhs2));
        System.out.println(tes1.contains(mhs3));
        System.out.println();
        tes1.hapusMahasiswa(mhs3);
        System.out.println();
        System.out.println("Sisa Mahasiswa : ");
        for (int i = 0; i < tes1.getListMahasiswa().size(); i++) {
            System.out.println("Nama : "+tes1.getListMahasiswa().get(i).getNama());
            System.out.println("Nim : "+tes1.getListMahasiswa().get(i).getNim());
            System.out.println();
        }
    }
}
