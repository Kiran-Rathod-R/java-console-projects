package projects1;

import java.util.*;

class customer {

    String name;
    int account_no;
    private double balance;


    customer(String n, int acc, double bal) {
        this.account_no = acc;
        this.balance = bal;
        this.name = n;

    }



    public double getBalance() {
        return balance;
    }


    void deposit(double amt) {
        balance += amt;
        System.out.println(amt + "IS DEPOSITED.THE TOTAL AVAILABLE BALANCE IS:" + balance);
    }

    void withdraw(double amt) {
        balance -= amt;
        System.out.println(amt + "IS WITHDRAW.THE TOTAL AVAILABLE BALANCE IS:" + balance);


    }

    void display() {
        System.out.println("NAME OF CUSTOMER IS:" + name + "\nTHE ACCOUNT NUMBER IS:" + account_no + "\nTHE AVAILABLE BALANCE IS:" + balance);
    }

}


class Bank{
        Scanner sc=new Scanner(System.in);
        ArrayList<customer> customers=new ArrayList<>();

        void add_customer(){
            System.out.print("ENTER THE NAME OF CUSTOMER:");
            String name=sc.next();

            System.out.println("ENTER THE ACCOUNT NUMBER OF CUSTOMER:");
            int account_no=sc.nextInt();

            System.out.println("ENTER THE INITIAL BALANCE:");
            double balance=sc.nextDouble();
            customer c=new customer(name,account_no,balance);
            customers.add(c);

            System.out.println("account created successfully");
        }

        void deposit(){

            System.out.println("ENTER YOUR ACCOUNT NUMBER:");
            int acc_no= sc.nextInt();

            for(customer c:customers) {

                if(acc_no==c.account_no){
                System.out.println("ENTER AMOUNT TO DEPOSIT:");
                double amt = sc.nextDouble();
                c.deposit(amt);
                return;
                }



            }
            System.out.println("account not found!Enter valid account number");


        }

        void withdraw(){
            System.out.println("ENTER YOUR ACCOUNT NUMBER:");
            int acc_no=sc.nextInt();

            for(customer c:customers){
                if(acc_no==c.account_no){
                    System.out.println("ENTER AMOUNT YOU WANT TO WITHDRAW:");
                    double amt= sc.nextDouble();

                    if(amt<=c.getBalance()){
                        c.withdraw(amt);

                    }
                    else{
                        System.out.println("INEFFICIENT BALANCE");

                    }

                    return;
                }


            }
            System.out.println("account not found!Enter valid account number");

        }

        void display(){
            System.out.println("ENTER YOUR ACCOUNT NUMBER:");
            int acc_no=sc.nextInt();
            for(customer c:customers) {
                if (acc_no == c.account_no) {

                    c.display();
                    return;
                }



            }
            System.out.println("ENTER VALID ACCOUNT NUMBER");
        }



}






public class Bank_system {
    public static void main(String[] args) {

        Bank bank=new Bank();
        Scanner sc=new Scanner(System.in);


        boolean loop=false;

        while(!loop){

            System.out.println("HOW CAN I HELP YOU");
            System.out.println("1.ADD ACCOUNT\n 2.DEPOSIT AMOUNT \n 3.WITHDRAW AMOUNT \n 4.DISPLAY BALANCE  \n 5.EXIT");
            byte choice= sc.nextByte();

            switch (choice){
                case 1:

                    bank.add_customer();break;

                case 2:
                    bank.deposit();break;

                case 3:
                    bank.withdraw();break;

                case 4:
                    bank.display();break;

                case 5:
                    loop=true;break;



            }

        }

    }
}
