package main.copy;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	static int n,m;
	static int fa[]= new int[200010];
	static int f(int x)
	{
		if(fa[x]==x) return x;
		int k=f(fa[x]);
		fa[x]=k;
		return k;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n=in.nextInt();m=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			fa[i]=i;
		}
		for(int i=1;i<=m;i++)
		{
			int q,w,e;
			q=in.nextInt();w=in.nextInt();e=in.nextInt();
			if(q==1) fa[f(w)]=f(fa[e]);
			if(q==2)
			{
				if(f(w)==f(e))
					System.out.println("Y");
				else
					System.out.println("N");
			}
		}
		
	}
}
