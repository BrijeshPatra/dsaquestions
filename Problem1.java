package HashingQuestions;

import java.util.HashMap;

/*
Given an integer array of size n,find all the elements
that appear more than n/3 times

nums[]={1,3,2,5,1,3,1,5,1};
n=9 --> 9/3->3

In-short n/3 times means more than 3 times here 1 is
appearing more than 3 times

Approach->Find frequency of all number and store in map
          traverse the map
 */
public class Problem1 {
    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
        int nums[]={1,3,2,5,1,3,1,5,1};
        majorityElement(nums);
    }
}
