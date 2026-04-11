package projects1;

import java.util.*;







public class number_guess_game {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO THE NUMBER GAUSSING GAME \n YOU HAVE TO GUESS A CORRECT NUMBER");


        Random rd=new Random();
        int guess= rd.nextInt(1,10);


//        System.out.println("choise the difficulty:");
//        System.out.println("1.easy\n2.moderate\n3.hard");
//        int diff=sc.nextByte();


        int attempt=0;
        boolean guessed=false;


        while(attempt<5){


            try{attempt++;

           System.out.println("ENTER A NUMBER:");
           int num = sc.nextInt();

               if (num < 1 || num > 9){
                   throw new IllegalArgumentException("enter a valid number");

               }




                           if (guess == num) {
                               System.out.println("your guess is correct!");
                               guessed=true;
                               break;
                           } else if (guess > num) {
                               System.out.println("too small");
                           } else{
                               System.out.println("too big");
                           }


                       }catch (InputMismatchException e){
                           System.out.println("⚠️ Invalid input type! Please enter a number.");
                sc.next();
                       }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


                   }


        if(!guessed){
            System.out.println("the correct answer is "+guess);
        }


        System.out.println("thanks for playing");






sc.close();
    }
}
