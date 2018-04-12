package test6;

import java.io.*;
import java.util.*;

public class Test6 {
	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("T6.txt");
	    StringBuffer buffer =new StringBuffer(); 
     	String line;int l=-1,la=-1,lu=-1;
     	ArrayList<Person> per = new ArrayList<Person>();
     	ArrayList<Staff> sta = new ArrayList<Staff>();
     	ArrayList<Student> stu = new ArrayList<Student>();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(input)); 
    	line = reader.readLine(); 
		while (line != null) { 
		buffer.append(line+"\n"); 	 
		line = reader.readLine(); 
		} 
		input.close(); 
		String ss = buffer.toString();
		//System.out.println(ss);
		String s[] = ss.split("\n");
		for(String s1 :s)
		{
			int ks=1;
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==' ')
				{
					ks++;
				}
			}
			if(ks==4)
			{
				String s2[] = s1.split(" ");
				l++;
				per.add(new Person(Integer.parseInt(s2[0]),s2[1],Integer.parseInt(s2[2])));
				la++;
				sta.add(new Staff(Integer.parseInt(s2[0]),s2[1],Integer.parseInt(s2[2])));
				sta.get(la).Salarys = Double.parseDouble(s2[3]);
				
			}
			if(ks==6)
			{
				String s2[] = s1.split(" ");
				l++;
				per.add(new Person(Integer.parseInt(s2[0]),s2[1],Integer.parseInt(s2[2])));
				lu++;
				stu.add(new Student(Integer.parseInt(s2[0]),s2[1],Integer.parseInt(s2[2])));
				stu.get(lu).get_score(Double.parseDouble(s2[3]), Double.parseDouble(s2[4]), Double.parseDouble(s2[5]));
				
			}
		}
		Collections.sort(per);
		for(int i=0;i<=l ;i++)
		{
			System.out.println(per.get(i));
		}
		System.out.println();
		
		Collections.sort(sta);
		System.out.println("Student:   ");
		for(int i=0;i<=lu ;i++)
		{
			stu.get(i).getCompareVaue();
		}
		Collections.sort(stu);
		for(int i=0;i<=lu ;i++)
		{
			System.out.println(stu.get(i));
		}
		System.out.println();
		System.out.println("Staff:   ");
		for(int i=0;i<=la ;i++)
		{
			sta.get(i).getCompareVaue();
			System.out.println(sta.get(i));
		}
		
	}
	
}
