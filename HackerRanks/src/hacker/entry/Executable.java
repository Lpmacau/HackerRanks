package hacker.entry;

public interface Executable {
	
	public void run();
	
	public default long startTimer() {
		return System.currentTimeMillis();
	}
	
	public default long stopTimer() {
		return System.currentTimeMillis();
	}
}
