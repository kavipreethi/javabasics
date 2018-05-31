package com.basic;

public class Rectangle {
	float length;
	float width;
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		if(length<0.0)
		{
		this.length = 0;
	}
		else
		{
			this.length=length;
		}
		}
	
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		if(width>20.0)
		{
			this.width=20;
		}
		else
		{
		this.width = width;
	}
	
	}
	public float getperimeter()
	{
	 return 2*(length+width);
	}
	public float getarea()
	{
		return length*width;
	}
	public static void main(String[]args)
	{
		Rectangle r1 = new Rectangle();
		r1.setLength(1);
		r1.setWidth(1);
		
		//System.out.println(r1.getlength);
		//System.out.println(r1.getwidth);
		System.out.println(r1.getperimeter());
		System.out.println(r1.getarea());
		
	}	
	
	}
