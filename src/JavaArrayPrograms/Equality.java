package JavaArrayPrograms;

import java.util.Scanner;

public class Equality {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of the array");

        int n = scn.nextInt();

        int[] arr1 = new int[n];

        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++){

            arr1[i] = scn.nextInt();

        }

        boolean ans = true;

        for(int i = 0; i < n; i++){

            arr2[i] = scn.nextInt();

            if(arr2[i] != arr1[i]){

                ans = false;

                break;

            }

        }

        System.out.print(ans);

    }

}
