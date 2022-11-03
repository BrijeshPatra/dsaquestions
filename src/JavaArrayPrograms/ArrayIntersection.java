package JavaArrayPrograms;
/*
Approach->Brute force: Use nested loops
Sorting and binary search
Sorting and two-pointer approach
Using a Hash Table
 */
public class ArrayIntersection {
    static void printIntersection(int arr1[],int arr2[],int m,int n){
      int i=0,j=0;
      while(i<m && j<n){
          if(arr1[i]<arr2[j])
              i++;
          else if(arr2[j]<arr1[i])
              j++;
          else{
              System.out.println(arr2[j++] + " ");
              i++;
          }
      }
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        int m = arr1.length;
        int n = arr2.length;
        printIntersection(arr1, arr2, m, n);
    }
}
