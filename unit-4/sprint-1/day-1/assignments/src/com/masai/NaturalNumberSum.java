package com.masai;

public class NaturalNumberSum{
	
	
	public static void sumOfNaturalNumbers(int x) // method definitions
	{
		int sum =0;
		for(int i=1;i<=x;i++)
		{
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
		
		 sumOfNaturalNumbers(5); // method calling
		
		 
	}
	
}
