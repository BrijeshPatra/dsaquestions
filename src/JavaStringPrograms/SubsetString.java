package JavaStringPrograms;

/*
Java Program to find all subsets of a string
 */
public class SubsetString{
    public static void main(String[] args) {
        String str="CAT";
        //calculate length
        int length=str.length();
        System.out.println("Length of string is:"+length);
        int temp=0;

        String arr[]=new String[length*(length+1)/2];
        //run two for loops
        for(int i=0;i<length;i++){//i=0
            for(int j=i;j<length;j++){ //j=0,1,2
                /*
                arr[0]=CAT.substring(0,0+1)
                temp++(0++)->1
                /*
                arr[1]=CAT.substring(1,1+1)
                temp++(1++)->2
                 */

                /*
                 arr[2]=CAT.substring(2,2+1)
                temp++(2++)->3
                 */
                arr[temp]=str.substring(i,j+1);//C,CA,CAT
                temp++;
            }
        }
        System.out.println("All subsets for the given" +
                "string: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}