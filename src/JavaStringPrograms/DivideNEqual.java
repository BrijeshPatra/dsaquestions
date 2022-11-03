package JavaStringPrograms;
/*
Program to divide the string into n equal parts
 */
public class DivideNEqual {
    public static void main(String[] args) {
        //initialize string
        String str="aaaabbbbcccc";

        //stores the length of string
        int len=str.length();
        //n determines the variable that divide the
        // string in 'n' equal parts
        int n=3;
        int temp=0,chars=len/n;

        //stores the array of string
        String[]equalStr=new String[n];

        //check whether string is divisible or not
        if(len%n!=0){
            System.out.println("String cannot be divisble");
        }else{
            for(int i=0;i<len;i=i+chars){
                //dividing string in n equal part using
                //substring

                String part=str.substring(i,i+chars);
                equalStr[temp]=part;
                temp++;
            }
            System.out.println(n + "equal parts of given string are");

            for(int i=0;i<equalStr.length;i++){
                System.out.println(equalStr[i]);
            }
        }
    }
}
