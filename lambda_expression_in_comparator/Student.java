package lambda_expression_in_comparator;

public class Student {
	public int id;
	public String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
}
