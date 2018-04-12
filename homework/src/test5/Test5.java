package test5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test5 {
    static ArrayList<Student> st = new ArrayList<Student>();
    static int siz=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Map<String ,Integer> map = new HashMap<String,Integer>();
		part1();
		part2();
		part3();
		Collections.sort(st);
		for(int i=0;i<st.size();i++)
		{
			if(!map.containsKey(st.get(i).stuName))
			{
				System.out.println(st.get(i).stuNum+" "+st.get(i).stuName+" "+st.get(i).GPA);
				map.put(st.get(i).stuName, 1);
			}
			//System.out.println(st.get(i).stuNum+" "+st.get(i).stuName+" "+st.get(i).GPA);
		}
	}
	static void part1() throws IOException
	{
		FileInputStream inputstream = new FileInputStream("S1.txt"); 
		FileInputStream inputstream1 = new FileInputStream("C1.txt");
		FileInputStream inputstream2 = new FileInputStream("A1.txt");
		StringBuffer buffer =new StringBuffer(); 
		String line; int k=0,lnum=0,l=0;
		
		BufferedReader bufferreader = new BufferedReader(new InputStreamReader(inputstream)); 
		line = bufferreader.readLine(); 
		while (line != null) { 
		buffer.append(line+" "); 	 
		line = bufferreader.readLine(); 
		} 
		inputstream.close(); 
		String ss= buffer.toString();
		String s[]=ss.split(" ");
		for(String s1 : s)
		{
			k++;
			if(k%2==1)
			{
				lnum=Integer.parseInt(s1);
			}else
			{
				st.add(new Student(lnum, s1));
				siz++;
			}
			//System.out.println(s1);
		}
		buffer.delete(0,buffer.length());
		bufferreader = new BufferedReader(new InputStreamReader(inputstream1)); 
		line = bufferreader.readLine(); 
		while (line != null) { 
		buffer.append(line+"\n"); 
		line = bufferreader.readLine(); 
		} 
		inputstream.close(); 
		 ss= buffer.toString();
	     s=ss.split("\n");
	     l=-1;
		for(String s1 : s)
		{
			l++;
			String s2[] = s1.split(" ");
			for(String s3 : s2)
			{
				st.get(l).add(s3);
			}
		}
		buffer.delete(0,buffer.length());
		bufferreader = new BufferedReader(new InputStreamReader(inputstream2)); 
		line = bufferreader.readLine(); 
		while (line != null) { 
		buffer.append(line+"\n"); 
		line = bufferreader.readLine(); 
		} 
		inputstream.close(); 
		 ss= buffer.toString();
	     s=ss.split("\n");
	     l=-1;
		for(String s1 : s)
		{
			l++;
			String s2[] = s1.split(" ");
		    k=0;
			for(String s3 : s2)
			{
				k++;
				st.get(l).ad((double)Integer.parseInt(s3),k);
			}
		}  
		/*for(int i=0;i<st.size();i++)
		{
			System.out.println(st.get(i).stuNum+" "+st.get(i).stuName);
			for(int j=1;j<=st.get(i).creditScoreTotal;j++)
			{
				System.out.println(st.get(i).kec[j]+": "+st.get(i).creditTotal[j]);
			}
			System.out.println();
		}*/
		for(int i=0;i<st.size();i++)
			
		{
			st.get(i).suan();
			//System.out.println(st.get(i).GPA);
		}
		//Collections.sort(st);
	}
	static void part2() throws IOException
	{
		FileInputStream inputstream = new FileInputStream("S2.txt"); 
		FileInputStream inputstream1 = new FileInputStream("C2.txt");
		FileInputStream inputstream2 = new FileInputStream("A2.txt");
		StringBuffer buffer =new StringBuffer(); 
		String line; int k=0,lnum=0,l=0;
		
		BufferedReader bufferreader = new BufferedReader(new InputStreamReader(inputstream)); 
		line = bufferreader.readLine(); 
		while (line != null) { 
		buffer.append(line+" "); 	 
		line = bufferreader.readLine(); 
		} 
		inputstream.close(); 
		String ss= buffer.toString();
		String s[]=ss.split(" ");
		int lll=st.size()-1;
		l=st.size()-1;
		for(String s1 : s)
		{
			k++;
			if(k%2==1)
			{
				lnum=Integer.parseInt(s1);
			}else
			{
				st.add(new Student(lnum, s1));
			}
			//System.out.println(s1);
		}
		buffer.delete(0,buffer.length());
		bufferreader = new BufferedReader(new InputStreamReader(inputstream1)); 
		line = bufferreader.readLine(); 
		while (line != null) { 
		buffer.append(line+"\n"); 
		line = bufferreader.readLine(); 
		} 
		inputstream.close(); 
		 ss= buffer.toString();
	     s=ss.split("\n");
	    // l=-1;
	     l=lll;
		for(String s1 : s)
		{
			l++;
			String s2[] = s1.split(" ");
			for(String s3 : s2)
			{
				st.get(l).add(s3);
			}
		}
		buffer.delete(0,buffer.length());
		bufferreader = new BufferedReader(new InputStreamReader(inputstream2)); 
		line = bufferreader.readLine(); 
		while (line != null) { 
		buffer.append(line+"\n"); 
		line = bufferreader.readLine(); 
		} 
		inputstream.close(); 
		 ss= buffer.toString();
	     s=ss.split("\n");
	    // l=-1;
	     l=lll;
		for(String s1 : s)
		{
			l++;
			String s2[] = s1.split(" ");
		    k=0;
			for(String s3 : s2)
			{
				k++;
				st.get(l).ad((double)Integer.parseInt(s3),k);
			}
		}  
		/*for(int i=0;i<st.size();i++)
		{
			System.out.println(st.get(i).stuNum+" "+st.get(i).stuName);
			for(int j=1;j<=st.get(i).creditScoreTotal;j++)
			{
				System.out.println(st.get(i).kec[j]+": "+st.get(i).creditTotal[j]);
			}
			System.out.println();
		}*/
		for(int i=0;i<st.size();i++)
			
		{
			st.get(i).suan();
			//System.out.println(st.get(i).GPA);
		}
		
	}
	static void part3() throws IOException
	{
		FileInputStream inputstream = new FileInputStream("S3.txt"); 
		FileInputStream inputstream1 = new FileInputStream("C3.txt");
		FileInputStream inputstream2 = new FileInputStream("A3.txt");
		StringBuffer buffer =new StringBuffer(); 
		String line; int k=0,lnum=0,l=0;
		
		BufferedReader bufferreader = new BufferedReader(new InputStreamReader(inputstream)); 
		line = bufferreader.readLine(); 
		while (line != null) { 
		buffer.append(line+" "); 	 
		line = bufferreader.readLine(); 
		} 
		inputstream.close(); 
		String ss= buffer.toString();
		String s[]=ss.split(" ");
		int lll=st.size()-1;
		l=st.size()-1;
		for(String s1 : s)
		{
			k++;
			if(k%2==1)
			{
				lnum=Integer.parseInt(s1);
			}else
			{
				st.add(new Student(lnum, s1));
			}
			//System.out.println(s1);
		}
		buffer.delete(0,buffer.length());
		bufferreader = new BufferedReader(new InputStreamReader(inputstream1)); 
		line = bufferreader.readLine(); 
		while (line != null) { 
		buffer.append(line+"\n"); 
		line = bufferreader.readLine(); 
		} 
		inputstream.close(); 
		 ss= buffer.toString();
	     s=ss.split("\n");
	     l=lll;
		for(String s1 : s)
		{
			l++;
			String s2[] = s1.split(" ");
			for(String s3 : s2)
			{
				st.get(l).add(s3);
			}
		}
		buffer.delete(0,buffer.length());
		bufferreader = new BufferedReader(new InputStreamReader(inputstream2)); 
		line = bufferreader.readLine(); 
		while (line != null) { 
		buffer.append(line+"\n"); 
		line = bufferreader.readLine(); 
		} 
		inputstream.close(); 
		 ss= buffer.toString();
	     s=ss.split("\n");
	     l=lll;
		for(String s1 : s)
		{
			l++;
			String s2[] = s1.split(" ");
		    k=0;
			for(String s3 : s2)
			{
				k++;
				st.get(l).ad((double)Integer.parseInt(s3),k);
			}
		}  
		/*for(int i=0;i<st.size();i++)
		{
			System.out.println(st.get(i).stuNum+" "+st.get(i).stuName);
			for(int j=1;j<=st.get(i).creditScoreTotal;j++)
			{
				System.out.println(st.get(i).kec[j]+": "+st.get(i).creditTotal[j]);
			}
			System.out.println();
		}*/
		for(int i=0;i<st.size();i++)
			
		{
			st.get(i).suan();
			//System.out.println(st.get(i).GPA);
		}
		//Collections.sort(st);
	}
}
