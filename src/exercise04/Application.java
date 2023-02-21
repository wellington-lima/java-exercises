package exercise04;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the student data:");
		System.out.print("Name: ");
		student.name = sc.nextLine();
		
		System.out.print("Grade 1: ");
		student.grade1 = sc.nextDouble();
		
		System.out.print("Grade 2: ");
		student.grade2 = sc.nextDouble();
		
		System.out.print("Grade 3: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println(student.calculateFinalGrade());
		
		sc.close();
	}

}
