package JavaArrayPrograms;
/*
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
 */
public class PascalsTriangle {
    public int factorial(int i) {
        if (i == 0)
            return 1;
        return i + factorial(i - 1);
    }
    public static void main(String[] args) {
        int n=4,i,j;
        PascalsTriangle pt=new PascalsTriangle();
        for(i=0;i<=n;i++){
            for(j=0;j<=n-1;j++){
                //left spacing
                System.out.println(" ");
            }
            for(j=0;j<=i;j++){
                //nCr formula
                System.out.println(pt.factorial(i)/(pt.factorial(i-j)*pt.factorial(j)));
            }
            System.out.println();
        }
    }
}
