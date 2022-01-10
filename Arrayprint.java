import java.util.*;
public class Arrayprint 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the Size of the Array:");
        n=in.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the values in the Array:");
        for(i=0;i<n;i++)
        {
            num[i]=in.nextInt();
        }

        System.out.println("The values in the Array are:");
        for(i=0;i<n;i++)
        {
            System.out.println(num[i]);
        }

    }
    
}