package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = (b*b) - (4*a*c);
        double sqrt = Math.sqrt(d);
        if (d > 0) {
            var result1 = (-b - sqrt)/(2*a);
            var result2 = (-b + sqrt)/(2*a);
            System.out.println(result1 + " " + result2);
        }
        else if(d == 0) {
            var result1 = -(b/2*a);
            System.out.println(result1);
        }
        else if(d < 0){
            System.out.println("no roots");
        }
    }
}