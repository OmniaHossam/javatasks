import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter the price of product");
        float productPrice= input.nextFloat();
     product []arr=new product[3];
     arr[0]=new book(productPrice);
     arr[1]=new childrenBook(productPrice);
     arr[2]=new book(productPrice);

        System.out.println("total price = "+(arr[0].getPrice()+arr[1].getPrice()+arr[2].getPrice()));


    }
}