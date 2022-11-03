package JavaLinearSearch.problem;
/*
QUESTION->Count the even number of digit
        I/P {12,7896,432,1}
        O/P->2
    Because only 12 and 7896 contains even digits

APPROACH->1)Count the no.of.digits
          2)Convert into string and take the length
      int n=1764
      while(n>0){ //1764>0 yes
         count++;
         n=n/10 //This will check no of digit
      }
 */
public class EvenDigits {
    public static void main(String[] args) {
        int[]nums={12,345,3,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[]nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //function to check whether no contains
    //even digit or not
    private static boolean even(int num) {

        int numberOfDigits=digits(num);
        if (numberOfDigits%2==0) {
            return true;
        }
        return false;
    }
    static int digits(int num){
      int count=0;
      while(num>0){
          count++;
          num=num/10;
      }
        return count;
    }

}
