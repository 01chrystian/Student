package entities;

public class Student {

	public String name;
	public double gradeOne;
	public double gradeTwo;
	public double gradeThree;
	public double notes;
	public double lack = 60;

	public void SumOfNotes(double gradeOne, double gradeTwo, double gradeThree) {
		notes = (gradeOne + gradeTwo + gradeThree);
	}

	public String ShowsSums() {
		if (notes >= 60) {
			return "Final grade = " + String.format("%.2f", notes) + "\n" + "PASS";
		} else {
			return "Final grade = " + String.format("%.2f", notes) + "\n" + "FAILED \n" + "MISSING "
					+ String.format("%.2f", lack - notes) + " POINTS";
		}
	}
}