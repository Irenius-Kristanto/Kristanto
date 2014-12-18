/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FormRentalCD;



/**
 *
 * @author 8.1 Enterprise
 */
public class FrameUtama extends javax.swing.JFrame {

    /**
     * Creates new form FrameUtama
     */
    public FrameUtama() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        digitalClock1 = new Entity.DigitalClock();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuMember = new javax.swing.JMenuItem();
        MenuCD = new javax.swing.JMenuItem();
        JenisCD = new javax.swing.JMenuItem();
        DataPinjam = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        DataKembali = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        Exit = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(153, 0, 153));

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\android.png")); // NOI18N
        jLabel1.setToolTipText("");

        jPanel2.setLayout(null);

        jPanel3.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\android.png")); // NOI18N

        jMenu1.setText("File");

        MenuMember.setText("Data Member");
        MenuMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMemberMouseClicked(evt);
            }
        });
        MenuMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMemberActionPerformed(evt);
            }
        });
        jMenu1.add(MenuMember);

        MenuCD.setText("Daftar CD");
        MenuCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCDActionPerformed(evt);
            }
        });
        jMenu1.add(MenuCD);

        JenisCD.setText("Data Jenis CD");
        JenisCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JenisCDActionPerformed(evt);
            }
        });
        jMenu1.add(JenisCD);

        jMenuBar1.add(jMenu1);

        DataPinjam.setText("Transaksi");
        DataPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPinjamActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Data Peminjaman");
        DataPinjam.add(jMenuItem4);

        DataKembali.setText("Data Pengembalian");
        DataKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataKembaliActionPerformed(evt);
            }
        });
        DataPinjam.add(DataKembali);

        jMenuBar1.add(DataPinjam);

        jMenu8.setText("Exit");

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu8.add(Exit);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 151, Short.MAX_VALUE)
                        .addComponent(digitalClock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(312, 312, 312))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(digitalClock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMemberMouseClicked
        setLocationRelativeTo(null);
        
    }//GEN-LAST:event_MenuMemberMouseClicked

    private void MenuCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCDActionPerformed
        FrmCDRental cd = new FrmCDRental();
        cd.setVisible(true);
        cd.setTitle("Menu CD");
    }//GEN-LAST:event_MenuCDActionPerformed

    private void MenuMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMemberActionPerformed
        //FormMember m = new FormMember();
        //m.setVisible(true);
        //m.setTitle("Data Member Rental CD");
    }//GEN-LAST:event_MenuMemberActionPerformed

    private void JenisCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JenisCDActionPerformed
        //FrmJenis jenis = new FrmJenis();
        //jenis.setVisible(true);
        //jenis.setTitle("Jenis-Jenis CD");
    }//GEN-LAST:event_JenisCDActionPerformed

    private void DataPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPinjamActionPerformed
        FormPeminjaman fp = new FormPeminjaman();
        fp.setVisible(true);
        fp.setTitle("Data Peminjaman");
    }//GEN-LAST:event_DataPinjamActionPerformed

    private void DataKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataKembaliActionPerformed
        FormPengembalian kembali= new FormPengembalian();
        kembali.setVisible(true);
        kembali.setTitle("Data Pengembalian");
    }//GEN-LAST:event_DataKembaliActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed
    
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUtama().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DataKembali;
    private javax.swing.JMenu DataPinjam;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem JenisCD;
    private javax.swing.JMenuItem MenuCD;
    private javax.swing.JMenuItem MenuMember;
    private Entity.DigitalClock digitalClock1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
