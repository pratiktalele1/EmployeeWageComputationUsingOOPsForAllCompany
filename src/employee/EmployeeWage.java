package employee;

public class EmployeeWage {

	public static void main(String[] args) {
		
		//creating object for child class
		ExtendsEmployee employeeData=new ExtendsEmployee();
		//getting random number
		employeeData.getRandomNumber();
		//checking for employee attendance
		employeeData.EmployeeAttendance();
		//getting daily employee wage
		employeeData.DailyEmployeeWage();
		
	}
}	