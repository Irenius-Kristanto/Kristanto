package com.view;

import com.view.DialogPekerja;
import com.model.PerusahaanList;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FrameUtama extends JFrame implements ActionListener {
    
    JMenuBar menuBar;
    JMenu pekerjaMenu;
    JMenu helpMenu;
    JMenuItem exitMenuItem;
    JMenuItem editPekerjaMenuItem;
    PerusahaanList perusahaan;
    
    public FrameUtama() {
        
        perusahaan = new PerusahaanList();
        
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        setLayout(new FlowLayout());
        
        pekerjaMenu = new JMenu("Pekerja");
        menuBar.add(pekerjaMenu);
        
        helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);
        
        editPekerjaMenuItem = new JMenuItem("Edit Pekerja");
        pekerjaMenu.add(editPekerjaMenuItem);
        editPekerjaMenuItem.addActionListener(this);
        
        exitMenuItem = new JMenuItem("Exit");
        pekerjaMenu.add(exitMenuItem);
        exitMenuItem.addActionListener(this);
        
        setVisible(true);
        setSize(300, 400);
        setTitle("PT. XYZ");
    }
    
    public PerusahaanList getPerusahaan() {
        return perusahaan;
    }
    
    public void setPerusahaan(PerusahaanList perusahaan) {
        this.perusahaan = perusahaan;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exitMenuItem) {
            System.exit(0);
        } else if (e.getSource() == editPekerjaMenuItem) {
            DialogPekerja dialogPekerja = new DialogPekerja(this, true);
        }
    }
}
