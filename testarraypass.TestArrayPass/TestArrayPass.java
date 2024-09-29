/*
 * Program: TestArrayPass.java
 * Student: Lydia Frame 
 * Purpose: Creating a new .java file and using the integer array from Assignment 1. Pass the array to a method and sum the values 
 * and calculate the average. Display results in the main() method.
*/

import java.util.Scanner;

public class TestArrayPass {

    public static void main(String[] args) {

        //integer array
        int[] numbers = new int[5]; 

        //array values by index
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        //Print array results
        PrintArray(numbers);
    }

    //method to sum values and calculate the average of the array
    public static void PrintArray(int[] array){

        int sum = 0; 

        //Calculate the sum 
        for (int i = 0; i < array.length; i++) {

            sum += array[i];
        }

        //calculate the average
        double average = (double)sum/array.length;

        //print sum and average
        System.out.println("The Sum of the array = " + sum);
        System.out.println();
        System.out.println("The Average of the array = " + average); 
    }

}





