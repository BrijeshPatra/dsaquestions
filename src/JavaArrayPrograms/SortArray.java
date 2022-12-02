package JavaArrayPrograms;
//sort array consisting 0s and 1s using two pointer

import java.util.Scanner;

/*
int n= arr.length;
        int zeroes=0;

        for (int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<zeroes){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
    }
 */
public class SortArray {
    static void swap(int arr[],int left,int right){
        int temp=left;
        left=right;
        right=temp;
    }
    static void sortZeroAndOne(int[]arr) {
        int n= arr.length;

        int left=0,right=n-1;

        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n= sc.nextInt();
        int[]arr=new int[n];

        System.out.println(" Enter " + n + " elements ");

        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Original array");
       // printArray(arr);
        sortZeroAndOne(arr);
        System.out.println("Sorted array");
       // printArray(arr);
    }

//     static void printArray(int[] arr) {
//        for(int i=0;i< ;i++){
//            System.out.println(i);
//        }
    }
//}
