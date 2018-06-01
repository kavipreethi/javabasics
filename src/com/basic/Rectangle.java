package com.basic;

public class Rectangle {
	float length;
	float width;
	public float getLength(float length,float width) {
	
		if((length>0.0)&&(length<20.0)) {
		
			this.length=length;
		    this.width=width;
		}
		
	 return 2*(length+width);
	}
	public float getarea()
	{
		return length*width;
	}
	public static void main(String[]args)
	{
		Rectangle r1 = new Rectangle();
		r1.setLength(-5);
		r1.setWidth(30);
		
		//System.out.println(r1.getlength);
		//System.out.println(r1.getwidth);
		System.out.println(r1.getperimeter());
		System.out.println(r1.getarea());
		
	}	
	
	}
