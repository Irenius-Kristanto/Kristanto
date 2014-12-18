/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread.imple;

/**
 *
 * @author Irenius Kristanto
 */
public class AnotherSimpleThread implements Runnable {

    Thread thread;

    public AnotherSimpleThread() {
    }

    public AnotherSimpleThread(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + thread.getName());
            try {
                thread.sleep(1000);

            } catch (InterruptedException e) {
            }
        }
        System.out.println("DONE! "+thread.getName());
    }
}
