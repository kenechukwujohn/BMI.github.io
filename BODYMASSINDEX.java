/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package body.mass.index;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BODYMASSINDEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare scanner
        Scanner sc = new Scanner(System.in);
        
        //declare variables
        double weight;
        double feet;
        double inches;
        
        //prompt user
        
        System.out.print("Enter weight in pounds: ");
        weight = sc.nextDouble();
        System.out.print("Enter feet: ");
        feet = sc.nextDouble();
        System.out.print("Enter inches: ");
        inches = sc.nextDouble();
        
        // convert measurements
        double weightInKilos = weight * 2.2046;
        double heightInMeters = (((feet * 12) + inches) * .0254);
        double bmi = weightInKilos / Math.pow(heightInMeters, 2.0);
        //bmi = weightInKilos / (heightInMeters * heightInMeters)
        
        //display output
        System.out.println("your BMI is: " + bmi);
        
        //interpret BMI
        if (bmi < 18.5){
            System.out.print("underweight");
            }
        else if (bmi >= 18.5 && bmi < 25){
            System.out.print("Normal");
        }
        else if (bmi >= 25 && bmi < 30){
            System.out.print("Overweight");
        }
        else if (bmi >= 30){
            System.out.print("Obese");
        }
        else{
            System.out.print("Your input was incorrect");
        }
    }
    
}
