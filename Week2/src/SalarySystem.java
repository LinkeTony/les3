import java.util.ArrayList;
import Exceptions.EmployeeException;

public class SalarySystem {

	private ArrayList<AbstractEmployee> employees = new ArrayList<AbstractEmployee>();

	public void addColleague(AbstractEmployee employee) throws EmployeeException{
		if (!doesEmployeeExist(employee.getName())) {
			employees.add(employee);
		} else{
			throw new EmployeeException("Employee " + employee.getName() 
					+ " already exists and cannot added again");
		}
	}
	
	public boolean doesEmployeeExist(String name) {
		for (AbstractEmployee employee : employees) {
			if (employee.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public void raiseSalary(AbstractEmployee employee){
		employee.raiseSalary(employee);
	}
	
	public void printAllEmployees() {
		for (AbstractEmployee employee : employees) {
			System.out.print(employee.toString() + "\n");
		}
	}
	
}
