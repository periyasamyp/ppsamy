import java.io.*;
import java.util.Scanner;

public class target {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int j,y;
		int n=sc.nextInt();
		int a[]=new int[5];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for (int i = 0; i<=a.length; i++) 
		{
			j=1;
			 y=a[i+j];
			if(y==n)
			{
			System.out.println(y);
			}
			j++;
		}
	}
	}

