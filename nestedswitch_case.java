import java.util.Scanner;

public class nestedswitch_case {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt();
        String s1 = n.next();

        int empID = n1;
        String field = s1;

        switch(empID){
            case 1:
                System.out.println("Kunal");
                break;
            case 2:
                System.out.println("Rushi");
                break;
            case 3:
                System.out.println("Prabhu");
                break;
            case 4:
                switch(field){
                    case "IT":
                        System.out.println("From IT Department");
                        break;
                    case "Management":
                        System.out.println("From Management Department"); 
                        break;
                    case "Accounts":
                        System.out.println("From Accounts Department");
                        break;
                    default:
                        System.out.println("Invalid Department Entered");   
                           
                }  
                break;
                default:
                    System.out.println("Invaild empID");         
        }
    }
}
