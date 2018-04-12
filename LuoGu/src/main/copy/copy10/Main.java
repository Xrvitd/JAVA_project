package main.copy.copy10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	static int n,m,l=0;
	static int[] fa= new int[1000100];
	private static Scanner in;
	static int f(int  x)
	{
		if(fa[x]==x) return x;
		int k= f(fa[x]);
		fa[x]=k;
		return k;
	}
	static class RE implements Comparable<RE>
	{
		int s,t,w;
		RE(int a,int b,int c){
			this.s=a;
			this.t=b;
			this.w=c;
		}
		public int compareTo(RE o) {
			if (this.w>o.w) return(1);
			if (this.w<o.w) return(-1);
			return(0);
		}
	}
	public static void main(String[] args) {
		ArrayList<RE> p = new ArrayList<RE>();
		in = new Scanner(System.in);
		n=in.nextInt();m=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			fa[i]=i;
		}
		for(int i=1;i<=m;i++)
		{
			int q,ww,e;
			q=in.nextInt();ww=in.nextInt();e=in.nextInt();
			p.add(new RE(q,ww,e));
			p.add(new RE(ww,q,e));
		}
		Collections.sort(p);
		int sum=0;
		for(int i=0;i<=m*2-1;i++)
		{
			int x=p.get(i).s,y=p.get(i).t;
			x=f(x);y=f(y);
	        if(x!=y)
	        {
	        	fa[x]=y;
	        	sum+=p.get(i).w;
	        }
		}
		System.out.print(p);
	}
}