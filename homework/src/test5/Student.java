package test5;

public class Student implements Comparable<Student>{
    int stuNum;
    String stuName;
    int  creditScoreTotal=0;
    String[] kec = new String[100];
    double creditTotal[]= new double[100],GPA;
    Student(int a,String s)
    {
    	stuNum = a;
    	stuName = s;
    }
    void add(String s1)
    {
    	creditScoreTotal++;
    	kec[creditScoreTotal]=s1;
    	//creditTotal[creditScoreTotal] = c;
    }
    void ad(double c,int i)
    {
    	creditTotal[i] = c;
    }
    void suan()
    {
    	double sum=0;
    	for(int i=1;i<=creditScoreTotal;i++)
    	{
    		sum+=creditTotal[i];
    	}
    	GPA = sum / creditScoreTotal;
    }
    public int compareTo(Student o) {
		if (this.GPA>o.GPA) return(-1);
		if (this.GPA<o.GPA) return(1);
		return(0);
	}

}
