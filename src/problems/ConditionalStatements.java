package problems;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height");
        double height=sc.nextDouble();
        if(height<5.5){
            System.out.println("Person is short");
        } else if (height>5.5) {
            System.out.println("Person is tall");
        }
    }
}
