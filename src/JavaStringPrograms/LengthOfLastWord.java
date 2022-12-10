package JavaStringPrograms;

public class LengthOfLastWord {
    public static void main(String[] args) {
        int len=0;
        String str="Welcome to cloudtech";
        //to ignore the spaces use trim
        str=str.trim();
        //Find the last word and calculate the length
        for(int i=str.length()-1;i>=0;i--){
            if(str.equals("  ")){
                break;
            }else{
               len++;
            }
        }
        System.out.println("Length of the last word is" +
                ": " + len);
    }
}
