/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpreadSheet;

import javax.swing.JOptionPane;

/**
 *
 * @author Irenius Kristanto
 */
public class Sheet2 extends javax.swing.JFrame {

    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Creates new form Sheet2
     */
    public Sheet2() {
        initComponents();
//        proses();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txt1_1 = new javax.swing.JTextField();
        txt1_2 = new javax.swing.JTextField();
        txt1_3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt2_1 = new javax.swing.JTextField();
        txt2_2 = new javax.swing.JTextField();
        txt2_3 = new javax.swing.JTextField();
        txt3_1 = new javax.swing.JTextField();
        txt3_2 = new javax.swing.JTextField();
        txt3_3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("1");

        txt1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1_1ActionPerformed(evt);
            }
        });

        txt1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1_2ActionPerformed(evt);
            }
        });

        txt1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1_3ActionPerformed(evt);
            }
        });

        jLabel2.setText("1");

        jLabel3.setText("2");

        jLabel4.setText("3");

        txt2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2_1ActionPerformed(evt);
            }
        });

        txt2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2_2ActionPerformed(evt);
            }
        });

        txt2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2_3ActionPerformed(evt);
            }
        });

        txt3_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3_1ActionPerformed(evt);
            }
        });

        txt3_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3_2ActionPerformed(evt);
            }
        });

        txt3_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3_3ActionPerformed(evt);
            }
        });

        jLabel5.setText("2");

        jLabel6.setText("3");

        jLabel7.setFont(new java.awt.Font("Algerian", 1, 16)); // NOI18N
        jLabel7.setText("SPREADSHEET");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel3)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt3_1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(txt2_1)
                                    .addComponent(txt1_1))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1_1ActionPerformed
        // TODO add your handling code here:
        if (txt1_1.getText().startsWith("=")) {
            setText(txt1_1.getText());
            txt1_1.setText(Hitung());
            
        } else {
            String isi = txt1_1.getText();
            txt1_1.setText(isi);
        }
    }//GEN-LAST:event_txt1_1ActionPerformed

    private void txt1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1_2ActionPerformed
        // TODO add your handling code here:
        if (txt1_2.getText().startsWith("=")) {
            setText(txt1_2.getText());
            txt1_2.setText(Hitung());
            
        } else {
            String isi = txt1_2.getText();
            txt1_2.setText(isi);
        }
    }//GEN-LAST:event_txt1_2ActionPerformed

    private void txt1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1_3ActionPerformed
        // TODO add your handling code here:
        if (txt1_3.getText().startsWith("=")) {
            setText(txt1_3.getText());
            txt1_3.setText(Hitung());
            
        } else {
            String isi = txt1_3.getText();
            txt1_3.setText(isi);
        }
    }//GEN-LAST:event_txt1_3ActionPerformed

    private void txt2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2_1ActionPerformed
        // TODO add your handling code here:
        if (txt2_1.getText().startsWith("=")) {
            setText(txt2_1.getText());
            txt2_1.setText(Hitung());
        } else {
            String isi = txt2_1.getText();
            txt2_1.setText(isi);
        }
    }//GEN-LAST:event_txt2_1ActionPerformed

    private void txt2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2_2ActionPerformed
        // TODO add your handling code here:
        if (txt2_2.getText().startsWith("=")) {
            setText(txt2_2.getText());
            txt2_2.setText(Hitung());
        } else {
            String isi = txt2_2.getText();
            txt2_2.setText(isi);
        }
    }//GEN-LAST:event_txt2_2ActionPerformed

    private void txt2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2_3ActionPerformed
        // TODO add your handling code here:
        if (txt2_3.getText().startsWith("=")) {
            setText(txt2_3.getText());
            txt2_3.setText(Hitung());
        } else {
            String isi = txt2_3.getText();
            txt2_3.setText(isi);
        }
    }//GEN-LAST:event_txt2_3ActionPerformed

    private void txt3_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3_1ActionPerformed
        // TODO add your handling code here:
        if (txt3_1.getText().startsWith("=")) {
            setText(txt3_1.getText());
            txt3_1.setText(Hitung());
        } else {
            String isi = txt3_1.getText();
            txt3_1.setText(isi);
        }
    }//GEN-LAST:event_txt3_1ActionPerformed

    private void txt3_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3_2ActionPerformed
        // TODO add your handling code here:
        if (txt3_2.getText().startsWith("=")) {
            setText(txt3_2.getText());
            txt3_2.setText(Hitung());
        } else {
            String isi = txt3_2.getText();
            txt3_2.setText(isi);
        }
    }//GEN-LAST:event_txt3_2ActionPerformed

    private void txt3_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3_3ActionPerformed
        // TODO add your handling code here:
        if (txt3_3.getText().startsWith("=")) {
            setText(txt3_3.getText());
            txt3_3.setText(Hitung());   
        } else {
            String isi = txt3_3.getText();
            txt3_3.setText(isi);
        }
    }//GEN-LAST:event_txt3_3ActionPerformed

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
            java.util.logging.Logger.getLogger(Sheet2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sheet2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sheet2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sheet2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Sheet2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField txt1_1;
    private javax.swing.JTextField txt1_2;
    private javax.swing.JTextField txt1_3;
    private javax.swing.JTextField txt2_1;
    private javax.swing.JTextField txt2_2;
    private javax.swing.JTextField txt2_3;
    private javax.swing.JTextField txt3_1;
    private javax.swing.JTextField txt3_2;
    private javax.swing.JTextField txt3_3;
    // End of variables declaration//GEN-END:variables

    
    private String Hitung() {
        String hasil = null;
        if (text.startsWith("=")) {
            int panjang = text.length();
            String sheet = text.substring(1, panjang);
            if (sheet.contains("*")) {
                String temp[] = sheet.split("\\*");
                String angkaPertama = temp[0];
                String angkaKedua = temp[1];
                double pertama = Double.valueOf(angkaPertama);
                double kedua = Double.valueOf(angkaKedua);
                double perhitungan = pertama * kedua;
                hasil = String.valueOf(perhitungan);
            } else if (sheet.contains("+")) {
                String temp[] = sheet.split("\\+");
                String angkaPertama = temp[0];
                String angkaKedua = temp[1];
                double pertama = Double.valueOf(angkaPertama);
                double kedua = Double.valueOf(angkaKedua);
                double perhitungan = pertama + kedua;
                hasil = String.valueOf(perhitungan);
            } else if (sheet.contains("-")) {
                String temp[] = sheet.split("\\-");
                String angkaPertama = temp[0];
                String angkaKedua = temp[1];
                double pertama = Double.valueOf(angkaPertama);
                double kedua = Double.valueOf(angkaKedua);
                double perhitungan = pertama - kedua;
                hasil = String.valueOf(perhitungan);
            } else if (sheet.contains("/")) {
                String temp[] = sheet.split("\\/");
                String angkaPertama = temp[0];
                String angkaKedua = temp[1];
                double pertama = Double.valueOf(angkaPertama);
                double kedua = Double.valueOf(angkaKedua);
                double perhitungan = pertama / kedua;
                hasil = String.valueOf(perhitungan);
            } else {
                JOptionPane.showMessageDialog(null, "Salah operation", "Pesan", JOptionPane.ERROR_MESSAGE);
            }
        }
        return hasil;
    }
}
