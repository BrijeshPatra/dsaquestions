package JavaSorting;
/*
Selection Sort->The selection sort algorithm sorts an
array by repeatedly finding the minimum element (considering ascending order)
 from the unsorted part and putting it at the beginning.

ALGO-->
 1) Initialize minimum value(min_idx) to location 0.
 2)Traverse the array to find the minimum element in the array.
 3)While traversing if any element smaller than min_idx is found then swap both the values.
 4)Then, increment min_idx to point to the next element.
 5)Repeat until the array is sorted.
 */
 class SelectionSort{
     void sort(int[]arr){
         int n=arr.length;

         for(int i=0;i<n;i++){
             int min_idx=i;
             for(int j=i+1;j<n;j++)
                 if(arr[j]<min_idx)
                     min_idx=j;

                 int temp=arr[min_idx];
                 arr[min_idx]=arr[i];
                 arr[i]=temp;
             }
         }
      void printArray(int[]arr){
         int n=arr.length;
         for(int i=0;i<n;i++){
             System.out.println(arr[i]+ " ");
             System.out.println();
         }
      }
    public static void main(String[] args) {
     SelectionSort obj=new SelectionSort();
        int arr[] = {64,25,12,22,11};
        obj.sort(arr);
        System.out.println("Sorted array");
        obj.printArray(arr);
    }
}