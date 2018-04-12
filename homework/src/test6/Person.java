package test6;

public class Person implements Comparable<Person>{
    int number,age;
    String name;
    Person(int a,String s,int b)
    {
    	this.age=b;
    	this.name=s;
    	this.number=a;
    }
    double getCompareVaue()
    {
         return 0;
    }
    public int compareTo(Person o) {
		if (this.age>o.age) return(-1);
		if (this.age<o.age) return(1);
		if (this.age == o.age)
		{
			if (this.number>o.number) return(1);
			if (this.number<o.number) return(-1);
		}
		return(0);
	}
    public String toString()
    {
    	return number+" "+name+" "+age;
    }
}
