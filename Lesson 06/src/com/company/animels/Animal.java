package com.company.animels;

public class Animal {
    //Properties
    boolean isAlive;
    String lastFeed;//זמן האכלה אחרון


    //comman + N
    //constructor
    public Animal(boolean isAlive, String lastFeed) {
        this.isAlive = isAlive;
        this.lastFeed = lastFeed;
    }

    //methods/actions
    void print(){
        System.out.println("is Alive" + isAlive);
        System.out.println("last feed" + lastFeed);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "isAlive=" + isAlive +
                ", lastFeed='" + lastFeed + '\'' +
                '}';
    }

    public static class Bird extends Animal {

        //Properties

        String flying;
        String haveWings;

        //Constructor

        public Bird(boolean isAlive, String lastFeed, String flying, String haveWings) {
            super(isAlive, lastFeed);
            this.flying = flying;
            this.haveWings = haveWings;
        }


        //Methods/action


        @Override
        void print() {
            super.print();
        }

        @Override
        public String toString() {
            return "Bird{" +
                    "flying='" + flying + '\'' +
                    ", haveWings='" + haveWings + '\'' +
                    ", isAlive=" + isAlive +
                    ", lastFeed='" + lastFeed + '\'' +
                    '}';
        }
    }
}
