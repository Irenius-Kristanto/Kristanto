package com.model;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class Penduduk {

    String nama, tempatLahir, tanggalLahir, noKtp;

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) throws Exception{
        String pola = "[0-9]{16}";
        if (noKtp.matches(pola)) {
            this.noKtp = noKtp;
        }
        else {
            throw new Exception ("No KTP tidak sesuai");
        }
    }
    
    public Penduduk() {
    }
    
    public Penduduk(String nama, String tempatLahir, String tanggalLahir) {
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) throws Exception {
        String pattern = "[A-Za-z\\ .]+";
//        Pattern r = Pattern.compile(pattern);
//        Matcher m = r.matcher(nama);
        
        if (nama.matches(pattern)) {
            this.nama = nama;
        } else {
            throw new Exception("Nama tidak sesuai");
        }
    }

    /**
     * @return the tempatLahir
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * @param tempatLahir the tempatLahir to set
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    /**
     * @return the tanggalLahir
     */
    public String getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * @param tanggalLahir the tanggalLahir to set
     */
    public void setTanggalLahir(String tanggalLahir) throws Exception {
        String tanggal = "[0-9]{2} - [0-9]{2} - [0-9]{4}";
        if (tanggalLahir.matches(tanggal)) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new SubjectException("Tanggal tidak sesuai");
        }
    }    
}
