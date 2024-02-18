package com.barash.day3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the present day:");
        String day=input.next();
        switch(day){
        /*    case "m":
                System.out.println("today is monday");
                break;
            case "t":
                System.out.println("today us tuesday");
                break;
            case "W":
                System.out.println("today is wednesday");
                break;
            case "th":
                System.out.println("today is thursday");
                break;
            case "f":
                System.out.println("today is friday");
                break;
            case "s":
                System.out.println("today is saturday");
                break;
            case "ss":
                System.out.println("today is sunday");
                break;
            default:
                System.out.println("you have entered a wrong choice");
        */
        case "m"-> System.out.println("today is monday");
        case "t"-> System.out.println("today is tuesday");
        case "w"-> System.out.println("today is wednesday");
        case "th"-> System.out.println("today is thursday");
        case "f"-> System.out.println("today is friday");
        case "s"-> System.out.println("today is saturday");
        case "ss"-> System.out.println("today is sunday");
        default->System.out.println("invalid input");




        }
    }
}
