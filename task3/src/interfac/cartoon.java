package interfac;

import java.util.Locale;
import java.util.Scanner;

public class cartoon extends boo {
    cartoon(){
    }
    cartoon(float price){
        super(price);
    }

    @Override
    public float getPrice() {
        return super.getPrice()*2;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Enter the price of product");
        float productPrice= input.nextFloat();
        cartoon c=new cartoon(productPrice);
        System.out.println(c.getPrice());



    }
}
