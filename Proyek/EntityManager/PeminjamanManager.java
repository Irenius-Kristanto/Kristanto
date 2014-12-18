/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityManager;

import Entity.Member;
import Entity.Peminjaman;
import Fungsi.Fungsi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Irenius Kristanto & Gabriel Indra
 */
public class PeminjamanManager {

    Connection conn;

    public int inputdata(Peminjaman pinjam) {
        int i =0;
        try {
            String sql = "insert into peminjaman(no_peminjaman,ID_member,kode_jenis,kode_CD,tgl_pinjam,harga,jumlah,total)"
                    + "values('" + pinjam.getNo_peminjaman() + "','" + pinjam.getID_member() + "','" + pinjam.getKode_jenis() + "','" + pinjam.getKode_cd() + "','" + pinjam.getTgl_pinjam() + "','" + pinjam.getHarga() + "','" + pinjam.getJumlah() + "','" + pinjam.getTotal() + "')";

            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int ubahdata(Peminjaman pinjam) {
        int i = 0;
        try {
            String sql = "update peminjaman set ID_member='" + pinjam.getID_member() + "',"
                    + "kode_jenis='" + pinjam.getKode_jenis() + "',"
                    + "kode_cd='" + pinjam.getKode_cd() + "',"
                    + "tgl_pinjam='" + pinjam.getTgl_pinjam() + "',"
                    + "jumlah='" + pinjam.getJumlah() + "'"
                    + "where no_peminjaman='" + pinjam.getNo_peminjaman() + "'";

            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int hapusdata(String ID) {
        int i = 0;
        try {
            String sql = "Delete from peminjaman where no_peminjaman='" + ID + "'";
            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }
}
