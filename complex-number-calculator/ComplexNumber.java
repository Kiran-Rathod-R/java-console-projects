package projects1;

import java.util.*;

public class complex_number {
    private float real,img;

    complex_number(){
        this.real=0;
        this.img=0;
    }

    complex_number(float r,float i){
        real=r;
        img=i;

    }

    public void display(complex_number c1,complex_number c2){
        System.out.println("The first Complex Number is ("+c1.real+") + ("+c1.img+")i");

        System.out.println("The second Complex NUmber is ("+c2.real+")+("+c2.img+")i");

    }

    public void addition(complex_number c1,complex_number c2){
        float real=c1.real+c2.real;
        float img=c1.img+c2.img;

        System.out.println("The addition of complex number is:"+real+" + "+img+"i");

    }

    public void substrction(complex_number c1,complex_number c2){
        float real=c1.real-c2.real;
        float img=c1.img-c2.img;

        System.out.println("The substraction of commplex number is:"+real+ "+"+img+"i");
    }

    public void multiplication(complex_number c1,complex_number c2){
        float real=(c1.real* c2.real)-(c1.img*c2.img);
        float img=(c1.real*c2.img)+(c1.img*c2.real);

        System.out.println("The Multiplication of complex number is:"+real+"+"+img+"i");
    }

    public void division(complex_number c1,complex_number c2){
        try {


        float real=((c1.real*c2.real)+(c1.img*c2.img))/((c2.real* c2.real)+(c1.img* c1.img));
        float img=((c2.real*c1.img)-(c1.real* c2.img))/((c2.real* c2.real)+(c2.img* c2.img));

        System.out.println("The Multiplication of complex number is:"+real+"+"+img+"i");}

        catch (Exception e){
            System.out.println(e);
        }
    }





    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
float a,b;
        complex_number cal=new complex_number();



            System.out.println("Enter real part of first complex number:");
            a = sc.nextFloat();

            System.out.println("Enter imginary part of first complex number:");
            b = sc.nextFloat();

            complex_number com1 = new complex_number(a, b);


            System.out.println("Enter real part of second complex number:");
            a = sc.nextFloat();

            System.out.println("Enter imginary part of second complex number:");
            b = sc.nextFloat();

            complex_number com2 = new complex_number(a, b);

            while(true){
                System.out.println("\nEnter the your choise of operation:\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Display\n6.Exit");
                int choise= sc.nextByte();




            switch (choise){
                case 1:
                    cal.addition(com1,com2);
                    break;
                case 2: cal.substrction(com1,com2);break;
                case 3:cal.multiplication(com1,com2);break;
                case 4:cal.division(com1,com2);break;
                case 5:cal.display(com1,com2);break;
                case 6:
                    System.out.println("Exiting...");break;
            }




        }


    }


}
