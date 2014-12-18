/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityManager;

import Entity.Login;
import Fungsi.Fungsi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Irenius Kristanto
 */
public class LoginManager {

    Connection conn;

    public int login(Login lg) {
        int i = 0;
        try {
            String sql = "select * from login where username like '" + lg.getUsername() + "' and '" + lg.getPassword() + "'";

            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int inputdata(Login log) {
        int i = 0;
        try {
            String sql = "insert into login(username,password)"
                    + "values('" + log.getUsername() + "','" + log.getPassword() + "')";

            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int ubahdata(Login log) {
        int i = 0;
        try {
            String sql = "update login set password='" + log.getPassword() + "'"
                    + "where username='" + log.getUsername() + "'";

            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }

    public int hapusdata(String ID) {
        int i = 0;
        try {
            String sql = "Delete from login where username='" + ID + "'";
            i = Fungsi.Equery(sql);
            return i;
        } catch (Exception e) {
            return i;
        }
    }
}
