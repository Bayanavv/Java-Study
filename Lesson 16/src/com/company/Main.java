package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /**
        BarmenThread bar = new BarmenThread();

        Fish fisha = new Fish();

        //avoid run
        bar.start();

        fisha.start();

        //oop:
        //
        Runnable r = new TestRunnable();
        Thread t = new Thread();
        t.start();

        Timer y = new Timer();
        y.schedule(, 1000);
*/

        Timer t = new Timer();
        TimerTask task = new MyTimerTask();
        t.schedule(task, 1000);





    }
}
