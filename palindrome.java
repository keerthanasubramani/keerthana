import java.io.*;
import java.util.Scanner;
public class palindrome
{
    public static void main(String a[])
    {
        int rev=0,rem,temp;
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        temp=num;
        while(num>0)
        {
           rem=num%10;
           rev=rev*10+rem;
           num=num/10;
        }
        if(temp==rev)
        {
            System.out.println("palindrome:"+rev);
        }
        else
        {
            System.out.println("not a palindrome");
        }
        
        
    }
    }





