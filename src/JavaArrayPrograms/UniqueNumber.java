package JavaArrayPrograms;

import java.util.HashMap;

//Approach->We will use hashmap
public class UniqueNumber {
    public static void main(String[] args) {
        int arr[]={2,3,1,6,3,6,2};
        //HERE 1 IS UNIQUE ELEMENT
        HashMap<Integer,Integer>h=new HashMap<Integer, Integer>();
        for(int i=0;i< arr.length;i++){
            h.put(arr[i],i);
        }
        System.out.println(h.keySet());
    }
}
