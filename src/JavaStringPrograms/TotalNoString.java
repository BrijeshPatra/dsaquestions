package JavaStringPrograms;
/*
Java Program to count the total number of
 characters in a string
*/
public class TotalNoString {
    public static void main(String[] args) {
        String string="Brijesh patra";
        int count=0;

        //counts each character except space
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)!=' '){
                count++;
            }
            //display total number of characters
            //present in the string

            System.out.println("The total number" +
                    "present in a string: " + count);
        }
    }
}
