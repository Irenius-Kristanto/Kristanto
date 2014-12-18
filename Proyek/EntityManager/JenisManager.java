/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityManager;

import Entity.Jenis;
import Fungsi.Fungsi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Irenius Kristanto & Gabriel Indra
 */
public class JenisManager {

    Connection conn;

    public int inputdata(Jenis jn) {
        int i = 0;
        try {
            String sql = "insert into jenis(kode_jenis,nama_jenis)"
                    + "values('" + jn.getKode_jenis() + "','" + jn.getNama_jenis() + "')";
            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int ubahdata(Jenis jn) {
        int i = 0;
        try {
            String sql = "update jenis set nama_jenis='" + jn.getNama_jenis() + "'" + "where kode_jenis='" + jn.getKode_jenis() + "'";
            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int hapusdata(String ED) {
        int i = 0;
        try {
            String sql = "Delete from jenis where kode_jenis='" + ED + "'";
            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }
}
