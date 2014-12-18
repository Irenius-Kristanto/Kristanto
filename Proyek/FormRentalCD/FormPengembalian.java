/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FormRentalCD;

import Entity.Pengembalian;
import EntityManager.PengembalianManager;
import Koneksi.DataHandler21;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Irenius Kristanto & Gabriel Indra
 */
public class FormPengembalian extends javax.swing.JFrame {
    
    public Connection conn, con;
    public Statement stmt;
    DataHandler21 kon = new DataHandler21();
    
    public FormPengembalian() {
        initComponents();
        tampildata();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void tampildata() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Kode Pengembalian");
        tbl.addColumn("Tgl Pinjam");
        tbl.addColumn("Tgl Kembali");
        tbl.addColumn("Total Harga");
        tbl.addColumn("Lama Pinjam");
        tbl.addColumn("Harga Denda");
        tbl.addColumn("Kode CD");
        tbl.addColumn("ID Member");
        
        try {
            con = kon.getConnection();
            stmt = con.createStatement();
            String sql = "select * from pengembalian order by kode_pengembalian asc";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                tbl.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),});
            }
            tabelPengembalian.setModel(tbl);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ada Kesalahan");
        }
    }
    
    public void cariPengembalian() {
        DefaultTableModel tbl2 = new DefaultTableModel();
        tbl2.addColumn("Kode Pengembalian");
        tbl2.addColumn("Tgl Peminjaman");
        tbl2.addColumn("Tgl Pengembalian");
        tbl2.addColumn("Harga Denda ");
        tbl2.addColumn("Lama Pinjam");
        tbl2.addColumn("Total harga pinjam");
        tbl2.addColumn("Kode CD");
        tbl2.addColumn("ID Member");
        try {
            con = kon.getConnection();
            stmt = con.createStatement();
            String sql = "select * from pengembalian where kode_pengembalian like '%" + txtCariData.getText() + "%' "
                    + "order by kode_pengembalian asc";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                tbl2.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),});
            }
            tabelPengembalian.setModel(tbl2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ada Kesalahan");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKodePengembalian = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtKodeCD = new javax.swing.JTextField();
        txtIDmember = new javax.swing.JTextField();
        txtTglPinjam = new javax.swing.JTextField();
        txtTglKembali = new javax.swing.JTextField();
        txtLamaPinjam = new javax.swing.JTextField();
        txtDenda = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtTotalDenda = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPengembalian = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtCariData = new javax.swing.JTextField();
        HitungDenda = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        jLabel1.setFont(new java.awt.Font("Forte", 0, 14)); // NOI18N
        jLabel1.setText("Data Pengembalian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setText("Kode Pengembalian");

        jLabel3.setText("Kode CD");

        jLabel4.setText("ID Member");

        jLabel5.setText("Tgl Peminjaman");

        jLabel6.setText("Tgl Pengembalian");

        jLabel7.setText("Lama Pinjam (max 7 hari)");

        jLabel8.setText("Total Harga");

        jLabel9.setText("Denda (Rp / hari)");

        txtLamaPinjam.setEditable(false);

        txtDenda.setEditable(false);
        txtDenda.setText("2500");

        txtTotalHarga.setEditable(false);
        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jLabel11.setText("Total Denda");

        txtTotalDenda.setEditable(false);

        jLabel12.setText("Harga (Rp / CD)");

        txtharga.setEditable(false);
        txtharga.setText("5000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKodePengembalian)
                    .addComponent(txtKodeCD)
                    .addComponent(txtIDmember)
                    .addComponent(txtTglPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotalDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Reset))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnSimpan))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLamaPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(txtharga))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Delete)
                            .addComponent(Update)))
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKodePengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTglKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(txtKodeCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLamaPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtIDmember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel9)
                        .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSimpan)
                        .addComponent(txtDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtTotalDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));

        tabelPengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Pengembalian", "Tgl Pinjam", "Tgl Kembali", "Total Harga", "Lama Pinjam", "Harga Denda", "Kode CD", "ID Member"
            }
        ));
        tabelPengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPengembalianMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPengembalian);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
        );

        jLabel10.setText("Cari Data");

        txtCariData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariDataActionPerformed(evt);
            }
        });
        txtCariData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCariDataKeyTyped(evt);
            }
        });

        HitungDenda.setText("Hitung Denda");
        HitungDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungDendaActionPerformed(evt);
            }
        });

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnShow.setText("Show All");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtCariData, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShow))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(HitungDenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Keluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExport)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HitungDenda)
                    .addComponent(Keluar)
                    .addComponent(btnExport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCariData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari)
                    .addComponent(btnShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            Pengembalian kmbl = new Pengembalian();
            kmbl.setHarga_denda(txtDenda.getText());
            kmbl.setId_member(txtIDmember.getText());
            kmbl.setKode_cd(txtKodeCD.getText());
            kmbl.setKode_pengembalian(txtKodePengembalian.getText());
            kmbl.setLama(txtLamaPinjam.getText());
            kmbl.setTgl_peminjaman(txtTglPinjam.getText());
            kmbl.setTgl_pengembalian(txtTglKembali.getText());
            kmbl.setTotal(txtTotalHarga.getText());
            
            Pengembalian kmbl2 = new Pengembalian(kmbl.getKode_pengembalian(), kmbl.getTgl_peminjaman(), kmbl.getTgl_pengembalian(), kmbl.getHarga_denda(), kmbl.getLama(), kmbl.getTotal(), kmbl.getKode_cd(), kmbl.getId_member());
            PengembalianManager pm = new PengembalianManager();
            
            int i = pm.inputdata(kmbl2);
            
            if (i == 1) {
                JOptionPane.showMessageDialog(null, "Simpan Berhasil");
                tampildata();
                txtKodePengembalian.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal disimpan");
                txtKodePengembalian.requestFocus();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnSimpanActionPerformed
    
    private void HitungDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungDendaActionPerformed
        try {
            int totalHargaPinjam, terlambat, denda, totalDenda, harga;
            
            denda = Integer.valueOf(txtDenda.getText());
            harga = Integer.valueOf(txtharga.getText());
            
            String tgl = txtTglPinjam.getText();
            DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
            Date tglPinjam1 = (Date) date.parse(tgl);
            String tgl2 = txtTglKembali.getText();
            Date tglKembali = (Date) date.parse(tgl2);
            long bedaHari = Math.abs(tglKembali.getTime() - tglPinjam1.getTime());
            long selisih = TimeUnit.MILLISECONDS.toDays(bedaHari);
            txtLamaPinjam.setText(String.valueOf(selisih));
            
            if ((int) selisih > 7) {
                terlambat = (int) (selisih - 7);
                totalDenda = (int) denda * terlambat;
                txtTotalDenda.setText(String.valueOf(totalDenda));
                txtTotalHarga.setText(String.valueOf(totalDenda + harga));
            } else {
                txtTotalHarga.setText("");
            }
        } catch (ParseException ex) {
            Logger.getLogger(FormPengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_HitungDendaActionPerformed
    
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        if (txtKodePengembalian.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Pilih Data yang akan diubah");
        } else {
            int jawab = JOptionPane.showConfirmDialog(rootPane, "Ubah data Pengembalian " + txtKodePengembalian.getText() + "?",
                    "Konfirmasi ", JOptionPane.YES_NO_OPTION);
            
            if (jawab == JOptionPane.YES_OPTION) {
                Pengembalian kmbl = new Pengembalian(txtKodePengembalian.getText(), txtTglPinjam.getText(), 
                        txtTglKembali.getText(), txtDenda.getText(), txtLamaPinjam.getText(),
                        txtTotalHarga.getText(), txtKodeCD.getText(), txtIDmember.getText());
                
                PengembalianManager pm = new PengembalianManager();
                
                int i = pm.ubahdata(kmbl);
                if (i == 1) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
                    bersih();
                    txtKodePengembalian.requestFocus();
                    tampildata();
                } else {
                    JOptionPane.showMessageDialog(this, "Update Failed");
                }
            }
        }
    }//GEN-LAST:event_UpdateActionPerformed
    
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if (txtKodePengembalian.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus");
        } else {
            int jawab = JOptionPane.showConfirmDialog(rootPane, "Hapus data Pengembalian "
                    + txtKodePengembalian.getText() + "?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            
            if (jawab == JOptionPane.YES_OPTION) {
                PengembalianManager pm = new PengembalianManager();
                if (pm.hapusdata(txtKodePengembalian.getText()) == 1) {
                    JOptionPane.showMessageDialog(this, "data berhasil dihapus");
                    bersih();
                    txtKodePengembalian.requestFocus();
                    tampildata();
                } else {
                    JOptionPane.showMessageDialog(this, "Data gagal dihapus");
                }
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed
    
    private void tabelPengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPengembalianMouseClicked
        txtKodePengembalian.setText(tabelPengembalian.getValueAt(tabelPengembalian.getSelectedRow(), 0).toString());
        txtTglPinjam.setText(tabelPengembalian.getValueAt(tabelPengembalian.getSelectedRow(), 1).toString());
        txtTglKembali.setText(tabelPengembalian.getValueAt(tabelPengembalian.getSelectedRow(), 2).toString());
        txtTotalHarga.setText(tabelPengembalian.getValueAt(tabelPengembalian.getSelectedRow(), 3).toString());
        txtLamaPinjam.setText(tabelPengembalian.getValueAt(tabelPengembalian.getSelectedRow(), 4).toString());
        txtTotalDenda.setText(tabelPengembalian.getValueAt(tabelPengembalian.getSelectedRow(), 5).toString());
        txtKodeCD.setText(tabelPengembalian.getValueAt(tabelPengembalian.getSelectedRow(), 6).toString());
        txtIDmember.setText(tabelPengembalian.getValueAt(tabelPengembalian.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_tabelPengembalianMouseClicked
    
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        bersih();
    }//GEN-LAST:event_ResetActionPerformed
    
    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_KeluarActionPerformed
    
    private void txtCariDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariDataActionPerformed
    
    private void txtCariDataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariDataKeyTyped
        //cariPengembalian();
    }//GEN-LAST:event_txtCariDataKeyTyped
    
    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed
    
    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        cariPengembalian();
    }//GEN-LAST:event_btnCariActionPerformed
    
    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        tampildata();
    }//GEN-LAST:event_btnShowActionPerformed
    
    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        Export();
    }//GEN-LAST:event_btnExportActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameUtama2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton HitungDenda;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Update;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelPengembalian;
    private javax.swing.JTextField txtCariData;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtIDmember;
    private javax.swing.JTextField txtKodeCD;
    private javax.swing.JTextField txtKodePengembalian;
    private javax.swing.JTextField txtLamaPinjam;
    private javax.swing.JTextField txtTglKembali;
    private javax.swing.JTextField txtTglPinjam;
    private javax.swing.JTextField txtTotalDenda;
    private javax.swing.JTextField txtTotalHarga;
    private javax.swing.JTextField txtharga;
    // End of variables declaration//GEN-END:variables
    private void bersih() {
        txtKodePengembalian.setText(" ");
        txtTglPinjam.setText(" ");
        txtTglKembali.setText(" ");
        txtTotalDenda.setText("");
        txtTotalHarga.setText(" ");
        txtKodeCD.setText(" ");
        txtIDmember.setText(" ");
        txtLamaPinjam.setText(" ");
    }
    
    private void Export() {
        try {
            Connection conn = kon.getConnection();
            try (Statement state = conn.createStatement()) {
                String query = "SELECT * FROM PENGEMBALIAN";
                try (ResultSet rs = state.executeQuery(query)) {
                    FileWriter xcl = new FileWriter("DataPengembalian.csv");
                    xcl.write("KODE_PENGEMBALIAN");
                    xcl.append(",");
                    xcl.write("TGL_PEMINJAMAN");
                    xcl.append(",");
                    xcl.write("TGL_PENGEMBALIAN");
                    xcl.append(",");
                    xcl.write("HARGA_DENDA");
                    xcl.append(",");
                    xcl.write("LAMA");
                    xcl.append(",");
                    xcl.write("TOTAL");
                    xcl.append(",");
                    xcl.write("KODE_CD");
                    xcl.append(",");
                    xcl.write("ID_MEMBER");
                    xcl.write("\n");
                    while (rs.next()) {
                        xcl.write(rs.getString("KODE_PENGEMBALIAN"));
                        xcl.append(",");
                        xcl.write(rs.getString("TGL_PEMINJAMAN"));
                        xcl.append(",");
                        xcl.write(rs.getString("TGL_PENGEMBALIAN"));
                        xcl.append(",");
                        xcl.write(rs.getString("HARGA_DENDA"));
                        xcl.append(",");
                        xcl.write(rs.getString("LAMA"));
                        xcl.append(",");
                        xcl.write(rs.getString("TOTAL"));
                        xcl.append(",");
                        xcl.write(rs.getString("KODE_CD"));
                        xcl.append(",");
                        xcl.write(rs.getString("ID_MEMBER"));
                        xcl.write("\n");
                    }
                    xcl.flush();
                    xcl.close();
                    JOptionPane.showMessageDialog(null, "Data berhasil diExport", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                    tampildata();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
