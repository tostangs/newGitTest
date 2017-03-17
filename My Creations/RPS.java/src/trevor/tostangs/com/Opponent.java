package trevor.tostangs.com;

import java.util.Random;

public class Opponent {
	
	public int generateOpponent(){
		Random r = new Random();
		int oppo = r.nextInt(2);
		
		return oppo;
	}
}