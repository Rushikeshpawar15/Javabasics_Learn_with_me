import java.util.Scanner;
public class largestnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
   /* 
        if(a>b && a>c){
            System.out.println("a is largest ");
        }else if (b > a && b > c){
            System.out.println("b is the largest number");
        }
        else{
            System.out.println("c is the largest number");
        } */
       int max =a;
       if ( b > max){
        max =b;
        System.out.println("largest is b");
        System.out.println(max);
       }else if(c > max){
        max = c;
        System.out.println("largest is c");
        System.out.println(max);
       }else{
        System.out.println("largest is a");
        System.out.println(max);
       }
    }
    
}
