/*
 *  UCF COP3330 Fall 2021 VerifyAge Class file
 *  Copyright 2021 Celina Alzenor
 */

package org.example;
import java.util.Scanner;

public class Driving
{
    private final int age;

    //gets input for user's age
    public Driving()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        this.age = input.nextInt();
    }

    public void VerifyAge()
    {
        String finalOut = null;

        //decide which case we have based on the persons age
        int result = this.age >= 16 ? 1 : 2;

        //if the person is older than or is 16
        if(result == 1)
        {
            finalOut = "You are old enough to legally drive.";
        }

        //if they are younger
        if(result == 2)
        {
            finalOut = "You are not old enough to legally drive.";
        }

        System.out.println(finalOut);
    }

}
