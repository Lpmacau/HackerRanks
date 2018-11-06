package hacker.entry;

import java.util.Arrays;

import hacker.algorithms.HowManySubStrings;
import hacker.algorithms.MigratoryBirds;

public class EntryPoint {

	public static void main(String[] args) {
		HowManySubStrings test = new HowManySubStrings();

		test.run();
	}

	public static void bigDecimal() {
		String[] nums = { "9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000" };
		
		String[] s = nums[4].split(".");
		
		Arrays.stream(s).forEach(x -> System.out.println(x));
	}

}
