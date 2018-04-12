package test1;

public class Su {
	
	public Su()
	{
		
	}
	public boolean pan(int x)
	{
		if(x==2) return true;
		for(int i=2;i<=Math.sqrt(x)+1;i++)
		{
			if(x%i==0)
				return false;
		}
		return true;
	}

}
