import java.io.*;
import java.util.Scanner;
class prime
{
    public static void main(String a[])
    {
        int count=0;
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        System.out.println("Enter a number:"+num);
        for(int i=2;i<num;i++)
        {
            if(num%2==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("yes it is prime");
        }
        else
    {
        System.out.println("not a prime");
    }    
        
    }
}


