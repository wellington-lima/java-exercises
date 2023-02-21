package exercise04;

public class Student {
	public String name;
	public double grade1, grade2, grade3;
	
	public String calculateFinalGrade() {
		double finalGrade = grade1 + grade2 + grade3;
		
		if(finalGrade >= 60) {
			return "FINAL GRADE = " + String.format("%.2f", finalGrade) + "\nPASS";
		} else {
			return "FINAL GRADE = " + String.format("%.2f", finalGrade) + "\nFAILED \nMISSING " + String.format("%.2f", (60 - finalGrade)) + " POINTS";
		}
	}
}
