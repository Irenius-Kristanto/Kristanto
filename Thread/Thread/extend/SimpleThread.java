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
public class SimpleThread extends Thread{

    public SimpleThread(String str) {
        super(str);
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " "+getName());
            try{
//                sleep((long)(Math.random() * 1000));
                sleep(1000);
            } catch (InterruptedException e){
            }
        }
        System.out.println("DONE! "+getName());
    }
}
