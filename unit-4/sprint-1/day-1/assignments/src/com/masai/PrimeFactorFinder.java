package com.masai;

public class PrimeFactorFinder {
	
	
	  public static void findPrimeFactorsOfNumber(int number)
	  {
		   
		   if(number>=2&&number<=100)
		   {
			   
			   for(int i=1;i<=number;i++)
			   {
				   if(number%i==0)
				   {
					   System.out.println(i);
				   }
			   }
			     
			   
		   }
		   else
		   {
			   System.out.println("Invalid Number");
		   }
		  
	  }
	  
	  public static void main(String[] args) {
		  
		  
		   findPrimeFactorsOfNumber(60);
	}

}
