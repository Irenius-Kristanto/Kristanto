/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Irenius Kristanto
 */
public class Window2 extends JFrame implements ActionListener {

    JMenu gameMenu;
    JMenu helpMenu;
    JMenuItem exitMenuItem;
    JMenu settingMenu;
    JMenuBar menuBar;
    JLabel helloLabel;
    JTextField helloTextField;
    JButton okButton;
    

    public Window2() {
        //inisialisasi frame

        //inisisalisasi menuBar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        setLayout(new FlowLayout());

        //inisialisasi gameMenu
        gameMenu = new JMenu("Game");
        menuBar.add(gameMenu);

        //inisialisasi helpMenu
        helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        //inisialisasi settingMenu
        settingMenu = new JMenu("Setting");
        gameMenu.add(settingMenu);

        //inisialisasi exitMenuItem
        exitMenuItem = new JMenuItem("Exit");
        gameMenu.add(exitMenuItem);
        exitMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //inisialisasi helloLabel
        helloLabel = new JLabel("Hello");
        helloLabel.setLocation(5, 10);
        add(helloLabel);

        //inisialisasi helloLabel
        helloTextField = new JTextField(15);
        helloTextField.setLocation(2, 5);
        add(helloTextField);
        helloTextField.addActionListener(this); // menambah actionnya

        //inisialisasi helloLabel
        okButton = new JButton("OK");
        add(okButton);
        okButton.addActionListener(new okButtonHandler());

        setVisible(true);
        setSize(300, 400);
        setTitle("Window");
    }

    private class okButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Okay");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "HAI !!!!");
//        System.exit(0);
    }
}
