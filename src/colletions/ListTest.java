package colletions;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest {

	public static void main(String[] args) {
		String student1 = "Marcos";
		String student2 = "Isabella";
		String student3 = "Nicolas";
		
		ArrayList<String> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		System.out.println(students);
		students.remove(0);
		System.out.println(students);
		System.out.println("There are  " + students.size() + " in the class.");
		
		for (String student : students) {
			System.out.println("Student: " + student + ".");
		}
		String prettiest = students.get(0);
		System.out.println("The most beautiful student is " + prettiest + ".");
		System.out.println("----------------------------------------------------------------");
		students.add("Marcos");
		System.out.println("New student added.");
		
		
		for (int i = 0; i<students.size(); i++) {
			System.out.println("Student: "+ students.get(i)+".");
		}
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("New student added.");
		students.add("Rayanne");
		
		students.forEach(student->{
			System.out.println("student: " + student + ".");
		});
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Ordination.");
		System.out.println("before: ");
		System.out.println(students);
		System.out.println("after: ");
		Collections.sort(students);
		System.out.println(students);

	}

}
