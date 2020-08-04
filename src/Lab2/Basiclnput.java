package Lab2;

import java.util.Scanner;

public class Basiclnput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name;
        System.out.println("What is your name? : ");
        name = scanner.nextLine();
        System.out.println("Your name is"+name);



        System.out.println("What is your major : ");
        String major = scanner.nextLine();
        System.out.println("Your major is"+major);


        System.out.println("What is your email : ");
        String email = scanner.nextLine();
        System.out.println("Your email is"+email);


        System.out.println("How old are you: ");
        String old = scanner.nextLine();
        System.out.println("I am old"+old);









    }//main
}
