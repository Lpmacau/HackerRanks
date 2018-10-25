package hacker.algorithm.implementation;

import java.util.Arrays;

public class GradingStudents {

	public void run() {
		int[] grades = { 74, 73, 72, 71, 67, 38, 33, 29, 35, 21, 77, 44, 98 };
		Arrays.stream(gradingStudents(grades)).forEach(x -> System.out.println(x));
	}

	private int[] gradingStudents(int[] grades) {

		for (int i = 0; i < grades.length; i++) {
			int remainder = grades[i] % 5;
			System.out.println(remainder);

			// Se a nota for <38, nao se arredonda
			if (grades[i] >= 38) {
				// Se o resto da divisao por 5 for menor que tres, arrendondar
				if (remainder != 0) {
					if (remainder >= 3)
						grades[i] += 5 - remainder;
				}

			}
		}
		return grades;
	}
}
