package com.basic;

public class Date {
	  int day;
	  int month;
	  int year;
	  public Date(){
		  
	  }
	  public Date(int day,int month,int year)
	  {
		  this.day = day;
		  this.month = month;
		  this.year= year;
		  
	  }
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate()
	{
	System.out.println(day+"/"+month+"/"+year);
	}
	public static void main(String[]args)
	{
		Date date1= new Date();
		date1.setDay(31);
		date1.setMonth(5);
		date1.setYear(2018);
		date1.displayDate();
		
		
	}
	
	

}
