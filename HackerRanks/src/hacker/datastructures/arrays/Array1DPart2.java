package hacker.datastructures.arrays;

public class Array1DPart2 {

	public void run() {		
		int leap1 = 2;
		int[] game1 = {0,1,0,1,0,1};
		int leap2 = 6;
		int[] game2 = {0,0,1,1,0,0,1,1,0,0};
		int leap3 = 3;
		int[] game3 = {0,0,1,1,0,0,1,1,0,0};
		int[] game4 = {0,1,1,0,0,1,1,0,1};
		

		System.out.println(canWin(leap1,game1) ? "YES" : "NO");
		System.out.println(canWin(leap2,game2) ? "YES" : "NO");
		System.out.println(canWin(leap3,game3) ? "YES" : "NO");
		System.out.println(canWin(4,game4) ? "YES" : "NO");
		
	}
	
	public boolean canWinRec(int leap, int[] game, int i) {
		int len = game.length;
		
		// If we are at the end of the recursion (walking back)
		//  or every position has been checked
		if(i < 0 || game[i] == 1) return false;
		
		// If we are on the right edge and can walk or jump -> win
		if((i == len - 1) || (i + leap > len - 1 )) return true;
		
		// Check this spot as visited
		game[i] = 1;
		
		// Run on rest of indexes, i-1, i+1 and i+leap
		return canWinRec(leap,game,i+1) || canWinRec(leap,game,i-1) || canWinRec(leap,game,i+leap);
	}
	
	public boolean canWin(int leap, int[] game) {
		return canWinRec(leap,game,0);
		
	}
}
