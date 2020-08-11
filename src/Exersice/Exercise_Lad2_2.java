package Exersice;

import java.util.Scanner;

//triangle area = 0.5*base*high

public class Exercise_Lad2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ระบุความยาวของฐานสามเหลี่ยม :");
        double base = scanner.nextDouble();
        System.out.println("ระบุควสมสูงของสามเหลี่ยม:");
        double high = scanner.nextDouble();

        double area =0.5 * base * high;
        System.out.println("พื้นที่สามเหลี่ยม คือ "+area);





    }//main
}