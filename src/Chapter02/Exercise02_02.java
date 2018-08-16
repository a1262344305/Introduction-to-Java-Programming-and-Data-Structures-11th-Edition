/**
 * (Compute the volume of a cylinder) Write a program that reads in the radius and length of a cylinder and computes the
 * area and volume using the following formulas:
 * area = radius * radius * pi
 * volume = area * length
 *
 * Here is a sample run:
 * Enter the radius and length of a cylinder: 5.5 12
 * The area is 95.0331
 * The volume is 1140.4
 *
 * Created by Sven on 08/16/18.
 */
package Chapter02;

import java.util.Scanner;

public class Exercise02_02 {
    public static void main(String[] args) {
        double PI = 3.1415926;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }

}
