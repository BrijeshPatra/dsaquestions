package HashingQuestions;
/*
 SubArray sum equal to K
 arr={1,2,3} K=3

 Subarray=1 and 2   ==>1+2=3 which is K
 We have to return the count of such sub-array

               Naive approach

       int arr[]={ 10, 2, -2, -20, 10 };
        int k = -10;
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                //calculate required sum
                sum+=arr[j];

                //check if sum is equal to required sum
                if(sum==k)
                    count++;
            }
        }
        System.out.println(count);
 */
public class Problem5 {
    public static void main(String[] args) {

    }
}
