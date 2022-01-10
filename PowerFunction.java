import java.util.*;
public class PowerFunction
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int base,exp;
        double value;
        System.out.println("Enter the value of Base:");
        base=in.nextInt();
        System.out.println("Enter the value of Exponent:");
        exp=in.nextInt();

        value=Math.pow(base,exp);
        System.out.println("Value of "+base+" raised to the power "+exp+" is: "+((int)value));

    }
}