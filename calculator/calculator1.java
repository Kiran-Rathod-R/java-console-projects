package projects1;

import java.util.Scanner;


public class calculator1 {

    static Scanner sc=new Scanner(System.in);

    public static void result(double result){
        System.out.println("The result is:"+result);
        System.out.println();
    }

    public static void addition(int a,int b){
        long result=a+b;

        result(result);
    }

    public static void subtraction(int a,int b){
        long result=a-b;
        result(result);
    }

    public static void multiplication(int a,int b){
        long result=a*b;
        result(result);
    }

    public static void division(int a,int b) {
        try {
            long result = a / b;
            result(result);
        } catch (ArithmeticException e) {
            System.out.println(e);

        }

    }

    public static void main(String[] args){

        System.out.println("Welcome to the Calculator\n");

        while(true){


            System.out.println("1.addition\n2.Substraction\n3.Multiplication\n4.Division\n5.exit");




            System.out.print("ENTER YOUR CHOISE:");
            byte choice=sc.nextByte();

            if(choice==5){
                System.out.println("Existing....");
                break;

            }

            if(choice>5){
                System.out.println("Invalid Input..");
                break;
            }

            System.out.print("Enter first Number:");
            int num1= sc.nextInt();

            System.out.print("Enter a second Number:");
            int num2=sc.nextInt();

            switch (choice){
                case 1:
                    addition(num1,num2);
                    break;

                case 2:
                    subtraction(num1,num2);
                    break;

                case 3:
                    multiplication(num1,num2);
                    break;

                case 4:
                    division(num1,num2);
                    break;




                default:
                    System.out.println("Something went wrong...");

            }

        }



    }



}
