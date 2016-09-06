import java.io.*;
import java.util.*;
public class Reverse
{ 
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
             int i=0;
           String s=new String();
           s=in.nextLine();
          String s1[]=s.split(" ");
        int length=s1.length;
        for(i=length-1;i>=0;i--)
        {
            System.out.print(s1[i]+" ");
        }
        
    }
}
