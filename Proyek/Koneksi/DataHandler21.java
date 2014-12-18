package Koneksi;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.jdbc.pool.OracleDataSource;

public class DataHandler21 {

    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    String userid = "HR";
    String password = "kristan22";
    Connection conn = null;

    public Connection getConnection() throws Exception {

        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, password);
            System.out.println("Koneksi Berhasil");
//            return conn;
        } catch (SQLException ex) {
            System.out.println("Koneksi Gagal");
//            return conn;
        }
        return conn;
    }

    public static void main(String[] args) throws Exception {
        DataHandler21 tes = new DataHandler21();
        tes.getConnection();
    }
}
