package com.view;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FrameUtama extends JFrame {

    JMenuBar menuBar;
    JMenu pekerjaMenu;
    JMenu helpMenu;
    JMenuItem exitMenuItem;
    JMenuItem editPekerjaMenuItem;

    public FrameUtama() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        setLayout(new FlowLayout());

        pekerjaMenu = new JMenu("Pekerja");
        menuBar.add(pekerjaMenu);

        helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        editPekerjaMenuItem = new JMenuItem("Edit Pekerja");
        pekerjaMenu.add(editPekerjaMenuItem);

        exitMenuItem = new JMenuItem("Exit");
        pekerjaMenu.add(exitMenuItem);
        setVisible(true);
        setSize(300, 400);
        setTitle("PT. XYZ");
    }
}
