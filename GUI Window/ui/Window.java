/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author Irenius Kristanto
 */
public class Window{
    JFrame frame;
    JMenu gameMenu;
    JMenu helpMenu;
    JMenuItem exitMenuItem;
    JMenu settingMenu;
    JMenuBar menuBar;
    JLabel helloLabel;
    JTextField helloTextField;
    JButton okButton;
    
    public Window(){
        //inisialisasi frame
        frame = new JFrame();
        
        
        //inisisalisasi menuBar
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        frame.setLayout(new FlowLayout());
        
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
        
        //inisialisasi helloLabel
        helloLabel = new JLabel("Hello");
        helloLabel.setLocation(5, 10);
        frame.add(helloLabel);
        
        //inisialisasi helloLabel
        helloTextField = new JTextField(15);
        helloTextField.setLocation(2, 5);
        frame.add(helloTextField);
        
        //inisialisasi helloLabel
        okButton = new JButton("OK");
//        helloTextField.setLocation(2, 5);
        frame.add(okButton);
        
        frame.setVisible(true);
        frame.setSize(300, 400);
        frame.setTitle("Window");
    }
}
