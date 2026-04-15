package projects1;

import java.util.Scanner;

public class to_do_task {

    Scanner sc = new Scanner(System.in);
    String task;
    boolean is_done = false;


    to_do_task(String task) {
        this.task = task;
        this.is_done = false;

    }

    void is_done() {
        is_done = true;
    }

    to_do_task[] new_task = new to_do_task[5];

     byte no_task = 0;

    void insert_task() {

        if (no_task > 5) {
            System.out.println("the list is full");
        } else {
            System.out.println("Enter your task:");
            String task = sc.nextLine();
            new_task[no_task] = new to_do_task(task);

            no_task++;
            System.out.println("task added successfully!");


        }
    }

    void remove_task() {
        System.out.println("enter the index of task you want to remove");
        byte index = sc.nextByte();

        if (index <= no_task && index > 0) {
            new_task[index - 1].is_done();
        } else {
            throw new RuntimeException("enter valid index");
        }

        System.out.println("task marked as done");


    }


    void display() {
        if (no_task == 0) {
            System.out.println("there is no task");
            return;
        } else {

            for (int i = 0; i < no_task; i++) {

                String status=new_task[i].is_done?"done":"pending";

                System.out.printf("index: %d task:%s status:%S \n", i + 1, new_task[i].task,status);
            }
            System.out.println();

        }


    }




        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            to_do_task td = new to_do_task("");

            System.out.println("WELCOME TO THE TASK MANAGER");

            boolean loop =false;



            while (!loop) {

                System.out.println("1.INSERT TASK \n 2.REMOVE TASK \n 3.DISPLAY TASK \n 4.EXIT");

                System.out.print("ENTER YOUR CHOOSE:");
                byte choice = sc.nextByte();

                switch (choice) {
                    case 1:
                        td.insert_task();
                        break;

                    case 2:
                        td.remove_task();
                        break;

                    case 3:
                        td.display();
                        break;

                    case 4:
                        loop = true;
                        System.out.println("thank you");


                }


            }
        }
    }


