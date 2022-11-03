package problems;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and height");
        double breadth=sc.nextDouble();
        double height=sc.nextDouble();
        double area=0.5*breadth*height;
        System.out.println("Area is" + area);
//        char grade='D';
//        grade=(char) (grade+5);
//        grade=(char)(grade-5);
//        System.out.println(grade);
    }
}
