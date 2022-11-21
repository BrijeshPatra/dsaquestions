package JavaArrayPrograms;

public class RotateArrayKSteps {
    static void rightRotate(int arr[],int n,int k){
        k=k%n;

        for(int i=0;i<n;i++){
            if(i<k){
                System.out.println(arr[n+i-k] + " ");
            }else{
                System.out.println(arr[i-k] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int Array[]={1,2,3,4,5};
        int N=Array.length;

        int K=2;
        rightRotate(Array,N,K);
    }
}
