package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        userInput();
    }


    static double userInput() {
        System.out.println("Enter a Degree in Fahrenheit: ");
        Scanner input = new Scanner(System.in);
        double temp = input.nextInt();

        if (temp <= -460) {
            System.exit(0);
        }

        else if (temp >= -460);{
            double cel = ((temp - 32) * 0.556);
            System.out.println(cel);
        }
        return temp;
    }

}
