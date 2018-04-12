package test6;

public class Student extends Personl implements Comparable<Student>{
	Student(int a, String s, int b) {
		super(a, s, b);
		// TODO Auto-generated constructor stub
	}
	double englishScore,mathScore,programScore,GPA;
    double getCompareVaue()
    {
    	double x= (double)(englishScore*6+mathScore*5+programScore*4)/ 15.0;
    	GPA = x;
    	 return x;
    }
    void get_score(double a,double b,double c)
    {
    	englishScore=a;mathScore=b;programScore=c;
    }
    
    public String toString()
    {
    	return this.number+" "+this.name+" "+this.age+" "+this.GPA;
    }
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.GPA>o.GPA) return(-1);
		if (this.GPA<o.GPA) return(1);
    	return 0;
	
	}
	
}
