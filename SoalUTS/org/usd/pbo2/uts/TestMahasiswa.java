/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usd.pbo2.uts;

import org.usd.pbo2.model.Mahasiswa;

/**
 *
 * @author puspa
 */
public class TestMahasiswa {

    public static void main(String[] args) throws Exception {

        Mahasiswa mhs1 = new Mahasiswa("0071231233", "James Bond", "MI6");
        Mahasiswa mhs2 = new Mahasiswa("006", "Wiro Sableng", "MI6");
        Mahasiswa mhs3 = new Mahasiswa("008", "Saras", "MI6");

        Mahasiswa.tambahMahasiswa(mhs1);
        Mahasiswa.tambahMahasiswa(mhs2);
        Mahasiswa.tambahMahasiswa(mhs3);
        //Tampilkan daftar nama mahasiswa seluruhnya
        for (int i = 0; i < Mahasiswa.DAFTAR_MAHASISWA.size(); i++) {
            System.out.print("NIM: " + Mahasiswa.DAFTAR_MAHASISWA.get(i).getNim());
            System.out.print(" Nama: " + Mahasiswa.DAFTAR_MAHASISWA.get(i).getNama());
            System.out.println(" Prodi: " + Mahasiswa.DAFTAR_MAHASISWA.get(i).getProdi());
        }
    }
}
