package com.company;

public class TailRunnable implements Runnable{

    @Override
    public void run() {
        while (true) {
            System.out.println("Swim motherFucker Swim ,1!!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                System.out.println("can't sleep");
            }
        }
    }
}
