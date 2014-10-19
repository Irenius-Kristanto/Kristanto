/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com135314062.model;

import java.util.ArrayList;

/**
 *
 * @author Irenius Kristanto
 */
public class PerusahaanList implements Pengeluaran {

    private ArrayList<Pekerja> listPekerja = new ArrayList<Pekerja>();

    public ArrayList<Pekerja> getListPekerja() {
        return listPekerja;
    }

    public void setListPekerja(ArrayList<Pekerja> listPekerja) {
        this.listPekerja = listPekerja;
    }

    public void tambahPekerja(Pekerja pekerja) {
        listPekerja.add(pekerja);
    }

    @Override
    public int gajiTotal() {
        int total = 0;
        for (int i = 0; i < getListPekerja().size(); i++) {
            total = total + listPekerja.get(i).gaji();
        }
        return total;
    }

}
