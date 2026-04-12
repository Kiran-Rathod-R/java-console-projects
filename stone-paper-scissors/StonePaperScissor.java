package projects1;

import java.util.Scanner;
import java.util.Random;



public class stone_paper_cisor {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        Random rd=new Random();

        System.out.print("1.stone\n2.paper\n3.cisor\n");
        System.out.print("enter your choise:");
        int choise=sc.nextInt();

        int rd1=rd.nextInt(3)+1;
        if(choise==rd1){
            System.out.printf("my choise is %d and your is %d\n",rd1,choise);
            System.out.println("the game is drawn......");

        } else if (choise!=rd1){
            System.out.printf("my choise is %d and your is %d\n",rd1,choise);
            if(choise==1 && rd1==2){
                System.out.printf("my choise is %d and your is %d\n",rd1,choise);
                System.out.println("I won the game......");
            } else if (choise==1 && rd1==3) {
                System.out.printf("my choise is %d and your is %d\n",rd1,choise);
                System.out.println("you won the game......");

            } else if (choise==2 && rd1==1) { System.out.printf("my choise is %d and your is %d\n",rd1,choise);
                System.out.println("you won the game.....");

            } else if (choise==2&&rd1==3) { System.out.printf("my choise is %d and your is %d\n",rd1,choise);
                System.out.println("i won the game......");

            } else if (choise==3 && rd1==1) { System.out.printf("my choise is %d and your is %d\n",rd1,choise);
                System.out.println("i won the game......");

            } else if (choise==3 && rd1==2) { System.out.printf("my choise is %d and your is %d\n",rd1,choise);
                System.out.println("you won the game......");

            }
        }
    }
}
