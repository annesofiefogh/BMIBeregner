package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static boolean findBMI(double userBMI) {

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Du har et BMI på " + df.format(userBMI));

        if (userBMI < 18.5) {
            System.out.println("Du er undervægtig");
            return true;
        } else if (userBMI > 18.5 && userBMI <= 25) {
            System.out.println("Du er normalvægtig");
            return true;
        } else if (userBMI > 25 && userBMI <= 30) {
            System.out.println("Du er overvægtig");
            return true;
        } else {
            System.out.println("Du er svært overvægtig");
            return true;
        }
    }

    public static void main(String[] args) {

        System.out.println("Velkommen til BMI beregner v2.0!");

        Scanner sc = new Scanner(System.in);

        System.out.print("Indtast din vægt i kg: ");
        double weight = sc.nextDouble();
        System.out.print("Indtast din højde i meter: ");
        double height = sc.nextDouble();

        double userBMI = (weight / Math.pow(height, height));

        findBMI(userBMI);
    }
}

