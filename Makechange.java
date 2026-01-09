import static java.lang.System.out;

public class Makechange{
public static void main(String args[]){
    int total =248;
    int quarters = total/25;
    int whatsleft = total % 25;

    int dimes =whatsleft /10;
    whatsleft = whatsleft %10;

    int nickels = whatsleft /5;
    whatsleft = whatsleft % 5;

    int cents = whatsleft;

    out.println("From" + total + " cents you get");
    out.println(quarters + " quarters");
    out.println(dimes + "dimes");
    out.println(nickels+"nickels");
    out.println(cents + "cents");
}
}