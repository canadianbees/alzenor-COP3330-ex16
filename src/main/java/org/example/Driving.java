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
        //if age is 16 or greater, the person can drive
        if(this.age >= 16)
        {
            System.out.print("You are old enough to legally drive.");
            return;
        }

        //if less, they can not drive
        System.out.print("You are not old enough to legally drive.");
    }



}
