package main.copy.copy8;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static int p=0;
	public static int n,m,start,tail;
	public static int h[] = new int[1000011],v[] = new int[1000011],next[] = new int[1000011],w[] = new int[1000011],f[] = new int[1000011],q[] = new int[1000011],d[] = new int[1000011];
	public static void add(int a,int b,int c)
	{
		p++;
		w[p]=c;
		next[p]=h[a];
		h[a]=p;
		v[p]=b;
	}
	public static void spfa()
	{
		Arrays.fill(d,2147480000);
		
		int ha=0,ti=1;
		q[1]=start;
		d[start]=0;
		f[start]=1;
		while(ha<=ti)
		{
			ha++;
			int i=q[ha],p=h[i];
			f[i]=0;
			while(p!=0)
			{
				if(d[i]+w[p]<d[v[p]])
				{
					d[v[p]]=d[i]+w[p];
					if(f[v[p]]==0)
					{
						ti++;
						f[v[p]]=1;
						q[ti]=v[p];
					}
				}
				p=next[p];
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n=in.nextInt();m=in.nextInt();start=in.nextInt();tail=in.nextInt();
		for(int i=1;i<=m;i++)
		{
			int qq,ww,e;
			qq=in.nextInt();ww=in.nextInt();e=in.nextInt();
			add(qq,ww,e);
			add(ww,qq,e);
		}
		spfa();
		System.out.print(d[tail]);
	}
}
