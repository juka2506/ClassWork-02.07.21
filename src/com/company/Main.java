package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Write a program calculate the x values of the quadratic equation
        // (-b +- sqrt(b^2 - 4 * a * c)) / 2a
        // 2x^2 + 3x - 4 = 0
        // a      b    c

        // 1. Collect our input
        // 2. Solve for the discriminant
        // 3. find the first x value
        // 4. find the second x value
        // 5. output the result

        // Get user input from the console
        // initialize the scanner. Scanner class/object allows us to receive input from the user
        Scanner scanner = new Scanner(System.in);

        //Get value of a
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        //Get value of b
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        //Get value of c
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        //solve for the discriminant (b^2 - 4 * a * c)
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        //if the discriminant is negative than exit the program
        if (discriminant < 0) {
            System.out.println("Discriminant is negative");
            return;
        }

        //solve for the first value of x1
        //(-b + sqrt(discriminant)) / 2 * a
        double x1 = (-b + Math.sqrt(discriminant)) / 2 * a;

        //solve for the first value of x2
        //(-b - sqrt(discriminant)) / 2 * a
        double x2 = (-b - Math.sqrt(discriminant)) / 2 * a;

        //output the results
        System.out.println("The first value of x: " + x1);
        System.out.println("The second value of x " + x2);

        //_________________________________________________________________
        // harmonic series formula
        System.out.print("Enter a number n: ");
        double n = scanner.nextInt();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum = sum + (1 / i);
        }
        System.out.println("The answer is: " + sum);

        // __________________________________________________________
        //Finding average of int array
        System.out.print("Enter the number of values you want to average: ");
        int[] ages = new int[scanner.nextInt()]; //get size of the array & create array of that size
        //add the user's values to the array
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the next age: ");
            ages[i] = scanner.nextInt();
        }

        double sum2 = 0;
        for (int i = 0; i < ages.length; i++) {
            sum2 += ages[i];
        }

        double average = sum2 / ages.length;
        System.out.println("The average age of " + ages.length + " kids is: " + average);


        //__________________________________________________________
        //Printing out the array
        System.out.print("Enter array size: ");
        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the next number: ");
            numbers[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(numbers));

        // Alternative way
        String numberArray = "["; // Concatenating the values to this string
        for (int i = 0; i < numbers.length; i++) {
            if (i != numbers.length - 1) {
                numberArray += numbers[i] + ", ";
            } else {
                numberArray += numbers[i] + "]";
            }
        }
        System.out.println(numberArray);


    }
}
