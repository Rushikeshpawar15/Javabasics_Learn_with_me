import java.util.Scanner;

public class fibonacciseries {
    
    static void fibonacci(int n){
        
        int n1 =0,n2 =1;

        for(int i=0;i<n;i++){

            System.out.println(n +" ");

            int n3 =n2+n1;
            n2=n1;
            n3=n2;

        }
    }
    public static void main(String args[]){
        int n = 10;

        fibonacci(n);
    }
}