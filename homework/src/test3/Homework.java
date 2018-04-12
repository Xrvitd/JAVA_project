package test3;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner in = new Scanner(System.in);
    int n,sum=0,week,qqw=0;
    boolean v=false;
    n=in.nextInt();
    if(n<=12)
    {
    	qqw=n;
    	n=2017;
    	v=true;
    	
    }
    for(int i=1970;i<n;i++)
    {
    	if((i%4==0&&i%100!=0)||i%400==0)
    	{
    		sum+=366;
    	}else
    		sum+=365;
    }
    week=sum+4;
    week%=7;
    if(week==0) week=7;
    //System.out.println(week);
    if(v==false)
    System.out.println("                                 "+n+"              ");
    //System.out.println(" 一       二       三      四      五      六      日           一       二       三      四      五      六      日          一       二       三      四      五      六      日");
    int a[][] = new int[200][100];
    int w[]= new int[13];
    int mm[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
    w[1]=week;
    w[2]=w[1]+mm[1];
	w[2]=w[2]%7;
	if(w[2]==0) w[2]=7;
    if((n%4==0&&n%100!=0)||n%400==0)
    {
    	w[3]=w[2]+mm[2]+1;
    	w[3]=w[3]%7;
    	if(w[3]==0) w[3]=7;
    }
    else
    {
    	w[3]=w[2]+mm[2];
    	w[3]=w[3]%7;
    	if(w[3]==0) w[3]=7;
    }
    for(int i=4;i<=12;i++)
    {
    	w[i]=(w[i-1]+mm[i-1])%7;
    	if(w[i]==0) w[i]=7;
    }
    /*for(int i=1;i<=4;i++)
    {
    	for(int j=1;j<=3;j++)
    	{
    		for(int k=w[j];;k++)
    		{
    			if(k==7&&j==1) break;
    			if(k==16&&j==2) break;
    			if(k==25&&j==3) break;
    		}
    	}
    }*/
    for(int i=1;i<=3;i++)
    {
    	int dd=1;
    	q:for(int j=1;j<=6;j++)
    	{
    		for(int k=1;k<=7;k++)
    		{
    			if(j==1)
    			{
    				if(k<w[i])
    				{
    					a[j][k+(i-1)*7]=0;
    					continue;
    				}else
    				{
    					a[j][k+(i-1)*7]=dd;
    					dd++;
    				}
    			}
    			else
    			{
    				a[j][k+(i-1)*7]=dd;
    				dd++;
    				if(dd>mm[i]&&i!=2)
					{
						break q;
					}
					if((n%4==0&&n%100!=0)||n%400==0)
					{
						if(i==2&&dd>29)
							break q;
					}else
					{
						if(i==2&&dd>28)
						{
							break q;
						}
					}
    			}
    		}
    	}
    }
    for(int i=1;i<=3;i++)
    {
    	int dd=1;
    	q:for(int j=1;j<=6;j++)
    	{
    		for(int k=1;k<=7;k++)
    		{
    			if(j==1)
    			{
    				if(k<w[i+3])
    				{
    					a[j+6][k+(i-1)*7]=0;
    					continue;
    				}else
    				{
    					a[j+6][k+(i-1)*7]=dd;
    					dd++;
    				}
    			}
    			else
    			{
    				a[j+6][k+(i-1)*7]=dd;
    				dd++;
    				if(dd>mm[i+3])
					{
						break q;
					}
    			}
    		}
    	}
    }
    for(int i=1;i<=3;i++)
    {
    	int dd=1;
    	q:for(int j=1;j<=6;j++)
    	{
    		for(int k=1;k<=7;k++)
    		{
    			if(j==1)
    			{
    				if(k<w[i+6])
    				{
    					a[j+12][k+(i-1)*7]=0;
    					continue;
    				}else
    				{
    					a[j+12][k+(i-1)*7]=dd;
    					dd++;
    				}
    			}
    			else
    			{
    				a[j+12][k+(i-1)*7]=dd;
    				dd++;
    				if(dd>mm[i+6])
					{
						break q;
					}
    			}
    		}
    	}
    }
    for(int i=1;i<=3;i++)
    {
    	int dd=1;
    	q:for(int j=1;j<=6;j++)
    	{
    		for(int k=1;k<=7;k++)
    		{
    			if(j==1)
    			{
    				if(k<w[i+9])
    				{
    					a[j+18][k+(i-1)*7]=0;
    					continue;
    				}else
    				{
    					a[j+18][k+(i-1)*7]=dd;
    					dd++;
    				}
    			}
    			else
    			{
    				a[j+18][k+(i-1)*7]=dd;
    				dd++;
    				if(dd>mm[i+9])
					{
						break q;
					}
    			}
    		}
    	}
    }
    if(v==true)
    {
    	System.out.println(" 一       二       三      四      五      六      日      ");
    	int ww,e;
    	ww=qqw%3;
    	if(ww==0) ww=3;
    	e=qqw/3;
    	if(qqw%3==0) e-=1;
    	ww=(ww-1)*7+1;
    	e=e*6+1;
    	for(int i=e;i<e+6;i++)
    	{
    		for(int j=ww;j<ww+7;j++)
    		{
    			
        		if(a[i][j]==0)
        		{
        			System.out.print("   ");
        			continue;
        		}
        		if(a[i][j]<10)
        			System.out.print(" ");
        		System.out.print(a[i][j]+" ");
    		}
    		System.out.println();
    	}
    }else
    {
    	for(int i=1;i<=24;i++)
        {
        	if(i%6==1)
        	{
        		System.out.println(" 一       二       三      四      五      六      日           一       二       三      四      五      六      日          一       二       三      四      五      六      日");
        	}
        	for(int j=1;j<=31;j++)
        	{
        		if(j==8||j==15)
        			System.out.print("  ");
        		if(a[i][j]==0)
        		{
        			System.out.print("   ");
        			continue;
        		}
        		if(a[i][j]<10)
        			System.out.print(" ");
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        	//System.out.print(w[i]+" ");
        }
    }
    
    
    
	}

}
