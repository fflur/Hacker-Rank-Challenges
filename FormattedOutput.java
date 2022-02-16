import java.util.*;
class FormattedOutput
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a[]=new String[3];
        int i=0;
        
        //Taking string input from the user.
        for(i=0;i<3;i++)
        {
            a[i]=sc.nextLine();
        }
        
        //Printing the required output.
        System.out.printf("%s%n", "===================================");
        for(i=0;i<3;i++)
        {
            int indexOfSpace=a[i].indexOf(' ');
            String s1=a[i].substring(0, indexOfSpace);    //Storing the part of string which contains the word.
            String s2=a[i].substring(indexOfSpace+1);     //Storing the part of string which contains the number.
            int lengthOfNumber=s2.length();
            if(lengthOfNumber>3 || s1.length()>=11)
            {
                break;
            }
            else if(lengthOfNumber==2)
            {
                System.out.printf("%-15s", s1);
                System.out.printf("0%s%n", s2);
            }
            else if(lengthOfNumber==1)
            {
                System.out.printf("%-15s", s1);
                System.out.printf("00%s%n", s2);
            }
            else if(lengthOfNumber==3)
            {
                System.out.printf("%-15s", s1);
                System.out.printf("%s%n", s2);
            }
        }
        System.out.printf("%s%n", "===================================");
    }
}
