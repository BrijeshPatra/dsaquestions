package BasicJavaPrograms;
/*
Natural numbers means->It contains all positive
integers from 1 to infinity
 */
public class SumOfNNaturalNo {
    static int naturalNumberSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
     int n=50;
        System.out.println("Sum of Natural numbers is: " + naturalNumberSum(n));
    }
}
