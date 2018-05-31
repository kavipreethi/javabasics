package com.basic;

public class Reverse {
	public static void main(String[]args)
	{
		int digit,var =0, num=4321;
		while(num!=0)
		{
		 digit = num%10;
		     var=var*10+digit;
		     num=num/10;
		}
		System.out.println(var);
		     
		     
		 
		 
		
		
	}

}
