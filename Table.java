import java.util.*;
public class Table
{
    public static void displaytable(int num)
    {
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+(num*i));

        }
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("Enter any number to see its table:");
        num=in.nextInt();
        //Table ob=new Table();
        System.out.println("The table is: ");
        //ob.displaytable(num);
        displaytable(num);
    }
}