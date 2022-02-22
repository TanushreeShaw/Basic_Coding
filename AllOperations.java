/*
Write a program to accept two integers and perform all the following operations on them-:
Addition
Subtraction
Multiplication
Division
Modulus
Power
Square Root
*/

import java.util.*;
public class AllOperations 
{
    
public static int Addition(int x, int y)
{
    int sum=0;
    sum=x+y;
    return sum;
}

public static int Subtraction(int x, int y)
{
    int sub=0;
    if(x>y)
        sub=x-y;
    else
        sub=y-x;
    return sub;
}

public static int Multiplication(int x, int y)
{
    int mul=0;
    mul=x*y;
    return mul;
}

public static int Division(int x, int y)
{
    int div=0;
    div=x/y;
    return div;
}

public static int Modulus(int x, int y)
{
    int mod=0;
    mod=x%y;
    return mod;
}

public static double Power(int x, int y)
{
    double power=0.0;
    power=Math.pow(x,y);
    return power;
}

public static double Square_Root(int x)
{
    double sqr=0.0;
    sqr=Math.sqrt(x);
    return sqr;
}

public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    int a,b;
    System.out.println("Enter the value of A and B:");
    a=in.nextInt();
    b=in.nextInt();
    System.out.println("Adddition of two numbers:"+Addition(a, b));
    System.out.println("Subtraction of two numbers:"+Subtraction(a, b));
    System.out.println("Multiplication of two numbers:"+Multiplication(a, b));
    System.out.println("Division of two numbers:"+Division(a, b));
    System.out.println("Modulus of two numbers:"+Modulus(a, b));
    System.out.println("Power of two numbers:"+Power(a, b));
    System.out.println("Square Root of two numbers:"+Square_Root(a));
}
}
