import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int num,divisor=2;	
		   Scanner sc=new Scanner(System.in);
		   
	       System.out.println(" please enther the number");
	       num=sc.nextInt();
	       
	       if(num >1 ) {
	    	   if (num ==2 || num ==3) {
	    		   System.out.println("  prime number ");   
	    	   }
	    	   else {
	    		      do {
	    			 
	    			   if( num%divisor==0)
	    			   {
	    				   System.out.println("  composite number ");
	    				   break;
	    			   }
	    			   divisor++;
	    			   
	    		   }while(divisor < num);
	    		      if(divisor == num) {
	    		    	  System.out.println(" prime number ");    	  
	    		      }
	    	   }
	       
	       }
	       else {
	    	   
	    	   System.out.println(" neither prime nor composite number ");
	       }
	       
		sc.close();
	}

}
