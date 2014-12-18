/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityManager;

import Entity.CDRental;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Fungsi.Fungsi;

/**
 *
 * @author Irenius Kristanto & Gabriel Indra
 */
public class CDRentalManager {

    Connection conn;

    public int inputdata(CDRental cdr) {

        int i = 0;
        try {
            String sql = "insert into cd(kode_cd,judul,tahun_rilis,harga,stok,kode_jenis)"
                    + " values('" + cdr.getKode_CD() + "','" + cdr.getJudul() + "','" + cdr.getTahun_rilis() + "','" + cdr.getHarga() + "','" + cdr.getStok() + "','" + cdr.getKode_jenis() + "')";

            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int ubahdata(CDRental cdr) {

        int i = 0;
        try {
            String sql = "update cd set Judul='" + cdr.getJudul() + "',"
                    + "tahun_rilis='" + cdr.getTahun_rilis() + "',"
                    + "harga='" + cdr.getHarga() + "',"
                    + "stok='" + cdr.getStok() + "',"
                    + "kode_jenis='" + cdr.getKode_jenis() + "' "
                    + "where kode_cd='" + cdr.getKode_CD() + "'";

            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int hapusdata(String ID) {

        int i = 0;
        try {
            String sql = "Delete from cd where kode_CD='" + ID + "'";
            i = Fungsi.Equery(sql);
            return i;

        } catch (Exception e) {
            return i;
        }
    }
}
