import java.util.Arrays;

public class variablelenargument {
    public static void main(String[] args) {
        func(2,3,4,5,6,7);
    }
    static void func(int... v){
        System.out.println(Arrays.toString(v));
    }
}
//output 
//[2,3,4,5,6,7]