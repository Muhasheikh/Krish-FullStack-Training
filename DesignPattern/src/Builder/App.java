package Builder;

public class App {
	public static void main(String[] args) {

        Employee.Builder builder = new Employee.Builder("IT19212050");

        Employee employee = builder.gender("Male").age(23).name("Muhassan").build();

        System.out.println(employee);

    }
}
