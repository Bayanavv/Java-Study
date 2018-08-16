package com.company;

public class Center extends Player{
    int numberOfPasses;


    public Center(String name, int birthDay, int height, int shirtNumber, double procentegeShotsForTheLine, double procentegeShotsForTheFiled, double procentegeShotsForTheThiredLine) {
        super(name, birthDay, height, shirtNumber, procentegeShotsForTheLine, procentegeShotsForTheFiled, procentegeShotsForTheThiredLine);
    }

    public Center(String name, int birthDay, int height, int shirtNumber, double procentegeShotsForTheLine, double procentegeShotsForTheFiled, double procentegeShotsForTheThiredLine, int numberOfPasses) {
        super(name, birthDay, height, shirtNumber, procentegeShotsForTheLine, procentegeShotsForTheFiled, procentegeShotsForTheThiredLine);
        this.numberOfPasses = numberOfPasses;
    }

}
