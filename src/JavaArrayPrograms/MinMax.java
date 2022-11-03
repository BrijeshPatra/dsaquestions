package JavaArrayPrograms;

public class MinMax {
    public static void main(String[] args) {
        int[]arr={6,2,3,4,1,9};
        //min=1 max=9
        findMinMax(arr);

    }
    static void findMinMax(int[] arr) {
        if(arr==null || arr.length==0)return;
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
         System.out.println(max +" maximum ");
         System.out.println(min + " minimum ");
    }
}