package trevor.tostangs.com;
import  java.util.*;


public class RPS {
	static Scanner sc = new Scanner(System.in);
	static boolean rock = false, paper = false, scissors = false;
	static String rocki = "rock", r = "r", paperi = "paper", p = "p", scissorsi = "scissors", s = "s", quit = "q";
	
	
	public static void main(String[] args){
		System.out.println("Please enter an option from the list:\nRock or r \nPaper or p \nScissors or s \nEnter q to quit");
		String input = sc.nextLine();
		Opponent oppo = new Opponent();
		int oppoIn;
		int userIn = 0;
		
		while (!(input.equals(quit))){
			if ((input.equals(r)) || (input.equals(rocki))){
				rock = true;
				userIn = 0;
			} else if ((input.equals(p)) || (input.equals(paperi))){
				paper = true;
				userIn = 1;
			} else if((input.equals(s)) || (input.equals(scissorsi))){
				scissors = true;
				userIn = 2;
			} else {
				System.out.println("Please enter a valid choice.");
				input = sc.nextLine();
			}
			
			if (rock || paper || scissors){
				oppoIn = oppo.generateOpponent();
				String oppoStr = "";
				
				switch (oppoIn){
				case 0:
					oppoStr = "rock";
					break;
				case 1:
					oppoStr = "paper";
					break;
				case 2:
					oppoStr = "scissors";
					break;
				}
					
				
				System.out.println("The opponents input is: " + oppoStr);
				
				if (oppoIn == 0 && userIn != 2){
					if (userIn == 1)
						System.out.println("Paper beats rock, you win!");
					if (userIn == 0)
						System.out.println("Tie game");
				}
				
				if (oppoIn == 1 && userIn != 0){
					if (userIn == 2)
						System.out.println("Scissors beats paper, you win!");
					if (userIn == 1)
						System.out.println("Tie game!");
				}
				
				if (oppoIn == 2 && userIn != 1){
					if (userIn == 0)
						System.out.println("Scissors beats paper, you win!");
					if (userIn == 2)
						System.out.println("Tie game!");
				}
				input = sc.nextLine();
				
			}
		}
	}
}

