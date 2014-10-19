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
public class Manajer extends Pekerja implements Penghasilan{
    public static int TUNJANGAN_ESELON = 2000;
    private int eselon;

    public Manajer(String nama, String tempatLahir, String tanggalLahir, String nip, int golongan, int eselon) {
        super(nama, tempatLahir, tanggalLahir, nip, golongan);
        this.eselon = eselon;
    }

    public Manajer() {
    }

    public int getEselon() {
        return eselon;
    }

    public void setEselon(int eselon) {
        this.eselon = eselon;
    }
    
    @Override
    public int gaji(){
        return super.gaji() + (TUNJANGAN_ESELON*eselon);
    }
}
