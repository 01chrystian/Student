package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {

			String name;
			double gradeOne = 0;
			double gradeTwo = 0;
			double gradeThree = 0;
			boolean proposition;
			Student student = new Student();

			while (proposition = true) {

				name = sc.nextLine();
				gradeOne = sc.nextDouble();
				gradeTwo = sc.nextDouble();
				gradeThree = sc.nextDouble();

				if (gradeOne > 30 || gradeTwo > 35 || gradeThree > 35) {
					proposition = true;
					System.out.println("Exceeded semester grade limit! \n");
					System.out.println("Try again with notes only:");
				} else {
					proposition = false;
					System.out.println("\n within the range of grades! \n");
					student.SumOfNotes(gradeOne, gradeTwo, gradeThree);
					System.out.println(student.ShowsSums());
				}
			}

			sc.close();

		}
	}

}
