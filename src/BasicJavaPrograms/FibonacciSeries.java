package BasicJavaPrograms;/*
Fibonacci means sum of previous two numbers
 For example->0,1  next term will be 0+1
 */

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10,firstTerm=0,secondTerm=1;
        System.out.println("Fibonacci Series till " + n + "terms:");
        for(int i=1;i<=n;++i){
            System.out.println(firstTerm+"  ");

            //compute the next term
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}
