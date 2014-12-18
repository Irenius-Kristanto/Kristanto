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
public class Member {

    private String ID_member, nama, tgl_lahir, alamat, no_telp;

    public Member() {
    }

    public Member(String ID_member, String nama, String tgl_lahir, String alamat, String no_telp) {
        this.ID_member = ID_member;
        this.nama = nama;
        this.tgl_lahir = tgl_lahir;
        this.alamat = alamat;
        this.no_telp = no_telp;
    }

    public String getID_member() {
        return ID_member;
    }

    public void setID_member(String ID_member) throws Exception {
        String pola = "[0-9]+";
        if (ID_member.matches(pola)) {
            this.ID_member = ID_member;
        } else {
            throw new Exception("ID Member Salah");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) throws Exception {
        String pola = "[a-zA-Z\\ .,']+";
        if (nama.matches(pola)) {
            this.nama = nama;
        } else {
            throw new Exception("Nama Salah");
        }
    }

    public String getTgl_lahir() {
        return tgl_lahir;
    }

    public void setTgl_lahir(String tgl_lahir) throws Exception {
        String pola = "[0-9]{2}-[0-9]{2}-[0-9]{4}";
        if (tgl_lahir.matches(pola)) {
            this.tgl_lahir = tgl_lahir;
        } else {
            throw new Exception("Tanggal Lahir Salah");
        }
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) throws Exception {
        String pola = "[a-zA-Z0-9\\ .,]+";
        if (alamat.matches(pola)) {
            this.alamat = alamat;
        } else {
            throw new Exception("Alamat Salah");
        }
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) throws Exception {
        String pola = "[0-9]{12}";
        if (no_telp.matches(pola)) {
            this.alamat = alamat;
        } else {
            throw new Exception("No Telepon Salah");
        }
        this.no_telp = no_telp;
    }
}
