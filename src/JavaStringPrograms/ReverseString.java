package JavaStringPrograms;
/*
Reverse a string
 */
public class ReverseString {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Brijesh");
        System.out.println("String="+str.toString());
        StringBuilder reverseStr=str.reverse();
        System.out.println("Reverse String:"+reverseStr.toString());

    }
}
