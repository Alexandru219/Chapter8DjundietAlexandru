package com.company;
import java.util.Scanner;
public class Ex84Test {
    public static void main(String[] args) {
        Ex84 rectangle = new Ex84();
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the length of rectangle: ");
        rectangle.length = scan.nextDouble();
        System.out.printf("Enter the width of rectangle: ");
        rectangle.width = scan.nextDouble();

        System.out.printf("\nThe perimeter of rectangle: " + rectangle.P(rectangle.length, rectangle.width));

        System.out.printf("\nThe area of rectangle: " + rectangle.area(rectangle.length, rectangle.width));
    }
}
