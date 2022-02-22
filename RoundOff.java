//Write a program to accept a number from the user and round it using the floor() and ceil() methods.
    
import java.util.*;
public class RoundOff 
{
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    double num=0.0;
    do
    {
    System.out.println("Enter the value of num:");
    num=in.nextDouble();
    
    System.out.println("Floor() Operation Result: "+Math.floor(num));
    System.out.println("Ceil() Operation Result: "+Math.ceil(num));
    }
    while(num!=0);
}
}
