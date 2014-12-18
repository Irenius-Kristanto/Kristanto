/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author Irenius Kristanto & Gabriel Indra
 */
public class CDRental {

    
    
    private String kode_CD, Judul, tahun_rilis, harga, stok, kode_jenis;

    public CDRental() {
    }
    
    public CDRental(String kode_CD, String Judul, String tahun_rilis, String harga, String stok, String kode_jenis) {
        this.kode_CD = kode_CD;
        this.Judul = Judul;
        this.tahun_rilis = tahun_rilis;
        this.harga = harga;
        this.stok = stok;
        this.kode_jenis = kode_jenis;
    }

    public String getKode_CD() {
        return kode_CD;
    }

    public void setKode_CD(String kode_CD) throws Exception {
        String pola = "[a-z]{2}[0-9]{3}";
        if (kode_CD.matches(pola)) {
            this.kode_CD = kode_CD;
        } else {
            throw new Exception("Kode CD Salah");
        }
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) throws Exception {
        String pola = "[a-zA-Z0-9\\ .,']+";
        if (Judul.matches(pola)) {
            this.Judul = Judul;
        } else {
            throw new Exception("Judul Salah");
        }
    }

    public String getTahun_rilis() {
        return tahun_rilis;
    }

    public void setTahun_rilis(String tahun_rilis) throws Exception {
        String pola = "[0-9]{4}";
        if (tahun_rilis.matches(pola)) {
            this.tahun_rilis = tahun_rilis;
        } else {
            throw new Exception("Tahun Rilis Salah");
        }       
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) throws Exception {
        String pola = "[0-9]+";
        if (stok.matches(pola)) {
            this.stok = stok;
        } else {
            throw new Exception("Stok Salah");
        }
        
    }

    public String getKode_jenis() {
        return kode_jenis;
    }

    public void setKode_jenis(String kode_jenis) throws Exception {
        String pola = "[a-z]{2}";
        if (kode_jenis.matches(pola)) {
            this.kode_jenis = kode_jenis;
        } else {
            throw new Exception("Kode Jenis Salah");
        }
        
    }
}
