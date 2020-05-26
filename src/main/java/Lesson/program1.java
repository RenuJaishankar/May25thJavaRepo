package Lesson;

import java.util.Scanner;
//This program prints the string.
//The first column contains the String and is left justified using exactly 15 characters.
//The second column contains the integer, expressed in exactly 3 digits;
// if the original number input has less than three digits, it will pad the output's leading digits with zeroes.
public class program1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            System.out.println("Please enter string");
            String s1=sc.next();
            System.out.println("Please enter number");
            int x=sc.nextInt();

            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}

