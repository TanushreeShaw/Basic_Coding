import java.util.*;
public class Square_Cube {
    
public static double Square_Root(int x)
{
    double sqr=0.0;
    sqr=Math.sqrt(x);
    return sqr;
}

public static double Cube_Root(int x)
{
    double cube=0.0;
    cube=Math.cbrt(x);
    return cube;
}

public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    int a;
    System.out.println("Enter the value of A and B:");
    a=in.nextInt();
    
    System.out.println("Square Root of the number: "+Square_Root(a));
    System.out.println("Cube Root of the number: "+Cube_Root(a));

}
}
