import java.util.Scanner;

public class methodsinjava {
    public static void main(String[] args) {
       
        String message = greetings();
        System.out.println(message);

    }
    static String greetings(){
        String g = "How are you";
        return g;
    }
    static void sum(){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1 = n.nextInt();
        System.out.println("Enter number 2");
        int num2 = n.nextInt();
        int sum  = num1 + num2;
        System.out.println("The sum is:"+ sum);
    }
}
