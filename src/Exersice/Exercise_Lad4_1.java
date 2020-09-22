package Exersice;
import com.sun.corba.se.impl.interceptors.PICurrent;

import java.util.Scanner;

// 1.Triangle = 0.5 * b * h
// 2.Cone = ( PI * r * l ) + ( PI * r * r )
// 3.Circle = 2 * PI * r
public class Exercise_Lad4_1 {
    public static  final  double PI = 3.141;

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       //display
        System.out.println("Please, select options below");
        System.out.println("1. Find area of Triangle  ");
        System.out.println("2. Find area of Cone  ");
        System.out.println("3. Find area of Circle  ");
        System.out.println("4.Exit" );
        System.out.println("Select");
        int select =sc.nextInt();


        //switch-cas
        switch (select){
            case 1:
                System.out.println("Enter base:");
                double b = sc.nextDouble();
                System.out.println("Enter high:");
                double h = sc.nextDouble();
                double area = findArea(b, h);
                System.out.println("The area of Triangle :");
                break;
            case 2:break;
            case 3:break;
            case 4:System.exit(1);break;
            default:System.out.println("Please, select number 1-4.");


        }
    }
    //triangle
    public static double findArea(double b, double h){
        return  0.5 * b * h;
    }
    //Cone
    public static double findAreaCone(double r,double l) {
        return ( PI * r * l ) + ( PI * r * r);
    }
    //Circle
    public static double findAreaCircle(double r) {
        return 2 * PI * r;
    }
}