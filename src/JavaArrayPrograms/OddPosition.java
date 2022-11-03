package JavaArrayPrograms;

public class OddPosition {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,3,4,5,6};
        System.out.println("Elements present in odd" +
                "positions are");
        for(int i=0;i< arr.length;i=i+2){
            System.out.print(arr[i]);
        }
    }
}
