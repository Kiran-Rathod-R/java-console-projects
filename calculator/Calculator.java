package projects1;

import java.util.Scanner;


public class calculator {
    static Scanner sc2=new Scanner(System.in);


    static void result(double result){
        System.out.printf("THE RESULT IS:"+result);
    }

    static void addition(){
        System.out.print("ENTER A FIRST NUMBER:");
        double num1=sc2.nextDouble();
        System.out.print("ENTER A SECOND NUMBER:");
        double num2=sc2.nextDouble();

        double result=num1+num2;

        result(result);

    }

    static void subtraction(){
        System.out.print("ENTER A FIRST NUMBER:");
        double num1=sc2.nextDouble();
        System.out.print("ENTER A SECOND NUMBER:");
        double num2=sc2.nextDouble();

        double result=num1-num2;

result(result);
    }

    static void multiplication(){
        System.out.print("ENTER A FIRST NUMBER:");
        long num1= sc2.nextLong();
        System.out.print("ENTER A SECOND NUMBER:");
        long num2= sc2.nextLong();

        long result=num1*num2;
result(result);


    }

    static void division(){
        System.out.print("ENTER A FIRST NUMBER:");
        long num1= sc2.nextLong();
        System.out.print("ENTER A SECOND NUMBER:");
        long num2= sc2.nextLong();

        long result=num1/num2;


result(result);
    }

    static void modules(){
        System.out.print("ENTER A FIRST NUMBER:");

        int num1= sc2.nextInt();

        System.out.print("ENTER A SECOND NUMBER:");

        int num2= sc2.nextInt();

        int result=num1%num2;
result(result);


    }


        public static void main(String args[]){

            System.out.println("WELCOME ! TO THE CALCULATOR\nHOW MAY I HELP YOU");

            while(true) {

                System.out.println("1.ADDITION\n2.SUBSTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.MODULE");

                Scanner sc = new Scanner(System.in);

                System.out.print("ENTER YOU CHOICE:");
                int choice = sc.nextByte();

                switch (choice) {
                    case 1:
                        addition();
                        break;

                    case 2:
                        subtraction();
                        break;

                    case 3:
                        multiplication();
                        break;

                    case 4:
                        division();
                        break;

                    case 5:
                        modules();
                        break;

                    default:
                        System.out.println("something went wrong...");
                }
            }

        }

}
