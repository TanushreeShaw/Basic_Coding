import java.util.*;
public class PowerNonFunction 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int base,exp,i,f=1;
        int value=0;
        System.out.println("Enter the value of Base:");
        base=in.nextInt();
        System.out.println("Enter the value of Exponent:");
        exp=in.nextInt();

        for(i=1;i<=exp;i++)
        {
            f=f*base;
            value=f;
        }
        System.out.println("Value of "+base+" raised to the power "+exp+" is: "+value);

    }
}