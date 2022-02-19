import java.util.*;
class Datatypesdecision
{
    static byte bmin=(byte)(Math.pow(-2,7));
    static byte bmax=(byte)(Math.pow(2,7)-1);
    static short smin=(short)(Math.pow(-2,15));
    static short smax=(short)(Math.pow(2,15)-1);
    static int imin=(int)(Math.pow(-2,31));
    static int imax=(int)(Math.pow(2,31)-1);
    static long lmin=(long)(Math.pow(-2,63));
    static long lmax=(long)(Math.pow(2,31)-1);
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.charAt(0)=='-')
        s=s.substring(1);
        int l=s.length();
        if(l>15)
        {
            System.out.printf("%s%n","n can't be fitted anywhere.");
        }
        else
        getDataType(s);
    }
    public static void getDataType(String s)
    {
        long l=Long.parseLong(s);
        System.out.println("n can be fitted in:");
        if(l>=bmin && l<=bmax)
        {
            System.out.println("* byte");
        }
        if(l>=smin && l<=smax)
        {
            System.out.println("* short");
        }
        if(l>=imin && l<=imax)
        {
            System.out.println("* int");
        }
        if(l>=lmin && l<=lmax)
        {
            System.out.println("* long");
        }
        else
        System.out.printf("%s%n","n can't be fitted anywhere.");
    }
}
