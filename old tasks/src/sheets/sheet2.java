package sheets;

import java.util.*;
import java.lang.*;

public class sheet2 {

    public static void main(String [] args) {
        // calculate the largest value of input values of one dimensional array
        // print  transpose of a two-dimensional array that is input from user

        Scanner num = new Scanner(System.in).useLocale(Locale.US);
        // enter double array ={ 23.4, -34.5, 50.0, 33.5, 55.5, 43.7, 5.7, -66.5 } from user and print largest value
        System.out.println("please enter the size of array");
        int n=num.nextInt();
        double[] arr =new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("please enter element "+(i+1));
            arr[i]=num.nextDouble();
        }
        double large=arr[0];
        //calculate the largest element
        for(double element:arr) //for each passing through each element in the array
        { if(large<element)
        {
            large=element;
        }
        }
        System.out.println("the largest value is : "+large);
        System.out.println("-- Matrix transpose --");
        //find transpose of a two-dimensional array that is input from user
        System.out.println("Enter number of rows");
        int rows=num.nextInt();
        System.out.println("Enter number of columns");
        int cols=num.nextInt();
        int [][]firstMatrix=new int[rows][cols];
        System.out.println("Please Enter the elements of matrix");
        for(int i=0;i<rows;i++)
        {
            System.out.println("Enter row num: "+(i+1));
            for(int j=0;j<cols;j++)
            {
                firstMatrix[i][j]=num.nextInt();
            }
        }

         //print of transpose miniproject1.matrix
        System.out.println("Transposed matrix of "+cols+" x "+rows);
        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
                System.out.print(firstMatrix[j][i]+" ");
            System.out.println();
        }




    }



}
