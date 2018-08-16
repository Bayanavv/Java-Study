package com.company;

public class Player {
    /**
     * name:
     * birth day:
     * height
     * shirt number
     * % shot from the line
     * % shot from the filed
     * % shot from the 3 line
     * */
    String name;
    int birthDay;
    int height;
    int shirtNumber;
    double procentegeShotsForTheLine;
    double procentegeShotsForTheFiled;
    double procentegeShotsForTheThiredLine;

    public void kadrer(){
        System.out.println("kadrer");

    }
    public void zrokM3(){
        System.out.println("zrok m line 3");

    }
    public void zrokM2(){
        System.out.println("zrok m lime 2");

    }
    public void zrokMkav(){
        System.out.println("zrok m line 1");

    }

    public Player() {
    }

    public Player(String name, int birthDay, int height, int shirtNumber, double procentegeShotsForTheLine, double procentegeShotsForTheFiled, double procentegeShotsForTheThiredLine) {
        this.name = name;
        this.birthDay = birthDay;
        this.height = height;
        this.shirtNumber = shirtNumber;
        this.procentegeShotsForTheLine = procentegeShotsForTheLine;
        this.procentegeShotsForTheFiled = procentegeShotsForTheFiled;
        this.procentegeShotsForTheThiredLine = procentegeShotsForTheThiredLine;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", height=" + height +
                ", shirtNumber=" + shirtNumber +
                ", procentegeShotsForTheLine=" + procentegeShotsForTheLine +
                ", procentegeShotsForTheFiled=" + procentegeShotsForTheFiled +
                ", procentegeShotsForTheThiredLine=" + procentegeShotsForTheThiredLine +
                '}';
    }

}
