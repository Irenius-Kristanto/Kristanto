package org.usd.pbo2.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;
import javax.swing.*;
import org.usd.pbo2.model.KelasKuliah;
import org.usd.pbo2.model.Mahasiswa;

public class FormTambahPesertaKelas extends JDialog {

    JLabel kelasLabel;
    JLabel mahasiswaLabel;
    JTextField TextField;
    JComboBox kelasCombo;
    JComboBox mahasiswaCombo;
    String[] arrayKelas;
    String[] arrayMahasiswa;
    JButton simpan;
    JTextField teks;

    private final FrameUtama owner;

    public FormTambahPesertaKelas(final FrameUtama owner, boolean modal) {
        super(owner, modal);
        this.setSize(400, 600);
        this.setTitle("Tambah Peserta Kelas");
        this.getContentPane().setLayout(null);

        kelasLabel = new JLabel("Kelas");
        kelasLabel.setBounds(10, 15, 100, 20);
        mahasiswaLabel = new JLabel("NIM");
        mahasiswaLabel.setBounds(10, 45, 100, 20);
        this.getContentPane().add(kelasLabel);
        this.getContentPane().add(mahasiswaLabel);

        arrayKelas = new String[KelasKuliah.DAFTAR_KELAS_KULIAH.size()];
        for (int i = 0; i < KelasKuliah.DAFTAR_KELAS_KULIAH.size(); i++) {
            arrayKelas[i] = KelasKuliah.DAFTAR_KELAS_KULIAH.get(i).getKodeKuliah();
        }
        kelasCombo = new JComboBox(arrayKelas);
        this.getContentPane().add(kelasCombo);
        kelasCombo.setBounds(75, 15, 200, 20);

        arrayMahasiswa = new String[Mahasiswa.DAFTAR_MAHASISWA.size()];
        for (int i = 0; i < Mahasiswa.DAFTAR_MAHASISWA.size(); i++) {
            arrayMahasiswa[i] = Mahasiswa.DAFTAR_MAHASISWA.get(i).getNim();
        }
        mahasiswaCombo = new JComboBox(arrayMahasiswa);
        this.getContentPane().add(mahasiswaCombo);
        mahasiswaCombo.setBounds(75, 45, 200, 20);

        simpan = new JButton("Simpan");
        this.getContentPane().add(simpan);
        simpan.setBounds(125, 100, 100, 40);

        simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String mhs = (String) mahasiswaCombo.getSelectedItem();
                String kls = (String) kelasCombo.getSelectedItem();
                teks.setText("NIM : " + mhs + ", Kelas : " + kls);

            }
        });

        teks = new JTextField();
//        this.getContentPane().add(teks);
        teks.setBounds(10, 150, 300, 240);
        teks.setPreferredSize(new Dimension(100, 100));
//        teks.setLineWrap(true);
        add(teks);
        teks.setEditable(false);

        this.setVisible(true);
        this.owner = owner;
    }
}
