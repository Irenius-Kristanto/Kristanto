/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Thread.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Irenius Kristanto
 */
class SimpleGUI extends JFrame {
    
    private JButton clickButton, stopButton;
    private JLabel counterLabel;
    private Counter counter;
    private boolean start = true;
    
    public SimpleGUI() {
        clickButton = new JButton("Start");
        stopButton = new JButton("Stop");
        
        counterLabel = new JLabel("Counter : ");
        
        this.setLayout(new FlowLayout());
        this.add(clickButton);
        this.add(counterLabel);
        this.add(stopButton);
        
        this.setTitle("Thread Application");
        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        clickButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                clickAction();
            }
        });
        
        stopButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                stopAction();
            }
        });
    }
    
    public void setStart(boolean start) {
        this.start = start;
    }
    
    public void clickAction(){
        counter = new Counter(counterLabel);
    }
    
    public void stopAction(){
        setStart(false);
    }
    
    
}
