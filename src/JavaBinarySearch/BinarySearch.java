package JavaBinarySearch;
/*
Here we implemented the code of binary search
Approach->Find mid then Compare the target with
mid-element
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[]arr={11,12,13,14,15,16,17};
        int target=16;
        System.out.println(binarySearch(arr,16));
    }
    //return the index
    //return -1 if it doesn't exist
    static int binarySearch(int []arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find the middle element
           // int mid=start+end/2;
          //integer has fixed size

         int mid=start+(end-start)/2;
         //int mid=start+end/2;
         if(target<arr[mid]){
             end=mid-1;
         }else if(target>arr[mid]){
             start=mid+1;
         }else{
             //ans found
             return mid;
         }
        }
        return -1;//Element not exists in array
    }
}
