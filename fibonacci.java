import java.util.*;
public class fibonacci
{
    public static void main(String args[])
    {
        int n1,n2,n3;
        n1=0;
        n2=1;
        System.out.println("Enter the count:");
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        System.out.println("Fibonacci series is:\n"+n1);
        System.out.println(n2);
        for(int i=2;i<=count;i++)
        {
            n3=n2+n1;
            n1=n2;
            n2=n3;
            System.out.println(" "+n3);
        }    
        
    }
}

