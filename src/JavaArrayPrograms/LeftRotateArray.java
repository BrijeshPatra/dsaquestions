package JavaArrayPrograms;

import java.util.Scanner;

/*
Program to left rotate the elements of an array
 */
public class LeftRotateArray {
    public static void main(String[] args) {
        int[]inputArray=new int[]{1,2,3,4,5};
        int[]outputArray=new int[inputArray.length];
        System.out.println("Enter number of rotation");
        Scanner sc=new Scanner(System.in);
        int noOfRotation=sc.nextInt();
        int rotatingPoint=noOfRotation;

        int i=0;
        while(rotatingPoint<inputArray.length){
            outputArray[i]=inputArray[rotatingPoint];
            i++;
            rotatingPoint++;
        }
        //Now print rest of the elements
        rotatingPoint=0;
        while (rotatingPoint<noOfRotation){
            outputArray[i]=inputArray[rotatingPoint];
            i++;
            rotatingPoint++;
        }
        System.out.println("Output array is");
        for(int arrayElement:outputArray){
            System.out.print(arrayElement + " ");
        }
    }
}
