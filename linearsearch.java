import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 12, 43, 56, 32, 112, 45, 23, 11 };
        int target = 112;
        int ans = searching(arr, target);
        System.out.println(ans);

    }

    static int searching(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
}
