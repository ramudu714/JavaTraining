import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int num,factorial=1;	
	   Scanner sc=new Scanner(System.in);
	   
       System.out.println(" please enther the number");
       num=sc.nextInt();
       
       if(num >=0) {       
       while(num >1 )
       { 
    	  factorial *= num;
    	  num--;
       }
       
       if(num==0) {
    	   
    	   factorial = 1;
       }
           System.out.println("Factorial is " + factorial);
       }
       else {
    	   
    	   System.out.println(" factorial is not defined for negative number");
       }
       
        sc.close();
	}

}
