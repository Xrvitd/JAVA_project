package test6;

public class Staff extends Personl implements Comparable<Staff>{
	Staff(int a, String s, int b) {
		super(a, s, b);
		// TODO Auto-generated constructor stub
	}
	double Salarys;
    double getCompareVaue()
    {
    	return Salarys;
    }
    public int compareTo(Staff o) {
		if (this.Salarys>o.Salarys) return(-1);
		if (this.Salarys<o.Salarys) return(1);
		return(0);
	}
    public String toString()
    {
    	return this.number+" "+this.name+" "+this.age+" "+this.Salarys;
    }
}
