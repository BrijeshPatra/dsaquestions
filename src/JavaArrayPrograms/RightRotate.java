package JavaArrayPrograms;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        /*
        determine the number of times an array
        should be rotate
         */

        int n = 3;
        //Display original array
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //Rotate the given array by n times
        for (int i = 0; i < n; i++) {
            int j, last;
            //stores the last element
            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {
                //shift element one by one
                arr[j] = arr[j - 1];
            }
            //last element of array will be added
            //to the start of an array
            arr[0] = last;
        }
        System.out.println();
        //Displays resulting array after rotation
        System.out.println("Array after right rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
