package org.example; //DO NOT DELETE
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.println("Enter the number of gallons: ");
double gallons = input.nextDouble();
System.out.println("In "+ gallons + " gallons there are:");
System.out.println(gallons*4 + " quarts");
System.out.println(gallons*8 + " pints");
System.out.println(gallons*16 + " cups");
System.out.println(gallons*256 + " tablespoons");
}}