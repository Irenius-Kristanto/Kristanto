package com.model;

//import java.util.StringTokenizer;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

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
    public void setNip(String nip) throws Exception {
        String arr = "P[0-9]{8}";
        if (nip.matches(arr)) {
            if (nip.length() == 9) {
                this.nip = nip;
            } else {
                throw new Exception("NIP harus 9 digit");
            }
        } else {
            throw new Exception("NIP harus 9 digit dengan diawali huruf P");
        }
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
