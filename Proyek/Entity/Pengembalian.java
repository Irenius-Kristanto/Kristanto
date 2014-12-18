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
public class Pengembalian {

    private String kode_pengembalian, tgl_peminjaman, tgl_pengembalian, harga_denda, lama, total, kode_cd, id_member;

    public Pengembalian() {
    }

    public Pengembalian(String kode_pengembalian, String tgl_peminjaman, String tgl_pengembalian, String harga_denda, String lama, String total, String kode_cd, String id_member) {
        this.kode_pengembalian = kode_pengembalian;
        this.tgl_peminjaman = tgl_peminjaman;
        this.tgl_pengembalian = tgl_pengembalian;
        this.harga_denda = harga_denda;
        this.lama = lama;
        this.total = total;
        this.kode_cd = kode_cd;
        this.id_member = id_member;
    }

    public String getKode_pengembalian() {
        return kode_pengembalian;
    }

    public void setKode_pengembalian(String kode_pengembalian) throws Exception {
        String pola = "[0-9]{5}";
	if (kode_pengembalian.matches(pola)) {
            this.kode_pengembalian = kode_pengembalian;
        } else {
            throw new Exception("Kode Salah");
        }
    }

    public String getTgl_peminjaman() throws Exception {
        return tgl_peminjaman;
    }

    public void setTgl_peminjaman(String tgl_peminjaman) throws Exception {
        String pola = "[0-9]{2}-[0-9]{2}-[0-9]{4}";
        if (tgl_peminjaman.matches(pola)) {
            this.tgl_peminjaman = tgl_peminjaman;
        } else {
            throw new Exception("Tanggal Salah");
        }
    }

    public String getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    public void setTgl_pengembalian(String tgl_pengembalian) throws Exception {
        String pola = "[0-9]{2}-[0-9]{2}-[0-9]{4}";
        if (tgl_pengembalian.matches(pola)) {
            this.tgl_pengembalian = tgl_pengembalian;
        } else {
            throw new Exception("Tanggal Salah");
        }
    }

    public String getHarga_denda() {
        return harga_denda;
    }

    public void setHarga_denda(String harga_denda) {
        this.harga_denda = harga_denda;
    }

    public String getLama() {
        return lama;
    }

    public void setLama(String lama) {
        this.lama = lama;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getKode_cd() {
        return kode_cd;
    }

    public void setKode_cd(String kode_cd) throws Exception {
        String pola = "[a-z]{2}[0-9]{3}";
        if (kode_cd.matches(pola)) {
            this.kode_cd = kode_cd;
        } else {
            throw new Exception("Kode CD Salah");
        }
    }

    public String getId_member() {
        return id_member;
    }

    public void setId_member(String id_member) throws Exception {
        String pola = "[0-9]+";
        if (id_member.matches(pola)) {
            this.id_member = id_member;
        } else {
            throw new Exception("ID member salah");
        }
    }
}
