/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestView;

import com.view.DialogPekerja;
import com.view.FrameUtama;

/**
 *
 * @author Irenius Kristanto
 */
public class TestDialog {
    public static void main(String[] args) {
        FrameUtama test1 = new FrameUtama();
        DialogPekerja test = new DialogPekerja(test1, true);
    }
}
