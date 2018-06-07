package com.basic;

public class Fah {
	public static double celsius(double f)
    {
    double celsius = 5.0 / 9.0 * ( f - 32 );
    return celsius;
    }
    public static double fahrenheit(double c)
    {
    double fahrenheit = 9.0 / 5.0 * c + 32;
    return fahrenheit;
    }

    public static void main(String[] args)
    {
        System.out.println(Fah.celsius(100));
        System.out.println(Fah.fahrenheit(50));
}


}
