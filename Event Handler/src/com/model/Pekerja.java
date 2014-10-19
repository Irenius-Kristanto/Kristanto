package com.model;

public class Pekerja extends Penduduk {

    public static int UPAH_POKOK = 1000;
    private String nip;
    private int golongan;

    public Pekerja(String nama, String nip, int golongan,
            String tempatLahir, String tanggalLahir) {
        super(nama, tempatLahir, tanggalLahir);
        this.nip = nip;
        this.golongan = golongan;
    }

    public Pekerja() {
    }

    /**
     * @return the nip
     */
    public String getNip() {
        return nip;
    }

    /**
     * @param nip the nip to set
     */
    public void setNip(String nip) {
        this.nip = nip;
    }

    /**
     * @return the golongan
     */
    public int getGolongan() {
        return golongan;
    }

    /**
     * @param golongan the golongan to set
     */
    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    int gaji() {
        return golongan * UPAH_POKOK;
    }
}
