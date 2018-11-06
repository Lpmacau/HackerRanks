package hacker.entry;

import java.math.BigDecimal;
import java.util.Arrays;

import hacker.datastructures.JavaList;
import hacker.datastructures.linkedlists.InsertNodeTail;

public class EntryPoint {

	public static void main(String[] args) {
		JavaList test = new JavaList();

		test.run();
	}

	public static void bigDecimal() {
		String[] nums = { "9", "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000" };
		
		String[] s = nums[4].split(".");
		
		Arrays.stream(s).forEach(x -> System.out.println(x));
	}

}
