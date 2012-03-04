
public class EmployeeJunior extends AbstractEmployee {

	public EmployeeJunior(String name, double salary) {
		super(name, salary);
		setEmployeeType("Junior");
	}

	public void raiseSalary(AbstractEmployee employee){
		employee.setSalary(employee.getSalary() * 105 + 10000);
		employee.setSalary(employee.getSalary() / 100);
		logMessage("Log message: Junior employee " + employee.getName() + " has new salary: " + employee.getSalary());
	}

}
