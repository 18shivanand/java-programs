import java.util.*;
import java.util.Scanner;

public class Prog1
{
    int real, imaginary;

    Complex()                                //default constructor
    {
        real = 0;
        imaginary = 0;
    }

    Complex(int x, int y)                   //parameterised constructor
    {
        real = x;
        imaginary = y;
    }

    Complex addition(Complex a, Complex b)     //function to add two complex nos
    {
        Complex result = new Complex();
        result.real = a.real + b.real;
        result.imaginary = a.imaginary + b.imaginary;
        return result;
    }

    Complex subtraction(Complex a, Complex b)   //function to subtract two complex nos
    {
        Complex result = new Complex();
        result.real = a.real - b.real;
        result.imaginary = a.imaginary - b.imaginary;
        return result;
    }

    void display()                             //function to display complex no
    {
        System.out.println(real+"+ i"+imaginary);
    }

    public static void main(String args[])
    {
        Complex a = new Complex();
        Complex b = new Complex();
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Enter the real and imaginary part of the first complex number:");
        x = sc.nextInt();
        y = sc.nextInt();
        a = new Complex(x,y);
        System.out.println("Enter the real and imaginary part of the second complex number:");
        x = sc.nextInt();
        y = sc.nextInt();
        b = new Complex(x,y);
        Complex res = new Complex();
        Complex add = res.addition(a,b);
        Complex sub = res.subtraction(a,b);
        System.out.println("Sum of complex numbers is: ");
        add.display();
        System.out.println("Difference of complex numbers is: ");
        sub.display();
        sc.close();


    }

}
