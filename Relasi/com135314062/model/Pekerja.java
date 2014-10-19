/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com135314062.model;

/**
 *
 * @author Irenius Kristanto
 */
public class Pekerja extends Penduduk implements Penghasilan{
    public static int UPAH_POKOK = 1000;
    private String nip;
    private int golongan;

    public Pekerja(String nama, String tempatLahir, String tanggalLahir, String nip, int golongan) {
        super(nama, tempatLahir, tanggalLahir);
        this.nip = nip;
        this.golongan = golongan;
    }

    public Pekerja() {
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }
    
    @Override
    public int gaji(){
        return golongan * UPAH_POKOK;
    }
}
