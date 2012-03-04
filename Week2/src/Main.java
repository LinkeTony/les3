import Exceptions.EmployeeException;

public class Main {

	public static void main(String[] args) {
	
		SalarySystem salarySystem = new SalarySystem();

		EmployeeJunior employee1 = new EmployeeJunior("Jaap", 1400);
		EmployeeMedior employee2 = new EmployeeMedior("Piet", 2800);
		EmployeeSenior employee3 = new EmployeeSenior("Kees", 3500);
		EmployeeSenior employee4 = new EmployeeSenior("Kees", 3500);
		
		try {
			salarySystem.addColleague(employee1);
			salarySystem.addColleague(employee2);
			salarySystem.addColleague(employee3);
			salarySystem.addColleague(employee4);
		} catch (EmployeeException e) {
			System.out.println("Logging: " + e.getMessage() + "\n");
		}
		
		salarySystem.raiseSalary(employee1);
		salarySystem.raiseSalary(employee2);
		salarySystem.raiseSalary(employee3);
		
		salarySystem.printAllEmployees();

	}

}
