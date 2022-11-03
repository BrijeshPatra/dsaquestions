package JavaArrayPrograms;

public class SmallestElement {
    public static void main(String[] args) {
        int[]arr=new int[]{25,11,7,75,56};
        //initialise max
        int min=arr[0];
        //Loop through array
        for(int i=0;i< arr.length;i++) {
            //compare elements of array with max
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest element present in array" +
                "is " + min);
    }
}
