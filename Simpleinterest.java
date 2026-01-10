import java.util.Scanner;

public class Simpleinterest {
    public static void main(String[] args) {
        int p;
        float r;
        int t;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principle amount:");
        p = in.nextInt();
        System.out.println("Enter the rate of interest:");
        r = in.nextFloat();
        System.out.println("Enter the total time period in years:");
        t = in.nextInt();

        float s = si_calculate(p,r,t);
        System.out.println("The simple interest is :" + s);

        
    }


    static float si_calculate(int p,float r,int t){
        float si = (p * r * t)/100;
        return si;
    }
}
