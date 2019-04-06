/**
 *
 * Lesson 10:
 *
 * Queue
 * ArrayDeque
 * Stack
 * https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html
 */




package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        MapDemo();
        //SetDemo();
        //StackExample();
        //queueDemo();

        //DEQ duel ended queue- אפשר להוצאי ולהכניס משני הכיוונים
        //queue - ||||| נכנס מהסוף ויוצאה מהאתחלה (תור)

    }

    private static void MapDemo() {
        /**
         * Dictionary Like Collection:
         * "Key"-> value
         * map<Key, Value>
         */
        Map<String,Integer> grades=new HashMap<String,Integer>();

        grades.put("superMan", 56);
        grades.put("Batman", 46);
        grades.put("Nerd-Boy", 91);
        grades.put("superMan", 561);//update, no Duplicate Keys

        /**
         *   מערכך הסוציאטיבי
         * an Associative Array
         * Map:
         */

        Map<Integer,Object>mMap = new HashMap<Integer, Object>();
        mMap.put(0,new Object());
        mMap.put(120, "a String Object");
        mMap.put(120, true);
    }


/**
 *
 * 1)
 *
    private static void SetDemo() {
        //יש מבנה נתונים מיוחדג שלא מאפשר להכניס שני דברים פעמיים
        //Set: a collection of unique elements:
        Set<String> set = new HashSet<String >();
        boolean didInsert = set.add("moshe");
        didInsert = set.add("moshe");//false
        didInsert = set.add("moshek");//true
        didInsert = set.add("moshe");//false
        didInsert = set.add("moshe1");//true--->3
        System.out.println(set.size());//size? why one ? becose no duplicateted
    }







    2)

    private static void queueDemo() {
        //Queue: an ordered collection, Fifo. (offer = add),poll = remove.
        Queue<String> usa = new ArrayDeque<String>();

        usa.offer("black");
        usa.offer("green");
        usa.offer("red");

        String result = usa.poll();
        System.out.println(result);
    }








    3)

    private static void StackExample() {
        //Object, new, Capital Letter
        ArrayList<String> names = new ArrayList<String>();

        *//**
         * List
         * Dynamic - adaptable size.
         * Ordered - by a numeric index.
         *Duplicate are aloud


        Stack<String> bricks = new Stack<String>();
        bricks.push("red");
        bricks.push("green");
        bricks.push("blue");

        //Stack:
        //Last in first out -> L,I,F,O
        //Push items into the stuck
        //duplicates are aloud

        //pop items into the stack
        System.out.println(bricks.pop());
        System.out.println(bricks.pop());
        System.out.println(bricks.pop());
    }*/

    

}
