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
public class Peminjaman {
    private String no_peminjaman, ID_member, kode_jenis, kode_cd, tgl_pinjam, harga, jumlah, total;

    public Peminjaman() {
    }

    public Peminjaman(String no_peminjaman, String ID_member, String kode_jenis, String kode_cd, String tgl_pinjam, String harga, String jumlah, String total) {
        this.no_peminjaman = no_peminjaman;
        this.ID_member = ID_member;
        this.kode_jenis = kode_jenis;
        this.kode_cd = kode_cd;
        this.tgl_pinjam = tgl_pinjam;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
    }

    public String getNo_peminjaman() {
        return no_peminjaman;
    }

    public void setNo_peminjaman(String no_peminjaman) throws Exception {
        String pola = "[0-9]{5}";
        if (no_peminjaman.matches(pola)) {
            this.no_peminjaman = no_peminjaman;
        } else {
            throw new Exception ("No Peminjaman Salah");
        }
    }

    public String getID_member() {
        return ID_member;
    }

    public void setID_member(String ID_member) throws Exception {
        String pola = "[0-9]+";
        if (ID_member.matches(pola)) {
            this.ID_member = ID_member;
        } else {
           throw new Exception ("ID member salah"); 
        }
    }

    public String getKode_jenis() {
        return kode_jenis;
    }

    public void setKode_jenis(String kode_jenis) throws Exception{
	String pola = "[a-z]{2}";
	if (kode_jenis.matches(pola)){
        this.kode_jenis = kode_jenis;
	}else{
	   throw new Exception ("Kode Jenis Salah");
	}
    }

    public String getKode_cd() {
        return kode_cd;
    }

    public void setKode_cd(String kode_cd) throws Exception{
	String pola = "[a-z]{2}[0-9]{3}";
	if (kode_cd.matches(pola)){
        this.kode_cd = kode_cd;
	}else{
	   throw new Exception ("Kode CD Salah");		
	}
    }

    public String getTgl_pinjam() {
        return tgl_pinjam;
    }

    public void setTgl_pinjam(String tgl_pinjam) throws Exception{
	String pola = "[0-3]{2}-[0-9]{2}-[0-9]{4}";
	if (tgl_pinjam.matches(pola)){
        this.tgl_pinjam = tgl_pinjam;
	}else{
	   throw new Exception ("Tanggal Salah");			
	}
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) throws Exception{
	String pola = "[0-9]+";
	if (jumlah.matches(pola)){	        
	this.jumlah = jumlah;
	}else{
	   throw new Exception ("jumlah Salah");					
	}
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
        
}
