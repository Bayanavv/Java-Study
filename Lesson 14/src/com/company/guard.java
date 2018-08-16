package com.company;

public class guard extends Player{

    int numberOfBlockesPerGame;


    public guard(String name, int birthDay, int height, int shirtNumber, double procentegeShotsForTheLine, double procentegeShotsForTheFiled, double procentegeShotsForTheThiredLine) {
        super(name, birthDay, height, shirtNumber, procentegeShotsForTheLine, procentegeShotsForTheFiled, procentegeShotsForTheThiredLine);
    }

    public guard(String name, int birthDay, int height, int shirtNumber, double procentegeShotsForTheLine, double procentegeShotsForTheFiled, double procentegeShotsForTheThiredLine, int numberOfBlockesPerGame) {
        super(name, birthDay, height, shirtNumber, procentegeShotsForTheLine, procentegeShotsForTheFiled, procentegeShotsForTheThiredLine);
        this.numberOfBlockesPerGame = numberOfBlockesPerGame;
    }
}
