package JavaStringPrograms;

import java.util.Arrays;
/*
Java Program to determine whether two
strings are the anagram

Anagram->It means if two strings contains same characters
however the order or sequence can be different.
 */
public class AnagramStrings {
    public static void main(String[] args) {
        String str1="Brag";
        String str2="Grab";

        //converting both to lower case
       str1= str1.toLowerCase();
       str2=str2.toLowerCase();

        //checking the length of strings
        if(str1.length()!=str2.length()){
            System.out.println("Strings are not Anagram");
        }else{
            //converting both to character array
            char[]string1=str1.toCharArray();
            char[]string2=str2.toCharArray();

            //sort the array using built-in function sort()
            Arrays.sort(string1);
            Arrays.sort(string2);

            //comparing both the arrays using built-in
            //function equals()
            if(Arrays.equals(string1,string2)==true){
                System.out.println("Both the strings are anagram");
            }else{
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}
