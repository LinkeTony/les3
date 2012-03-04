
public class EmployeeMedior extends AbstractEmployee {

	public EmployeeMedior(String name, double salary) {
		super(name, salary);
		setEmployeeType("Medior");
	}
		
	public void raiseSalary(AbstractEmployee employee){
		employee.setSalary(employee.getSalary() * 106 + 20000);
		employee.setSalary(employee.getSalary() / 100);
		logMessage("Log message: Medior employee " + employee.getName() + " has new salary: " + employee.getSalary());
	}
		
}
