package sheet3;

import java.util.Locale;
import java.util.Scanner;

public class circle {

    public static void circleCircumference(float r)
    {
        System.out.println("Circumference of circle = "+(2*(float)Math.PI*r));
    }
    public static    void circleArea(float r) {
        System.out.println("Area of circle = "+((float)Math.PI*r * r));
    }
public static void setCircle(){
    System.out.println("Please Enter radius of the circle");
    Scanner input=new Scanner(System.in).useLocale(Locale.US);
    float r=input.nextFloat();
    circleCircumference(r);
    circleArea(r);

}
}