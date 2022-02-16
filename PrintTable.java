import java.util.*;
public class PrintTable
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=2 && n<=20)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println(n+" x "+i+" = "+(n*i));
            }
        }
    }
}
