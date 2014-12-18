/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormRentalCD;

import Entity.CDRental;
import EntityManager.CDRentalManager;
import Koneksi.DataHandler21;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Irenius Kristanto & Gabriel Indra
 */
public class FrmCDRental extends javax.swing.JFrame {

    public Connection con;
    public Statement cn;
    public Connection conn;

    DataHandler21 getCon = new DataHandler21();

    /**
     * Creates new form FrmCDRental
     */
    public FrmCDRental() {
        initComponents();

        tampilData();
        setTitle("Data CD");

        setLocationRelativeTo(null);

        setResizable(false);
    }

    private void tampilData() {
        DefaultTableModel tabelnya = new DefaultTableModel();
        tabelnya.addColumn("KODE CD");
        tabelnya.addColumn("JUDUL CD");
        tabelnya.addColumn("TAHUN RILIS");
        tabelnya.addColumn("HARGA CD");
        tabelnya.addColumn("STOK");
        tabelnya.addColumn("KODE JENIS");

        try {
            con = getCon.getConnection();
            cn = con.createStatement();
            String sql = "select * from cd order by kode_cd asc";
            ResultSet rs = cn.executeQuery(sql);
            while (rs.next()) {
                tabelnya.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),});
            }
            tabelCDRental.setModel(tabelnya);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ada Kesalahan !");
        }
    }

    public void caricd() {
        DefaultTableModel tabelnya = new DefaultTableModel();
        tabelnya.addColumn("KODE CD");
        tabelnya.addColumn("JUDUL CD");
        tabelnya.addColumn("TAHUN RILIS");
        tabelnya.addColumn("HARGA CD");
        tabelnya.addColumn("STOK");
        tabelnya.addColumn("KODE JENIS");

        try {
            con = getCon.getConnection();
            cn = con.createStatement();
            String sql = "select * from cd where Judul like '%" + txtCariCD.getText() + "%'"
                    + "order by kode_cd asc";
            ResultSet rs = cn.executeQuery(sql);
            while (rs.next()) {
                tabelnya.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),});
            }
            tabelCDRental.setModel(tabelnya);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ada Kesalahan !");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTahun = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        txtKodeJenis = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        buttonSimpan = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        buttonReset = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCariCD = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelCDRental = new javax.swing.JTable();
        btnCari = new javax.swing.JButton();
        btnShow = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("DATA CD RENTAL");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("KODE CD");

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });

        jLabel3.setText("JUDUL CD");

        jLabel4.setText("TAHUN RILIS");

        jLabel5.setText("HARGA");

        jLabel6.setText("STOK");

        jLabel7.setText("KODE JENIS");

        txtHarga.setEditable(false);
        txtHarga.setText("5000");
        txtHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaKeyTyped(evt);
            }
        });

        txtStok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStokKeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonHapus.setText("HAPUS");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(buttonEdit)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        buttonExit.setText("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonExit)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonReset)
                    .addComponent(buttonExit))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtKodeJenis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(txtStok, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtKodeJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel8.setText("CARI DATA CD RENTAL");

        txtCariCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariCDActionPerformed(evt);
            }
        });
        txtCariCD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCariCDKeyTyped(evt);
            }
        });

        tabelCDRental.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "KODE CD", "JUDUL CD", "TAHUN RILIS", "HARGA CD", "STOK", "KODE JENIS"
            }
        ));
        tabelCDRental.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelCDRentalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelCDRental);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1)
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtCariCD, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCari)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnShow)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnExport))))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCariCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari)
                    .addComponent(btnShow)
                    .addComponent(btnExport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        // TODO add your handling code here:
        try {
            CDRental cdr = new CDRental();
            cdr.setKode_CD(txtKode.getText());
            cdr.setKode_jenis(txtKodeJenis.getText());
            cdr.setJudul(txtJudul.getText());
            cdr.setHarga(txtHarga.getText());
            cdr.setStok(txtStok.getText());
            cdr.setTahun_rilis(txtTahun.getText());

            CDRental cdr2 = new CDRental(cdr.getKode_CD(), cdr.getJudul(), cdr.getTahun_rilis(), cdr.getHarga(), cdr.getStok(), cdr.getKode_jenis());
            CDRentalManager cdretalman = new CDRentalManager();

            int i = 0;
            i = cdretalman.inputdata(cdr2);
            if (i == 1) {
                JOptionPane.showMessageDialog(null, "Simpan data Berhasil");
                tampilData();
                txtJudul.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal disimpan");
                txtJudul.requestFocus();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        if (txtKodeJenis.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan diubah : ");
        } else {
            int jawab = JOptionPane.showConfirmDialog(rootPane, "Ubah CD Rental " + txtKodeJenis.getText() + " ?",
                    "Konfirmasi ", JOptionPane.YES_NO_OPTION);
            if (jawab == JOptionPane.YES_OPTION) {
                
                CDRental cdr = new CDRental(txtKode.getText(), txtJudul.getText(), txtTahun.getText(), txtHarga.getText(), txtStok.getText(), txtKodeJenis.getText());
                CDRentalManager cdretalman = new CDRentalManager();

                int i = 0;
                i = cdretalman.ubahdata(cdr);
                if (i == 1) {
                    JOptionPane.showMessageDialog(null, "Ubah data Berhasil");
                    tampilData();
                    txtJudul.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "Data gagal diubah");
                    txtJudul.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void tabelCDRentalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelCDRentalMouseClicked
        // TODO add your handling code here:
        txtKode.setText(tabelCDRental.getValueAt(tabelCDRental.getSelectedRow(), 0).toString());
        txtJudul.setText(tabelCDRental.getValueAt(tabelCDRental.getSelectedRow(), 1).toString());
        txtTahun.setText(tabelCDRental.getValueAt(tabelCDRental.getSelectedRow(), 2).toString());
        txtHarga.setText(tabelCDRental.getValueAt(tabelCDRental.getSelectedRow(), 3).toString());
        txtStok.setText(tabelCDRental.getValueAt(tabelCDRental.getSelectedRow(), 4).toString());
        txtKodeJenis.setText(tabelCDRental.getValueAt(tabelCDRental.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tabelCDRentalMouseClicked

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed

        bersih();
    }//GEN-LAST:event_buttonResetActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        // TODO add your handling code here:
        if (txtKode.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Pilih mana yang akan dihapus ?");
        } else {
            int jawab = JOptionPane.showConfirmDialog(rootPane, "Hapus CD Rental" + txtKode.getText() + "?",
                    "Konfirmasi ", JOptionPane.YES_NO_OPTION);
            if (jawab == JOptionPane.YES_OPTION) {
                CDRentalManager cdrm = new CDRentalManager();

                if (cdrm.hapusdata(txtKode.getText()) == 1) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                    bersih();
                    txtKode.requestFocus();
                    tampilData();
                } else {
                    JOptionPane.showMessageDialog(this, "Data gagal dihapus");
                }
            }
        }
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Anda akan keluar dari aplikasi");
        setVisible(false);
    }//GEN-LAST:event_buttonExitActionPerformed

    private void txtCariCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariCDActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCariCDActionPerformed

    private void txtCariCDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariCDKeyTyped
        // TODO add your handling code here:
        //caricd();
    }//GEN-LAST:event_txtCariCDKeyTyped

    private void txtStokKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStokKeyTyped
        // TODO add your handling code here:
//        if (!(Character.isDigit(evt.getKeyChar()))) {
//            evt.consume();
//        }
    }//GEN-LAST:event_txtStokKeyTyped

    private void txtHargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyTyped
        // TODO add your handling code here:
//        if (!(Character.isDigit(evt.getKeyChar()))) {
//            evt.consume();
//        }
    }//GEN-LAST:event_txtHargaKeyTyped

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        caricd();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        tampilData();
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
        Export();
    }//GEN-LAST:event_btnExportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCDRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCDRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCDRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCDRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameUtama2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelCDRental;
    private javax.swing.JTextField txtCariCD;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtKodeJenis;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables

    private void bersih() {
        txtKode.setText("");
        txtJudul.setText("");
        txtKodeJenis.setText("");
        txtStok.setText("");
        txtTahun.setText("");
    }

    public void Export() {

        try {
            Connection conn = getCon.getConnection();
            try (Statement state = conn.createStatement()) {
                String query = "SELECT * FROM CD ";
                try (ResultSet rs = state.executeQuery(query)) {
                    FileWriter xcl = new FileWriter("DataCD.csv");
                    xcl.write("KODE_CD");
                    xcl.append(",");
                    xcl.write("JUDUL");
                    xcl.append(",");
                    xcl.write("TAHUN_RILIS");
                    xcl.append(",");
                    xcl.write("HARGA");
                    xcl.append(",");
                    xcl.write("STOK");
                    xcl.append(",");
                    xcl.write("KODE_JENIS");
                    xcl.write("\n");
                    while (rs.next()) {
                        xcl.write(rs.getString("KODE_CD"));
                        xcl.append(",");
                        xcl.write(rs.getString("JUDUL"));
                        xcl.append(",");
                        xcl.write(rs.getString("TAHUN_RILIS"));
                        xcl.append(",");
                        xcl.write(rs.getString("HARGA"));
                        xcl.append(",");
                        xcl.write(rs.getString("STOK"));
                        xcl.append(",");
                        xcl.write(rs.getString("KODE_JENIS"));

                        xcl.write("\n");
                    }
                    xcl.flush();
                    xcl.close();
                    JOptionPane.showMessageDialog(null, "Data berhasil diExport", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                    tampilData();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}