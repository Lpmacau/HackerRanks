package hacker.datastructures.arrays;

public class Array1DPart2 {

	public void run() {

		int leap1 = 3;
		int[] game1 = {0,0,0,0,0};
		int leap2 = 5;
		int[] game2 = {0,0,0,1,1,1};
		int leap3 = 3;
		int[] game3 = {0,0,1,1,1,0};

		System.out.println(canWin(leap1,game1) ? "YES" : "NO");
		System.out.println(canWin(leap2,game2) ? "YES" : "NO");
		System.out.println(canWin(leap3,game3) ? "YES" : "NO");
		
	}
	
	public boolean canWin(int leap, int[] game) {
		int i;

		// Walk max forward
		for(i = 0; i<game.length-1; i++) {
			// Try to jump
			// If leaps off the board - WIN
			if(i + leap > game.length-1 || i == game.length-1) return true;
			
			if(i+1 == game.length) return true;
			
			if(i+1 < game.length && game[i+1]==0) continue;
			
			// Jump to spot and continue
			if(game[i+leap]==0)
				i += leap;
			// Blocked, cant leap - LOST
			else return false;
			
		}
		
		
		return true;
	}
}
