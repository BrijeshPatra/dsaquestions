package JavaArrayPrograms;
/*
Approach->Use to nested loops tp find the answer
Both the inputs sum should be equal to the target
 */
public class PairSum {
    public static void main(String[] args) {
        int arr[]={1,2,5,7,3,4,6,9,8};
        int target=10;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }
}
