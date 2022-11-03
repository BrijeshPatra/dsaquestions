package JavaArrayPrograms;

//Swapping alternate numbers in array

public class SwapAlternate {
   static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
    }
    static void swapAlternate(int arr[],int size){
        for(int i=0;i<size;i+=2) {
            if (i + 1 < size) {
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    public static void main(String[] args) {
        //Initialize array
        int arr[]={3,1,2,7,11,8};
        swapAlternate(arr,6);
        printArray(arr,6);
    }
}
