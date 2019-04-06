package com.company;

import com.company.utils.IO;

public class Movie {

    //Properties:
    //title, year, url

    String title;
    String url;
    int year;

    //constructor:
    //מתודה שמסייעת לבצע השמה לתכונה של האובייקט
    Movie(String title, String url, int year){
        this.title = title;
        this.url = url;
        this.year = year;
    }
    //IO Constructor
    Movie(){
        title = IO.getString("Enter title: ");
        url = IO.getString("Enter url: ");
        year = IO.getInt("Enter year: ");
    }
    //methods/Actions
    void print(){
        System.out.println("title: " + title);
        System.out.println("year: " + year);
        System.out.println(": " + url);
    }

    //toString()
    //Movie extends Object, and one of the methods named toString() in inherited.
    //shortcut ->command N-> toString().
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", year=" + year +
                '}';
    }
}
