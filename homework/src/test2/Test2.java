package test2;

import java.util.Arrays;
import java.util.Scanner;



public class Test2 {
	public static int n,sum=0,k=1,l=0;
	public static int[] a = new int[1001]; 
	public static int[] b = new int[1001]; 
	public static int[] ld = new int[1001]; 
	public static int[] rd = new int[1001]; 
	public static void dfs(int x)
	{
		if(b[x]==0) return;
		dfs(ld[x]);
		dfs(rd[x]);
		System.out.print(b[x]+",");
		return;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in .nextInt();
		for(int i=1;i<=n;i++)
		{
			a[i] = in .nextInt();
			b[i] = a[i];
			sum+= a[i];
		}
		System.out.println(sum/n);
		Arrays.sort(a,1,n+1);
		for(int i=1;i<=n;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=1;i<=n;i++)
		{
			ld[i]=i*2;
			rd[i]=i*2+1;
		}
		dfs(1);
	}

}
