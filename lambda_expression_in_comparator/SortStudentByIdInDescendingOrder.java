package lambda_expression_in_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentByIdInDescendingOrder {
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(2, "Ajay"));
		students.add(new Student(4, "Akash"));
		students.add(new Student(6, "Riya"));
		students.add(new Student(10, "Raj"));
		
		Collections.sort(students, (a,b) -> b.id - a.id);
		
		System.out.println(students); // [[id=10, name=Raj], [id=6, name=Riya], [id=4, name=Akash], [id=2, name=Ajay]]
	}
}
