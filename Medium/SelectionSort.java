import java.util.Arrays;
public class SelectionSort {
    public static void selection_sort(int arr[]){
        for(int i=0; i < arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                int key=i;
                if(arr[key]>arr[j]){
                    key=j;
                }
                int temp=arr[key];
                arr[key]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String args[]){
        int[] arr={4,1,3,9,7};
        System.out.println("Unsorted array: "+ Arrays.toString(arr));
        selection_sort(arr);
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
}
