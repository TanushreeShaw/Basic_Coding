import java.util.*;
public class TwoDArrayprint 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,m,n;
        System.out.println("Enter the Number of Rows of the Array:");
        m=in.nextInt();
        System.out.println("Enter the Number of Columns of the Array:");
        n=in.nextInt();

        int num[][] = new int[m][n];
        System.out.println("Enter the values in the Array:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                num[i][j]=in.nextInt();
            }
            
        }

        System.out.println("The Elements in the 2D Array are:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
              System.out.print((num[i][j])+" ");
            }
        System.out.println();
        }

    }
    
}