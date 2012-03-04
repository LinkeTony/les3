
public abstract class AbstractEmployee {
	
	private String name;
	private double salary;
	private String employeeType;
	
	public AbstractEmployee(String name, double salary) {
		this.name = name; 
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
		
	public void setEmployeeType(String employeeType){
		this.employeeType = employeeType;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void raiseSalary(AbstractEmployee employee) {		
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void logMessage(String message){
		System.out.println(message);
	}
	
	public String toString() {
		return employeeType+ " employee " + name + " has salary " + salary;
	}



}
