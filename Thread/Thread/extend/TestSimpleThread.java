/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Thread.extend;

/**
 *
 * @author Irenius Kristanto
 */
public class TestSimpleThread {
    public static void main(String[] args) {
        new SimpleThread("Bali").start();
        new SimpleThread("Jogja").start();
        new SimpleThread("Surabaya").start();
    }
}
