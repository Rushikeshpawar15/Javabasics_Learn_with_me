import java.util.Scanner;

public class circum {
    public static void main(String[] args) {
    
        double pie = 3.14;
        System.out.println("Enter the radius of circle");
        Scanner n = new Scanner(System.in);
        float r = n.nextInt();
        double area_of_circle = areaCircle(r, pie);
        System.out.println("area of circle is:" + area_of_circle);
        double circumference_of_circle = circum(r, pie);
        System.out.println("circumference of circle:" + circumference_of_circle);

    }   
    static double areaCircle(float r,double pie){
        double area = pie * r * r;
        return area;
    } 
    static double circum(float r,double pie){
        double circumference = 2 * pie * r;
        return circumference;
    }
}
