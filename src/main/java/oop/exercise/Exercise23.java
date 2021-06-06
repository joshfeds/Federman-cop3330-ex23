package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
 * Create a program that walks the user through troubleshooting issues with a car.
 * Use the following decision tree to build the system:

@startuml
if (Is the car silent when you turn the key?) then (yes)
    if (Are the battery terminals corroded?) then (yes)
        :Clean terminals and try starting again.;
        stop
    else (no)
        :Replace cables and try again.;
        stop
    endif
else (no)
    if (Does the car make a slicking noise?) then (yes)
        :Replace the battery.;
        stop
    else (no)
        if (Does the car crank up but fail to start?) then (yes)
            :Check spark plug connections.;
            stop
        else (no)
            if (Does the engine start and then die?) then (yes)
                if (Does you car have fuel injection?) then (yes)
                    :Get it in for service.;
                    stop
                else (no)
                    :Check to ensure the choke is opening and closing.;
                    stop
                endif
            else (no)
                :This should not be possible.;
                stop
            endif
        endif
    endif
endif
@enduml
Example Output
Is the car silent when you turn the key? y
Are the battery terminals corroded? n
The battery cables may be damaged.
Replace cables and try again.
Constraint
Ask only questions that are relevant to the situation and to the previous answers. Don’t ask for all inputs at once
 */
public class Exercise23
{
    static Scanner input = new Scanner(System.in);
    public static String batteryCorr(){
        System.out.print("Are the battery terminals corroded?");
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
    public static String silentCar(){

        System.out.print("Please enter either y or n for the following questions:\nIs the car silent when you turn the key?");
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
        return "No";
    }
    public static void main( String[] args ) {
        String solution = silentCar();
    }
}
