package hacker.strings;

public class SubstringComparison {

	public void run() {
		System.out.println(getSmallestAndLargest("welcometojava", 3));
		System.out.println(getSmallestAndLargest(
				"ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs",
				30));
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		for (int i = 0; i < k; i++) {
			smallest += "z";
			largest += "A";
		}

		// Complete the function
		// 'smallest' must be the lexicographically smallest substring of length 'k'
		// 'largest' must be the lexicographically largest substring of length 'k'

		for (int i = 0; i < s.length() - (k-1); i++) {

			boolean not = false;

			String sub = s.substring(i, i + k);

			// Negative is smaller
			if (sub.compareTo(smallest) < 0)
				smallest = sub;

			// Positive is higher
			if (sub.compareTo(largest) > 0)
				largest = sub;

		}

		return smallest + "\n" + largest;
	}
}
