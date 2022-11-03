package JavaArrayPrograms;

import java.util.Arrays;

/*
Reverse an array
Input array=1,2,3,4,5
Output array=5,4,3,2,1

Approach 1->Run two for loops
Approach 2->Using recursion
 */
public class ReverseArray {
    public static void main(String[] args) {

//        System.out.println("Original array");
//        for(int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//        System.out.println("Array in reverse order");
//        for(int i= arr.length-1;i>=0;i--){
//            System.out.print(arr[i]+ " ");
//        }

        int[]arr={1,2,3,4,5};
        int n=arr.length;
        reverseArray(arr,0,n-1);
        System.out.println(Arrays.toString(arr));


    }
    static void reverseArray(int[] arr,int start,int end) {
        if(start>end)return;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverseArray(arr, start+1, end-1);
        }

    }

