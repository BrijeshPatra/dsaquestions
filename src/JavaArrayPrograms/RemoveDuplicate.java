package JavaArrayPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicate {
    public static void removeDuplicates(int[]arr){
        LinkedHashSet<Integer>set=new LinkedHashSet<>();

        //add elements to LinkedHashSet
        for(int i=0;i< arr.length;i++){
            set.add(arr[i]);
        }
       //print the elements of LinkedHashSet
        System.out.println(set);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
        removeDuplicates(arr);
    }
}
