package inheritance;

import java.util.Locale;
import java.util.Scanner;

public class inheritance {
    public static void main(String [] args){
        System.out.println("Enter the radius of the circle");
        Scanner input=new Scanner(System.in).useLocale(Locale.US);
        float radius= input.nextFloat();
        System.out.println("Enter the height of the cylindrical");
        float height =input.nextFloat();
        cylindrical1 c=new cylindrical1(radius,height);//make object from cylindrical1 class
        System.out.println(c.toStringCir());// print the area of circle
        System.out.println(c.toStringCyl());// print the volume of cylindrical
        System.out.println("------------ Square and cubic area ---------------");
        System.out.println("Enter the length");
        float len = input.nextFloat();
        cubic cubicObject =new cubic(len);// make an object from cubic class
        System.out.println(cubicObject.setSqArea()+"\n"+cubicObject.setCuArea());//print square area + cubic area









    }
}
