package com.view;

import com.model.Pekerja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DialogPekerja extends JDialog {

    JLabel namaLabel, tempatLabel, tanggalLabel, nipLabel, golonganLabel, noKtpLabel;
    JTextField namaText, tempatText, tanggalText, nipText, noKtpText;
    JComboBox golonganCombo;
    JButton tambahButton;
    private final FrameUtama owner;

    public DialogPekerja(FrameUtama owner, boolean modal) {
        super(owner, modal);
        this.owner = owner;

        setTitle("PT. XYZ");
        setSize(400, 400);
        setLayout(null);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 20, 140, 20);
        add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(140, 25, 140, 20);
        add(namaText);
//        namaText.addActionListener(this);

        tempatLabel = new JLabel("Tempat Lahir");
        tempatLabel.setBounds(20, 45, 140, 20);
        add(tempatLabel);

        tempatText = new JTextField();
        tempatText.setBounds(140, 47, 140, 20);
        add(tempatText);

        tanggalLabel = new JLabel("Tanggal Lahir");
        tanggalLabel.setBounds(20, 70, 160, 20);
        add(tanggalLabel);

        tanggalText = new JTextField();
        tanggalText.setBounds(140, 70, 140, 20);
        add(tanggalText);

        nipLabel = new JLabel("NIP");
        nipLabel.setBounds(20, 93, 140, 20);
        add(nipLabel);

        nipText = new JTextField();
        nipText.setBounds(140, 93, 140, 20);
        add(nipText);

        golonganLabel = new JLabel("Golongan");
        golonganLabel.setBounds(20, 115, 140, 20);
        add(golonganLabel);

        String golongan[] = {"1", "2", "3"};
        golonganCombo = new JComboBox(golongan);
        add(golonganCombo);
        golonganCombo.setBounds(140, 115, 140, 20);

        noKtpLabel = new JLabel("No KTP");
        noKtpLabel.setBounds(20, 140, 140, 20);
        add(noKtpLabel);

        noKtpText = new JTextField();
        noKtpText.setBounds(140, 140, 140, 20);
        add(noKtpText);

        tambahButton = new JButton("Simpan");
        tambahButton.setBounds(150, 200, 80, 20);
        add(tambahButton);
        tambahButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Pekerja pekerja = new Pekerja();
                    pekerja.setNama(namaText.getText());
                    pekerja.setNip(nipText.getText());
                    pekerja.setTanggalLahir(tanggalText.getText());
                    pekerja.setTempatLahir(tempatText.getText());
                    pekerja.setNoKtp(noKtpText.getText());
                    pekerja.setGolongan(golonganCombo.getSelectedIndex() + 1);

                    JOptionPane.showMessageDialog(null, "Nama : " + pekerja.getNama() + ""
                            + "\nNIP : " + pekerja.getNip() + ""
                            + "\nNo KTP : " + pekerja.getNoKtp() + ""
                            + "\nTempat Lahir : " + pekerja.getTempatLahir()
                            + "\nTangal Lahir : " + pekerja.getTanggalLahir() 
                            + "\nGolongan : " + pekerja.getGolongan());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        setVisible(true);

    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        try {
//            String nama = namaText.getText();
//            String nip = nipText.getText();
//            String tempatLahir = tempatText.getText();
//            String tanggal = tanggalText.getText();
//            int golongan = golonganCombo.getSelectedIndex();
//
//            Pekerja pkr = new Pekerja(nama, nip, golongan, tempatLahir, tanggal);
//            pkr.setNama(nama);
//            pkr.setNip(nip);
//            pkr.setGolongan(golongan);
//            pkr.setTempatLahir(tempatLahir);
//            pkr.setTanggalLahir(tanggal);
//
//            JOptionPane.showMessageDialog(null, "Nama : " + nama + "\nNIP : " + nip + "\nTanggalLahir : " + tanggal);
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage());
//        } 
//    }
}
