package lamda_expression_Vs_annonymous_inner_class;

public class Main {
	public static void main(String[] args) {
		// Lambda Expression
		Employee employee1 = () -> {
			
			double x = 10000; // Local Variable
			return x;
		};
			
		// Anonymous Inner Class
		Employee employee2 = new Employee() {
			
			double x = 20000; // Instance Variable, Since It's Anonymous Inner Class
			
			@Override
			public double getSalary() {
				return this.x;
			}
		};			
		
		System.out.println(employee1.getSalary()); // 10000.0
		System.out.println(employee2.getSalary()); // 20000.0
	}
}
