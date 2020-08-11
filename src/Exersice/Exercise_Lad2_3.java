package Exersice;

import java.nio.channels.Pipe;
import java.util.Scanner;

public class Exercise_Lad2_3 {

    //global variable
    public static final double PI = 3.141;


    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius of circle :");
        double r = scanner.nextDouble();

        double v = ( 4 / 3 ) * PI * r * r * r;

        System.out.println("The capacity of circle is : "+v);



    }//main
}
