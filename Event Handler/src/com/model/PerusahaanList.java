package com.model;
import java.util.ArrayList;
public class PerusahaanList {

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

    public int gajiTotal() {
        int total = 0;
        for (int i = 0; i < getListPekerja().size(); i++) {
            total = total + listPekerja.get(i).gaji();
        }
        return total;
    }

    public void hapusPekerja(Pekerja pekerja) {
        if (contains(pekerja)) {
            listPekerja.remove(pekerja);
            System.out.println("Pekerja sudah dihapus");
        } else {
            System.out.println("Pekerja tidak ada");
        }
    }

    public boolean contains(Pekerja pekerja) { //apakah ada
        if (listPekerja.isEmpty()) {
            return false;
        } else {
            return listPekerja.contains(pekerja);
        }
    }
    
    public int jumlahPekerja(){
        return listPekerja.size();
    }
}