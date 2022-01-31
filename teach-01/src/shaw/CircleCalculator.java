package shaw;
import java.util.Scanner;
import java.lang.Math;

public class CircleCalculator {

    public static double getRadius() {
        Scanner input = new Scanner( System.in );
        System.out.println("Enter Radius: ");

        return input.nextDouble();
    }

    public void displayCircumference(double radius){
        double circumference = (2*Math.PI)*radius;

        System.out.printf("The Circumference is: %.2f ", circumference);
    }

    public void displayArea(double radius){
        double area = Math.PI * radius * radius;
        
        System.out.printf("The area is: %.2f%n", area);
    }

}
