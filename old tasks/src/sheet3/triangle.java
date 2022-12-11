package sheet3;

import java.util.Locale;
import java.util.Scanner;

public class triangle {
    public static void triangleCircumference(float l1,float l2,float l3){
        System.out.println("the circumference of tasks.triangle = "+(l1+l2+l3));
    }
    public static void triangleArea(float base,float height){
        System.out.println("Area of tasks.triangle = "+(.5*base*height));
    }
    public static void setTriangle(){
        Scanner input=new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter first length: ");
        float l1=input.nextFloat();
        System.out.println("Enter second length: ");
        float l2=input.nextFloat();
        System.out.println("Enter third length: ");
        float l3=input.nextFloat();
        triangleCircumference(l1,l2,l3);
        System.out.println("Enter the length of base: ");
        float b=input.nextFloat();
        System.out.println("Enter the height: ");
        float h=input.nextFloat();
        triangleArea(b,h);




    }
}
