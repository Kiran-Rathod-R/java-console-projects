package projects1;

import java.util.Scanner;

public class PERCENTAGE_CALCULATOR {
    public static void main(String[] args){


        Scanner sc=new Scanner(System.in);



        System.out.println("enter your subjects marks");

        System.out.print("ENETR MARKS OF SUBJECT 1:");
        short mark1=sc.nextByte();

        System.out.print("ENTER MARKS OF SUBJECT 2:");
        short mark2=sc.nextByte();

        System.out.print("ENTER MARKS OF SUBJECT 3:");
        short mark3=sc.nextByte();

        System.out.print("ENTER MARKS OF SUBJECT 4:");
        short mark4=sc.nextByte();

        System.out.print("ENTER MARKS OF SUBJECT 5:");
        short mark5=sc.nextByte();


        float percentage=(mark1+mark2+mark3+mark4+mark5)/5;

        System.out.println("THE PERCENTAGE IS:"+percentage);
    }
}
