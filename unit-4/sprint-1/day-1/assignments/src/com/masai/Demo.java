package com.masai;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
           
      System.out.println("enter any number");
      Scanner s = new Scanner(System.in);
      int x = s.nextInt();
      if(x%5==0&&x%3==0)
    	  System.out.println("Hello Welcome");
      else if(x%5==0)
    	  System.out.println("Hello");
      else if(x%3==0)
    	  System.out.println("Welcome");
      else
    	  System.out.println("Invalid Number");
          
	}

}
