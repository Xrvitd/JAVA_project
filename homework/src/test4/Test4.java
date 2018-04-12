package test4;

import java.io.File;
import java.util.Scanner;

public class Test4 {
	static void dfs(File ff,int l)
	{
		for(int i=1;i<=l;i++)
		{
			System.out.print("  ");
		}
		System.out.println("<d>"+ff.getName());
		File f1[] = ff.listFiles();
		for(File f : f1)
		{
			if(f.isDirectory())
			{
				dfs(f,l+1);
			}else
			{
				for(int i=1;i<=1+l;i++)
				
					System.out.print("  ");
				
				System.out.println("<f>"+f.getName());
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String s = new String();
		s=in.nextLine();
		File f = new File(s);
	    //print(f);
		//System.out.println(f.getParent());
		dfs(f,0);
	}
	
}
