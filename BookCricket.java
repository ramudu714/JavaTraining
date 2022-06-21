import java.util. Scanner;

public class BookCricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int score1,score2,point,choice,pageNumber,target;
     int turn,rounds1,rounds2;
     String player1="",player2="";
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println(" Welcome to BookCricket Game");
     System.out.println(" Enter 1 to the Start the Game and 0 for Exit:");
     
     choice= sc.nextInt();
     
     while(choice==1)
     {
    	 // score1score2=0,point=0,choice=0,pageNumber=0, target;
    	 score1=score2=point=pageNumber=target=0;
    	 turn=rounds1=rounds2=0;
    	 
    	 System.out.println(" Enter player1 name");
    	 player1 = sc.next();
    	 
    	 System.out.println(" Enter player2 name");
    	 player2 = sc.next();
    	 
    	 System.out.println(" Player " + player1);
         do {
        	 
        	 System.out.println(" Enter 1 to open the book");
        	 turn= sc.nextInt();   	 
        	 
        	 if(turn==1) {
        	 
        	 pageNumber = (int) (Math.random()*300);
     	   	 point = pageNumber%7;
        	 score1 += point;
        	 
        	 System.out.println(" Page Numer:" + pageNumber + "      Point: " + point + "           Score: "  + score1  );
        	 rounds1++;
        	 
        	 if(point == 0) {
        		 System.out.println("!!!!!!        OOPS           !!!!!!!!");
        		 break;
        	 }
        	 }
        	 else
        	 {
        		 break;
        	 }
        	 
         } while(point!=0);
         
         System.out.println(player1 + "'s Total Score:  " + score1);
         System.out.println(player1 + " has taken " + rounds1 + " rounds");
         
         target = score1+1;
         System.out.println(player2 + " needs " + target + "  in " + rounds1 + " rounds ");
         System.out.println(" Player " + player2);
         
         do {
        	 
        	 System.out.println(" Enter 1 to open the book");
        	 turn= sc.nextInt();
        	 if(turn==1) {
        	 pageNumber = (int) (Math.random()*300);
           	 point = pageNumber%7;
        	 score2 += point;
        	 
        	 rounds2++;
        	 System.out.println(" Page Numer:" + pageNumber + "      Point: " + point + "           Score  "  + score2 + "       rounds left " + (rounds1-rounds2) );
        	 
        	 
        	 if(point == 0) {
        		 System.out.println("!!!!!!        OOPS           !!!!!!!!");
        		 break;
        	 }
        	 }
        	 else {
        		 break;
        	 }
        	 
        	   	        	 
       	 } while(point!=0 && score2 < target && rounds2 <= rounds1);

		if(score2>target)
		{
			System.out.println(player2 + " wins the match ");
		}else if(score2==target && rounds2 < rounds1)
		{
			System.out.println(player2 + " wins the match ");
		}else if(score2==score1 && rounds2 == rounds1)
		{
			System.out.println(player2 + " Its a TIE ");
			
		}else 
		{
			System.out.println(player1 + " wins the match ");
		}
        
		System.out.println(" Enter 1 to the Start the Game and 0 for Exit:");
	    choice= sc.nextInt();	       
         
     }
           
     sc.close();
	
	System.out.println(" Good Day");
	
	}
}
