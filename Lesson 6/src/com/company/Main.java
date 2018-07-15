package com.company;

import com.company.zoo.Tiger;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Tiger david = new Tiger(true, "9:10", 6, 70);
        //david.print();

        Movie m = new Movie("moana", "wwww.Moumou.com", 2016);
        System.out.println(m);

        Tiger tiga = new Tiger(true, "8:30", 3, 20);
        System.out.println(tiga);

        Person myP = new Person("mode", "doe", 30 );
        System.out.println(myP);
    }
}
