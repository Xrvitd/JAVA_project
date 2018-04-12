package Search;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;


import javax.swing.*;
import javax.swing.event.*;

public class Search {
	public static void bfs(File f,String[] se)
	{
		Queue<File> q=new LinkedList<>();  
		File[] ff = f.listFiles();
		for(File f1 : ff)
		{
			if(f1.isDirectory())
			{
				q.offer(f1);
			}
			else
			{
				boolean v=false;
				for(String sw :se)
				{
					if(f1.getName().indexOf(sw)== -1 )
					{
						v=true;
					}
				}
				if(!v)
				{
					System.out.println(f1.getAbsolutePath());
				}
			}
		}
		while(!q.isEmpty())
		{
			File temp = q.poll();
			File[] templ = temp.listFiles();
			if(templ == null)
				continue;
			for(File fc : templ)
			{
				if(fc.isDirectory())
				{
					q.offer(fc);
				}else
				{
					boolean v=false;
					for(String sw :se)
					{
						if(fc.getName().indexOf(sw)== -1 )
						{
							v=true;
						}
					}
					if(!v)
					{
						System.out.println(fc.getAbsolutePath());
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
	    String s = new String("C:\\"),ss= new String("txt");
	    String sq[] = ss.split(" ");
	    //s=in.nextLine();
	   // ss=in.nextLine();
	    File f = new File(s);
	    bfs(f,sq);
	    //System.out.println(f.toString());
	}
	
}
