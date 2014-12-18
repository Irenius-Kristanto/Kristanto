/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fungsi;

import static Koneksi.DataHandler21.getConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Irenius Kristanto & Gabriel Indra
 */
public class Fungsi {

    public static int Equery(String sql) throws Exception {

        Connection conn = getConnection();
        Statement stmt = conn.createStatement();

        try {
            if (stmt.executeUpdate(sql) == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
