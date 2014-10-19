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
public class Marketing extends Pekerja implements Penghasilan{
    public static int TUNJANGAN_TRANSPORT = 500;

    public Marketing(String nama, String tempatLahir, String tanggalLahir, String nip, int golongan) {
        super(nama, tempatLahir, tanggalLahir, nip, golongan);
    }

    public Marketing() {
    }
    
    
    @Override
    public int gaji(){
        return super.gaji() + TUNJANGAN_TRANSPORT;
    }
}
