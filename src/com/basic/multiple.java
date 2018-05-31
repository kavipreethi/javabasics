package com.basic;

public class multiple {
	public boolean multiple(int one,int two) {
		return two%one==0?true:false;
	}
	public static void main(String[]args)
	{
		multiple m1 =new multiple();
		System.out.println("Is 4 multiple of 2"+m1.multiple(4,2));
	}
	

}