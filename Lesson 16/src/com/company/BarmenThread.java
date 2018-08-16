package com.company;
/**
 * Thread perform task in the background (in parallel)
 * not in serial
 * */
public class BarmenThread extends Thread{
    //run=
    //the task:

    @Override
    public void run() {
        //code that runs in the background
        while (true){
            System.out.println("Give Tea");
        }
    }


}
