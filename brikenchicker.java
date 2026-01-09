import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class brikenchicker {

    public static void main(String args[]){
        Scanner Keyboard = new Scanner(in);
    
        out.println("Enter the weight of the person:");

        int weightOfPerson = Keyboard.nextInt();

        int elevatorWeightLimit = 1400;
        int numberOfPeople = elevatorWeightLimit / weightOfPerson;

        boolean allTenOkay = numberOfPeople >=10;
        
        System.out.print(allTenOkay);

        if (allTenOkay == true){
            out.println("You can fit all ten of the");
            out.println("Brickenchicker dectuplets");
            out.println("on the elevator.");
        }
        else{
            out.println("You can't fit all ten of the");
            out.println("Brickenchicker dectuplets");
            out.println("on the elevator");
        }
        

    }
}
