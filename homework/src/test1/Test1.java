package test1;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {						
		Scanner in = new Scanner(System.in);
		int n,p=1,k,l=0;
		n=in.nextInt();
		k=n;
		int[] a = new int[40];
		int[] z = new int[10001];
		while(k>0)
		{
			a[p]=k%2;
			k/=2;
			p++;
		}
		if(n==0) System.out.print(0);
		for(int i=p-1;i>0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("#");
		Su s = new Su();
		k=n;
		if(n==1) 
		{
			System.out.print(1);
			System.exit(0);
		}
		
		for(int i=2;i<=n;i++)
		{
			if(s.pan(i))
			{
				while(k%i==0)
				{
					l++;
					z[l]=i;
					k/=i;
				}
			}
		}
		for(int i=1;i<l;i++)
		{
			System.out.print(z[i]+",");
		}
		System.out.print(z[l]);
	}
	

}
