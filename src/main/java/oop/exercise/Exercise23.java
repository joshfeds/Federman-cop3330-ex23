package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
*/
public class Exercise23
{
    static Scanner input = new Scanner(System.in);
    public static String batteryCorr(){
        System.out.print("Are the battery terminals corroded? ");
        String answer = input.nextLine();
        while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"))
        {
            System.out.print("Please select either y or n");
            answer = input.nextLine();
        }
        if(answer.equalsIgnoreCase("y"))
        {
            return "Clean terminals and try starting again.";
        }
        else
        {
            return "Replace cables and try again.";
        }
    }
    public static String fuelInject(){
        System.out.print("Does your car have fuel injection? ");
        String answer = input.nextLine();
        while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"))
        {
            System.out.print("Please select either y or n");
            answer = input.nextLine();
        }
        if(answer.equalsIgnoreCase("y"))
        {
            return "Get it in for service.";
        }
        else
        {
            return "Check to ensure the choke is opening and closing.";
        }
    }
    public static String engineStart(){
        System.out.print("Does the engine start and then die? ");
        String answer = input.nextLine();
        while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"))
        {
            System.out.print("Please select either y or n");
            answer = input.nextLine();
        }
        if(answer.equalsIgnoreCase("y"))
        {
            return fuelInject();
        }
        else
        {
            return "This should not be possible unless you drive a Fiat.";
        }
    }
    public static String carCrank(){
        System.out.print("Does the car crank up but fail to start? ");
        String answer = input.nextLine();
        while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"))
        {
            System.out.print("Please select either y or n");
            answer = input.nextLine();
        }
        if(answer.equalsIgnoreCase("y"))
        {
            return "Check spark plug connections.";
        }
        else
        {
            return engineStart();
        }
    }
    public static String slickNoise(){
        System.out.print("Does the car make a slicking noise? ");
        String answer = input.nextLine();
        while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"))
        {
            System.out.print("Please select either y or n");
            answer = input.nextLine();
        }
        if(answer.equalsIgnoreCase("y"))
        {
            return "Replace the battery.";
        }
        else
        {
            return carCrank();
        }
    }
    public static String silentCar(){

        System.out.print("Please enter either y or n for the following questions:\n" +
                "Is the car silent when you turn the key? ");
        String answer = input.nextLine();
        while(!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"))
        {
            System.out.print("Please select either y or n");
            answer = input.nextLine();
        }
        if(answer.equalsIgnoreCase("y"))
        {
            return batteryCorr();
        }
        else
        {
            return slickNoise();
        }
    }
    public static void main( String[] args ) {
        String solution = silentCar();
        System.out.print(solution);
    }
}
