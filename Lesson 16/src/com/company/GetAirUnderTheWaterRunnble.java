package com.company;

public class GetAirUnderTheWaterRunnble implements Runnable{


    @Override
    public void run() {
        while (true) {
            System.out.println("bread under the water OR YOU WILL DIE");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                //e.printStackTrace();
                System.out.println("breath mother F7ok7r..");
            }
        }
    }
}
