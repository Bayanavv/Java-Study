package com.company;

public class OffensePlayer extends Player{

    int numberOfAttackes;


    public OffensePlayer(String name, int birthDay, int height, int shirtNumber, double procentegeShotsForTheLine, double procentegeShotsForTheFiled, double procentegeShotsForTheThiredLine) {
        super(name, birthDay, height, shirtNumber, procentegeShotsForTheLine, procentegeShotsForTheFiled, procentegeShotsForTheThiredLine);
    }

    public OffensePlayer(String name, int birthDay, int height, int shirtNumber, double procentegeShotsForTheLine, double procentegeShotsForTheFiled, double procentegeShotsForTheThiredLine, int numberOfAttackes) {
        super(name, birthDay, height, shirtNumber, procentegeShotsForTheLine, procentegeShotsForTheFiled, procentegeShotsForTheThiredLine);
        this.numberOfAttackes = numberOfAttackes;
    }
}
