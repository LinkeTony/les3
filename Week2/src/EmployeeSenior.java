
public class EmployeeSenior extends AbstractEmployee {

	public EmployeeSenior(String name, double salary) {
		super(name, salary);
		setEmployeeType("Senior");
	}
	
	public void raiseSalary(AbstractEmployee employee){
		employee.setSalary(employee.getSalary() * 107);
		employee.setSalary(employee.getSalary() / 100);
		logMessage("Log message: Senior employee " + employee.getName() + " has new salary: " + employee.getSalary());
	}
}
