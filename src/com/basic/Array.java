package com.basic;

public class Array {
	public static void main(String[]args)
	{
	
	int array[] = new int[10 ];
	int i=0,digit,var=0,num=4321;
	while(num!=0)
	{
	 digit = num%10;
	 array[i]=digit;
	 i++;
	     //var=var*10+digit;
	     num=num/10; 
	}
	
	     for(i=0;i<10;i++)
	
System.out.println(array[i]);   
	}
	
	}
