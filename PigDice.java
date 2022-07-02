import java.util.Scanner;

public class PigDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char choice;
		int roll, turnScore, totalScore = 0, turnCount = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Let's Play PIG!\r\n" + "\r\n" + "* See how many turns it takes you to get to 20.\r\n"
				+ "* Turn ends when you hold or roll a 1.\r\n"
				+ "* If you roll a 1, you lose all points for the turn.\r\n"
				+ "* If you hold, you save all points for the turn.");

		System.out.println("Welcome to the game of Pig!");

		do {

			turnCount++;
			turnScore = 0;
			System.out.println("\n \n TURN  " + turnCount + " \n \n");

			System.out.println("Enter 'r' to roll again, 'h' to hold.\r");
			choice = sc.next().charAt(0);

			if (choice != 'r' && choice != 'h') {
				sc.close();
				return;
			}
			while (choice == 'r' || choice == 'h') {
				if (choice == 'r') {
					roll = (int) (Math.random() * 6) + 1;
					if (roll == 1) {
						System.out.println("You rolled:" + roll);
						System.out.println("Turn over.No Score");
						break;
					} else {
						System.out.println("You rolled:" + roll);
						turnScore += roll;
						if (turnScore + totalScore < 20) {
							System.out.println(
									"Your turn score is " + turnScore + " and your total score is " + totalScore);
							System.out.println("If you hold, you will have " + (turnScore + totalScore) + " points.");
						} else {
							totalScore += turnScore;
							break;
						}
					}
				} else if (choice == 'h') {
					totalScore += turnScore;
					System.out.println("Your turn score is " + turnScore + " and your total score is " + totalScore);
					break;
				} else {
					System.out.println(" You should enter only r' or 'h' ");
					sc.close();
					return;
				}
				if (totalScore < 20) {
					System.out.println("Enter 'r' to roll again, 'h' to hold.\r");
					choice = sc.next().charAt(0);
					if (choice != 'r' && choice != 'h') {
						sc.close();
						return;
					}
				}
			}
		} while (totalScore < 20);

		System.out.println(" \n You won! You finished in " + turnCount + " turns!");
		System.out.println("\n\n Game Over!");
		sc.close();
	}

}
