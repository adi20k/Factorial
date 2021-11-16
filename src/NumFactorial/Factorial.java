package NumFactorial;

import java.util.Scanner;

public class Factorial {
	
	static int FactorialLoop (int number) {
		 int fact=1;
		 for(int i=1;i<=number;i++){    
		      fact=fact*i;    
		  } 
		 return fact;
	}
	static int FactorialRecursion (int number) {

		  if (number == 0)  
		    return 1;  
		  else  
		    return(number * FactorialRecursion(number-1)); 
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Factorial Using Loop "+FactorialLoop(num));
		
		System.out.println("Factorial Using Recursion "+FactorialRecursion(num));
		
	}

}
