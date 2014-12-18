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
public class Jenis {

    private String kode_jenis, nama_jenis;

    public Jenis() {
    }

    public Jenis(String kode_jenis, String nama_jenis) {
        this.kode_jenis = kode_jenis;
        this.nama_jenis = nama_jenis;
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

    public String getNama_jenis() {
        return nama_jenis;
    }

    public void setNama_jenis(String nama_jenis) throws Exception {
        String pola = "[a-zA-Z\\ .',]+";
        if (nama_jenis.matches(pola)) {
            this.nama_jenis = nama_jenis;
        } else {
            throw new Exception("Nama Jenis Salah");
        }
    }
}
