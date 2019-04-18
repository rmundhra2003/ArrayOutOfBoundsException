package com.company;

import java.util.ArrayList;
import java.util.Random;

public class UsingArrayList {
    public static void main(String[] args) {
        Random rnd = new Random();
        int randomInt;
        int j = 0;

        //Declare array to hold ten test scores
        ArrayList<Integer> scores = new ArrayList<Integer>();


        //Initialize elements of an array
        for (j = 0; j < 10; j++){
            randomInt = 1 + rnd.nextInt(100);//creates a random number between 1 and 100
            scores.add(randomInt);
        }

        j = 0;
        //Print the elements of an array
        for (Integer i:scores){
            System.out.printf("Element # %d value is %d\n", j, i);
            j++;
        }

        //print the fifth element
        System.out.println("The fifth value is " + scores.get(4));
        //Print every other element
        j = 0;
        for (Integer i:scores){
            if(j%2 != 0) {
                j++;
                continue;
            }
            System.out.printf("Score %d is %d\n", j, scores.get(j));
            j++;
        }

        //Print the number of elements
        System.out.println("The array length is " + scores.size());


        //Change an element
        scores.add(0, 100);
        System.out.println("The first element is now 100");


        //this line will not generate the ArrayIndexOutOfBoundsException
        //we'll learn more about Exception (error) handling soon
        try{
            System.out.println(scores.get(10));
        }catch(Exception e){
            System.out.println("We caught the ArrayIndexOutOfBoundsException error");
        }


        //this line will generate an ArrayIndexOutOfBoundsException
        //since we did not wrap it in the try..catch for error handling
        System.out.println(scores);
    }
}