import java.util.Scanner;
public class sparcematrix
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter array elements");
    int a[][] = new int[3][3];
    int zero = 0;
    int others = 0;
    for(int i = 0; i<3;i++)
    {
            for(int j = 0; j<3;j++)
        {
                a[i][j] = sc.nextInt();
        }
    }
    
    for(int i = 0; i<3;i++)
    {
        for(int j = 0; j<3;j++)
        {
            if(a[i][j] == 0)
            {
                zero++;
            }
            else
            {
                others++;
            }
        }
    }
    System.out.println("array in matrix form  =  ");
    for(int i = 0; i<3;i++)
    {
            for(int j = 0; j<3;j++)
        {
               System.out.print(a[i][j] + " "); 
        }
        System.out.println(); 
    }
    if(zero> others)
    {
        System.out.println("It is a sparce matrix");
    }
    else
    {
        System.out.println("It is not a sparce matrix");
    }
    }
}