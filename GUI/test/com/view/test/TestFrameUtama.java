package com.view.test;

import com.view.DialogPekerja;
import com.view.FrameUtama;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestFrameUtama {

    public static void main(String[] args) {
        FrameUtama tesFrame = new FrameUtama();
        DialogPekerja testDialog = new DialogPekerja();
        tesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        testDialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        tesFrame.add(testDialog);
    }
}
