import java.util.Scanner; // import java.util.Scanner;
import java.util.Random; // import java.util.Random;
public class ArrayStuff { // class ArrayStuff
    public static void main(String[] args) { // main

        Random rnd = new Random(); // Random rnd = new Random()
        Scanner in = new Scanner(System.in); // Scanner in = new Scanner(System.in)
        int sum = 0; // num sum = 0
        int average = 0; // num average = 0
        int input = 0; // num input = 0
        int count = 0; // mun count = 0
        boolean input1 = false; // boolean input1 = false

        // Question 1:
        int[] dataPoints = new int[101]; // gives a value from 0 to 100

        for (int x = 0; x < dataPoints.length; x++) // for (int x = 0; x < dataPoints.length(100); x++)
        {
            dataPoints[x] = rnd.nextInt(100) + 1; // gives a value from 0 to 100

            System.out.println("Location " + x + " " + dataPoints[x]); // output "Location " + x + " " + dataPoints[x]
        } // end for

        input = SafeInput.getRangedInt(in, "Enter an int ", 1, 100); // input = SafeInput.getRangedInt(in, "Enter an int ", 1, 100) makes sure that it is in range
        for (int x = 0; x < dataPoints.length; x++) //for (int x = 0; x < dataPoints.length; x++) the actual output loop
        {
            dataPoints[x] = rnd.nextInt(100) + 1; // gives a value from 0 to 100
            System.out.printf("val" + dataPoints[x] + " | "); // output "val" + dataPoints[x] + " | "
            sum = sum + dataPoints[x]; // sum = sum + dataPoints[x]
            average = (sum + dataPoints[x]) / dataPoints[x]; // average = (sum + dataPoints[x]) / dataPoints[x]
            if (input == dataPoints[x]) //if (input == dataPoints[x]) if it is found in the array then
            {
                count = count + 1; // keep a count, count = count + 1
            }

        } // end for

        System.out.print("\n"); // new line
        System.out.println("The sum is : " + sum + " and the average is " + average); // output "The sum is : " + sum + " and the average is " + average

        if(count == 1) // if the count is == to 1 then
        {
            System.out.print("Your number " + input + " has been found " + count + " time."); // output "Your number " + input + " has been found " + count + " time."
        }
        else // else
        {
            System.out.print("Your number " + input + " has been found " + count + " times."); // output "Your number " + input + " has been found " + count + " times."
        }
        System.out.print("\n"); // new line

        input = SafeInput.getRangedInt(in, "Enter an int ", 1, 100); // input = SafeInput.getRangedInt(in, "Enter an int ", 1, 100) checks if input is in range

        for (int x = 0; x < dataPoints.length; x++) // for (int x = 0; x < dataPoints.length; x++)
        {

            dataPoints[x] = rnd.nextInt(100) + 1;
                System.out.printf("val" + dataPoints[x] + " | "); // output "val" + dataPoints[x] + " | ")
            if (input == dataPoints[x]) // if (input == dataPoints[x]) then
            {
                input1 = true; // input1 = true
                System.out.print("\n"); // new line
                System.out.print("Your number " + input + " was found at index " + x); // output "Your number " + input + " was found at index " + x
                break; // break
            }

        } // end for
        if (input1 = false) // if input1 is false then
        {
            System.out.print("Your number " + input + " was not found"); // output"Your number " + input + " was not found"
        }
        System.out.print("\n"); // new line
        int min = dataPoints[0]; // num min = dataPoints[0]
        int max = dataPoints[0]; // num max = dataPoints[0]

        for(int x = 0; x < dataPoints.length; x++) // for(int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(100) + 1; // random 1 = 100
            System.out.printf("val" + dataPoints[x] + " | "); // output "val" + dataPoints[x] + " | "

            if(min > dataPoints[x]) // if(min > dataPoints[x]) then
            {
                min = dataPoints[x]; // min = dataPoints[x]
            }
            if(max < dataPoints[x]) // if(max < dataPoints[x]) then
            {
                max = dataPoints[x]; // max = dataPoints[x]
            }
        } // end for
        System.out.print("\n"); // new line
        System.out.println("The min is " + min); // output "The min is " + min
        System.out.println("The max is " + max); // output "The max is " + max
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints)); // output from array "Average of dataPoints is: " + getAverage(dataPoints)

    }
    public static double getAverage(int values[]) // get the average from array
    {
        Random rnd = new Random(); // random
        // declare variables
        int average = 0; // num average = 0
        int sum = 0; // num sum = 0

        for (int x = 0; x < values.length; x++) // for (int x = 0; x < values.length; x++)
        {

            sum = sum + values[x]; // sum = sum + values[x]
            average = (sum + values[x]) / 100; // average = (sum + values[x]) / 100
        } // end for
        return average; // return average

    }
} // end class