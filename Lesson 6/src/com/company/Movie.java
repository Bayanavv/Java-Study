package com.company;

import com.company.utils.IO;

//movie extend from object
public class Movie {


    String titile;
    String url;
    int year;


    Movie (String title, String url, int year){
        this.titile = title;
        this.url = url;
        this.year = year;

    }
    //IO Constructor
    Movie (){
        titile = IO.getString("enter title: ");
        url = IO.getString("enter url: ");
        year = IO.getInt("enter year: ");

    }
    //methods
    void print (){
        System.out.println("Title: " + titile);
        System.out.println("year: " + year);
        System.out.println("url: " + url);
    }

    @Override
    public String toString() {
        return "movie: " + titile +" year:  " + " url: " + url;

    }
}
