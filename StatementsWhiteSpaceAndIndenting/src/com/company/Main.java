package com.company;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50; //statement
        if(myVariable == 50)
        {
            System.out.println("Printed");
        }
        myVariable++;  //statement
        myVariable--;  //statement
        System.out.println("This is"  +      //code doesn't have to be in one line
                           " another" +      //to be considered a valid Java statement
                           " still more");   //Java realizes there's no semicolon at the end of the
                                             //first line, so it continues to the next line.
                                             //Then, Java collectively adds all the lines together
                                             //and effectively creates the line as if it was all in one line
                                             //as such

        System.out.println("This is another still more");

        //You can also have multiple statements in one line, as demonstrated below:
        int myVar = 50; myVar++; System.out.println("This is another test");
        //Whitespace doesn't care about spaces
        int
        myva =
                50;
        //Still valid, but not recommended.


    }
}
