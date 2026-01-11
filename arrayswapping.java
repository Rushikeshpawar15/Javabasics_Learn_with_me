import java.util.Arrays;
import java.util.Scanner;
public class arrayswapping {
    public static void main(String[] args) {
        int[] arr = {1,32,23,34,16};
        swaparr(arr,1,4);
        swaparr(arr,3,4);

        System.out.println(Arrays.toString(arr));
    }
    static void swaparr(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    
}
