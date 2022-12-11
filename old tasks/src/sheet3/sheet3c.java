package sheet3;

import java.util.Locale;
import java.util.Scanner;
public class sheet3c {
    public static void main(String [] args){
        // remove all commas from input string
        // calculate the circumference and area of circle and triangle
        Scanner input=new Scanner(System.in).useLocale(Locale.US);
        System.out.println("please enter your words");
        String old=input.nextLine();
        System.out.println("the sentences with out commas : ");
        // using replace method for string to remove all commas in the string
        System.out.println(old.replace(",",""));
        System.out.println("         ------------------          ");

        // the circumference and area of tasks.circle and tasks.triangle
        System.out.println("calculations of the circle");
        circle.setCircle(); //print the area and circumference of tasks.circle
        System.out.println("calculations of the triangle");
        triangle.setTriangle();











    }
}
