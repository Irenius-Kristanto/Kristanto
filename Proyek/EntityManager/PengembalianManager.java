/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityManager;

import Entity.Peminjaman;
import Entity.Pengembalian;
import Fungsi.Fungsi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Irenius Kristanto & Gabriel Indra
 */
public class PengembalianManager {

    Connection conn;

    public int inputdata(Pengembalian pg) {
        int i = 0;
        try {
            String sql = "insert into pengembalian(kode_pengembalian,tgl_peminjaman,tgl_pengembalian,harga_denda,lama,Total,kode_cd,id_member)"
                    + "values('" + pg.getKode_pengembalian() + "','" + pg.getTgl_peminjaman() + "','" + pg.getTgl_pengembalian() + "','" + pg.getHarga_denda() + "','" + pg.getLama() + "','" + pg.getTotal() + "','" + pg.getKode_cd() + "','" + pg.getId_member() + "')";

            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int ubahdata(Pengembalian pg) {
        int i = 0;
        try {
            String sql = "update pengembalian set tgl_peminjaman='" + pg.getTgl_peminjaman() + "',"
                    + "tgl_pengembalian='" + pg.getTgl_pengembalian() + "',"
                    + "kode_cd='" + pg.getKode_cd() + "',"
                    + "id_member='" + pg.getId_member() + "',"
                    + "total='" + pg.getTotal() + "',"
                    + "lama='" + pg.getLama() + "'"
                    + "where kode_pengembalian='" + pg.getKode_pengembalian() + "'";

            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int hapusdata(String ID) {
        int i = 0;
        try {
            String sql = "Delete from pengembalian where kode_pengembalian='" + ID + "'";
            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }
}
