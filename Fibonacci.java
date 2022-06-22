import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		int[] fibonacciNumers;
		
		Scanner sc=new Scanner(System.in);
		   
	     System.out.println(" please enther the number");
	     num=sc.nextInt();
	     
	       if(num >0)
	       { 
	    	  if(num > 1) {
	    	   fibonacciNumers = new int[num];
	    	   
	    	   fibonacciNumers[0] =0;
	    	   fibonacciNumers[1] = 1;
	    	   
	    	   for (int i =2; i < num; i++)
	    	   {
	    		   fibonacciNumers[i]= fibonacciNumers[i-1]+ fibonacciNumers[i-2];
	    		   
	    	   }
	    	   	    	   
	    	   for(int i :fibonacciNumers) {
	    		   System.out.println(i);
	    	   }
	    	  }
	    	  else
	    		  System.out.println("0");
	       }
	       else
	       {
	    	   System.out.println(" you need to enter a positive integer ");	           	           
	       }
		sc.close();
	}

}
