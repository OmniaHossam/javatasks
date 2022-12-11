package sheets;

import java.util.*;

public class sheet1 {


    public static void main(String []args) {
        //calculate nCr and nPr for any n,r entered by user
        System.out.println("-- Calculate nCr and nPr --");
        Scanner num=new Scanner(System.in);
        System.out.println("Please Enter n ");
        int n =num.nextInt();
        System.out.println("Please Enter r ");
        int r = num.nextInt();
        int n1=1,r1=1,dif=1;
        //calculate n!
        for(int i=n;i>1;i--)
        {
            n1=n1*i;
        }
        //calculate r!
        for(int i=r;i>0;i--)
        {
            r1*=i;
        }
        //calculate (n-r)!
        for(int i=(n-r);i>0;i--)
        {
            dif*=i;
        }
        int nCr , nPr;
        nCr=n1/(r1*dif);// nCr=n!/(r!*(n-r)!)
        nPr=n1/dif;//nPr=n!/(n-r)!
        System.out.println("the result of nCr is : "+nCr);
        System.out.println("the result of nPr is : "+nPr);
        System.out.println("         ------------------          ");

        //print character  of Ascii code user entered
        System.out.println("Please Enter the Ascii code");
        int asciiNum=num.nextInt();
        System.out.println("the character is : "+(char)asciiNum);//print the character of num







    }



}
