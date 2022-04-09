package com.masai;

public class CricketScore {
	
	 public static void calculateCricketScore(int one, int two,int three, int four,int six)
	 {
		     
		     int total = one + two + three + four*4 + six*6;
		     System.out.println("Total Score is : "+total);
	 }
	 
	 public static void main(String[] args) {
		   
		   calculateCricketScore(5, 10, 45, 4, 5);
	}
	 
	 

}
