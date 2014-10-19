package com.view;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class DialogPekerja extends JDialog {

    JLabel cariPekerjaLabel;
    JTextField cariPekerjaText;
    JButton cariButton;
    JComboBox golonganCombo;
    JRadioButton jrbLaki;
    JRadioButton jrbPerem;

    public DialogPekerja() {
        setLayout(null);

        cariPekerjaLabel = new JLabel("Nama");
        cariPekerjaLabel.setBounds(20, 20, 100, 20);
        add(cariPekerjaLabel);

        cariPekerjaText = new JTextField();
        cariPekerjaText.setBounds(150, 25, 120, 20);
        add(cariPekerjaText);

        cariButton = new JButton("Cari");
        cariButton.setBounds(280, 25, 80, 20);
        add(cariButton);

        cariPekerjaLabel = new JLabel("Tempat/TanggalLahir");
        cariPekerjaLabel.setBounds(20, 50, 140, 20);
        add(cariPekerjaLabel);

        cariPekerjaText = new JTextField();
        cariPekerjaText.setBounds(150, 50, 215, 20);
        add(cariPekerjaText);

        cariPekerjaLabel = new JLabel("Golongan");
        cariPekerjaLabel.setBounds(20, 80, 140, 20);
        add(cariPekerjaLabel);

        String golongan[] = {"1", "2", "3"};
        golonganCombo = new JComboBox(golongan);
        add(golonganCombo);
        golonganCombo.setBounds(150, 75, 140, 20);

        cariPekerjaLabel = new JLabel("Jenis Kelamin");
        cariPekerjaLabel.setBounds(20, 110, 140, 20);
        add(cariPekerjaLabel);

        ButtonGroup bg = new ButtonGroup();
        jrbLaki = new JRadioButton("Laki-laki", true);
        jrbPerem = new JRadioButton("Perempuan");
        bg.add(jrbLaki);
        bg.add(jrbPerem);
        jrbLaki.setEnabled(true);
        jrbPerem.setEnabled(true);
        add(jrbLaki);
        add(jrbPerem);
        jrbLaki.setBounds(150, 110, 120, 20);
        jrbPerem.setBounds(280, 110, 120, 20);

        cariButton = new JButton("Simpan");
        cariButton.setBounds(150, 200, 80, 20);
        add(cariButton);

        setVisible(true);
        setSize(400, 400);
        setTitle("PT. XYZ");
    }
}
