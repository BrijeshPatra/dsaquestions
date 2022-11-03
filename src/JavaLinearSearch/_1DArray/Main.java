package JavaLinearSearch._1DArray;
/*
Here we implemented for LinearSearch
 */
public class Main {
    public static void main(String[] args) {
        int[]nums={23,45,1,2,8,19,-3};
        int target=19;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    //search in the array:return the index if
    //item found otherwise return -1

    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for(int index=0;index< arr.length;index++){
            //check the element in every
            //index if it is = to target
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        //this line will execute if none
        //of the return statements above
        //have executed hence the target
        //not found
        return -1;
    }
}
