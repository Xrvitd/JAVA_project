package test7;

import java.awt.Graphics;

public class Rect extends Graph
{
	int x1,x2,y1,y2;
	Rect(int q,int w,int e,int r)
	{
		x1=q;y1=w;x2=e;y2=r;
		return;
	}
	public void draw(Graphics page) 
	{
		page.drawRect(x1, y1, x2, y2);
	}
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		this.draw(page);
	}
}