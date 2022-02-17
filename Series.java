import java.util.*;
public class Series
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        if(q<=500 && q>=0)
        doOperate(q);
    }
    
    public static void doOperate( int q)//This method is to operate according to the given queries' parameters.
    {
        //Taking the queries which contain the parameters.
        Scanner sc=new Scanner(System.in);
        String array[]=new String[q];//Defining the size of the array based on the number of queries.
        for(int i=0;i<q;i++)
        {
            array[i]=sc.nextLine();
        }
        
        //Doing as asked by the question.
        int i,j,k=0;
        for(i=0;i<q;i++)//This loop will run as many as for the number of queries.
        {
            String s=array[i];
            int index1=s.indexOf(" ");
            int index2=getIndex(s);
            int a=Integer.parseInt(s.substring(0,index1));//Extracting the parameters.
            int b=Integer.parseInt(s.substring(index1+1,index2));//Extracting the parameters.
            int n=Integer.parseInt(s.substring(index2+1));//Extracting the parameters.
            
            for(j=0;j<n;j++)
            {
                int twossum=0;
                for(k=0;k<=j;k++)
                {
                    twossum=twossum+(int)(Math.pow(2,k));
                }
                int finalcalc=twossum*b+a;
                System.out.print(finalcalc+" ");
            }
            System.out.println();
        }
    }
    
    public static int getIndex(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c==' ')
            count=i;
        }
        return count;
    }
}
