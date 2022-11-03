package JavaArrayPrograms;
/*
Here we copied all the elements of array into
another array
 */
public class CopyArray {
    public static void main(String[] args) {
        int[]arr1=new int[]{1,2,3,4,5};

        //create another array of size arr1
        int[]arr2=new int[arr1.length];

        //copying all elements of one arr into another
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        //display elements of arr1
        System.out.println("Elements of original array");
        for (int i=0;i< arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println(" ");

        //display elements of arr2
        System.out.println("Elements of new array");
        for (int i=0;i< arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
