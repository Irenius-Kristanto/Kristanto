/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityManager;

import Entity.Member;
import Fungsi.Fungsi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Irenius Kristanto & Gabriel Indra
 */
public class MemberManager {

    Connection conn;

    public int inputdata(Member mb) {
        int i = 0;
        try {
            String sql = "insert into member(ID_member,nama,tgl_lahir,alamat,no_telp)"
                    + "values('" + mb.getID_member() + "','" + mb.getNama() + "','" + mb.getTgl_lahir() + "','" + mb.getAlamat() + "','" + mb.getNo_telp() + "')";

            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int ubahdata(Member mb) {
        int i = 0;
        try {
            String sql = "update member set nama='" + mb.getNama() + "',"
                    + "tgl_lahir='" + mb.getTgl_lahir() + "',"
                    + "alamat='" + mb.getAlamat() + "',"
                    + "no_telp='" + mb.getNo_telp() + "' "
                    + "where ID_member='" + mb.getID_member() + "'";

            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int hapusdata(String ID) {
        int i = 0;
        try {
            String sql = "Delete from member where ID_member='" + ID + "'";
            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }
}
