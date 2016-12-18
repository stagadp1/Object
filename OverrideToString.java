package com.Object;


class Complex
{
	double num1;
	double num2;
	public Complex(double num1, double num2) 
	{
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public String toString()
	{
		return String.format(num1 + " +i"+ num2);
	}
}
public class OverrideToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Complex complex = new Complex(10,15);
		System.out.println(complex.toString());
	}

	
}
