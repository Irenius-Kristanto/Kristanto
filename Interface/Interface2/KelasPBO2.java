/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface2;

import java.util.ArrayList;

/**
 *
 * @author Irenius Kristanto
 */
public class KelasPBO2 implements Pengajaran {

    private ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
    private ArrayList<Nilai> listNilai = new ArrayList<Nilai>();

    public ArrayList<Nilai> getListNilai() {
        return listNilai;
    }

    public void setListNilai(ArrayList<Nilai> listNilai) {
        this.listNilai = listNilai;
    }

    public ArrayList<Mahasiswa> getListMahasiswa() {
        return listMahasiswa;
    }

    public void setListMahasiswa(ArrayList<Mahasiswa> listMahasiswa) {
        this.listMahasiswa = listMahasiswa;
    }

    @Override
    public void tambahMahasiswa(Mahasiswa mhs, Nilai nilai) {
        listMahasiswa.add(mhs);
        listNilai.add(nilai);
    }

    @Override
    public void rerataNilai() {
        for (int i = 0; i < getListMahasiswa().size(); i++) {
            System.out.println("Nilai rata-rata mahasiswa ke " + (i + 1) + " : " + (listNilai.get(i).getUts() + listNilai.get(i).getUas()) / 2);
            System.out.println();
        }

    }

    public boolean contains(Mahasiswa mhs) {
        if (listMahasiswa.isEmpty()) {
            return false;
        } else {
            return listMahasiswa.contains(mhs);
        }
    }

    public void hapusMahasiswa(Mahasiswa mhs) {
        if (contains(mhs)) {
            listMahasiswa.remove(mhs);
            System.out.println("Mahasiswa sudah dihapus");
        } else {
            System.out.println("Mahasiswa tidak ada");
        }
    }
}
