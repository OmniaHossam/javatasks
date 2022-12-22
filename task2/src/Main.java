import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter the radius");
        double radius = input.nextDouble();
        System.out.println("Enter the height");
        double height = input.nextDouble();
        cylinder c1=new cylinder(height,radius);
        System.out.println(c1);
        System.out.println("the Area= "+c1.getArea());



    }
}