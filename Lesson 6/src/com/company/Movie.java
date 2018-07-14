package com.company;

public class Movie {

    String titile;
    String url;
    int year;


    Movie (String title, String url, int year){
        this.titile = title;
        this.url = url;
        this.year = year;

    }
    Movie (){
        titile = IO.getString("enter title: ");
        url = IO.getString("enter url: ");
        year = IO.getInt("enter year: ");

    }

    void print (){
        System.out.println("Title: " + titile);
        System.out.println("year: " + year);
        System.out.println("url: " + url);
    }

}
