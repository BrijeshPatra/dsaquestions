package problems;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        double length= sc.nextDouble();
        System.out.println("Enter breadth");
        double breadth= sc.nextDouble();

        double area=length*breadth;
        System.out.println("Area of rectangle is:"+area);
    }
}
