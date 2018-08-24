import java.util.*;
class g12
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0)
        {
            System.out.print("Even");
        }
        else if(a<0)
        {
            System.out.print("Invalid");
        }
        else
        {
            System.out.print("Odd");
        }
    }
}
