package problems;

import java.util.Scanner;

public class GreaterInteger {
    public static void main(String[] args){
        System.out.println("Enter 3 integers");
        int max=0;
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        if(a>b){
            if(a>c)
                max=a;
            else
                max=c;
        }else{
            if(b>c){
                max=b;
            }else
                max=c;
        }
        System.out.println("The largest value is: " + max);
    }
}
