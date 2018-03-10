import java.io.*;
import java.util.*;
class fact
{
    public static void main(String a[])
    {
        int fact=1,i;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(i=1;i<=num;i++)
       {
            fact=fact*i;
        }
           System.out.println(fact);
    }
}






