import java.io.*;
import java.util.*;
class amstrg
{
    public static void main(String ar[])
    {
        int sum=0,n=0,temp=1;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        temp=a;
        for(int i=0;i<=100000;i++)
        {
            n=a%10;
            sum=sum+(n*n*n);
            a=a/10;
        }
        if(temp==sum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}



