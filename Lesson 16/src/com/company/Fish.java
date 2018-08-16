package com.company;

public class Fish {
    public void wagTail(){
        TailRunnable tail = new TailRunnable();
        Thread tailThread = new Thread(tail);
        tailThread.start();
    }
    public void breadUnderWater(){
        GetAirUnderTheWaterRunnble Breath = new GetAirUnderTheWaterRunnble();
        Thread brathThread = new Thread(Breath);
        brathThread.start();
    }

}
