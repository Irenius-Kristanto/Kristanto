/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread.GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.geometry.VPos;
import javafx.scene.layout.GridPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Irenius Kristanto
 */
public class Counter implements Runnable {
    
    JLabel outputLabel;
    private int value;
    Thread thread;
    private boolean start = true;

    /**
     * Creates a new instance of Counter
     */
    public Counter() {
        setValue(0);
    }
    
    public Counter(JLabel output) {
        this.outputLabel = output;
        setValue(0);
        thread = new Thread(this);
        thread.start();
    }
    
    @Override
    public void run() {
        while (isStart()) {
            outputLabel.setText("Counter : " + getValue());
            try {
                thread.sleep(500);
                setValue(getValue() + 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public boolean isStart() {
        return start;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
}
