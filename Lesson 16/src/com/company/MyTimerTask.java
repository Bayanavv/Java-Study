package com.company;

import java.util.TimerTask;

public class MyTimerTask extends TimerTask{

    @Override
    public void run() {
        System.out.println("taing the dog for a wollk");
        System.out.println("taking the fish for a swim");

        Fish f = new Fish();
        f.wagTail();
    }
}
