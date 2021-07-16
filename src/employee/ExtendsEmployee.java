package employee;

import java.nio.channels.FileChannel.MapMode;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExtendsEmployee extends Employee {

	public Map<Integer,Integer> wageMap=new HashMap<Integer,Integer>();
	
	public static final Logger logger = Logger.getLogger("employeeWage");

	// check employee attendance
	protected void EmployeeAttendance() {
		System.out.println("---------------------------------------");
		if (randomNumber == 1) {
			logger.log(Level.INFO, "Employee present");
		} else {
			logger.log(Level.INFO, "Employee absent");
		}
		System.out.println("---------------------------------------");
	}

	// calculating daily wage of employee
	protected double DailyEmployeeWage() {
		System.out.println("---------------------------------------");
		dailyWage = wagePerHour * fullDayHour;
		logger.log(Level.INFO, "daily employee wage is :-" + dailyWage + " /- Rs");
		System.out.println("---------------------------------------");

		return dailyWage;
	}

	// calculating daily wage of part time employee
	protected void partTimeEmployeeWage() {
		System.out.println("---------------------------------------");
		partTimeEmployeeWage = wagePerHour * partTimeHour;
		logger.log(Level.INFO, "Part time employee wage :-" + partTimeEmployeeWage + " /- Rs");
		System.out.println("---------------------------------------");

	}

	// calculating monthly employee wage
	protected void WagesForMonth() {
		totalWageForMonth = workingDays * dailyWage;
		logger.log(Level.INFO, "total wages for month - " + totalWageForMonth + " RS");
	}

	// calculating Wages For Working Hour And Days for any company
	public void WagesForWorkingHourAndDays(String company, int wagePerHour, int workingDays,
			int totalMonthWorkingHour) {

		totalWagesForDays = 0;
		this.hourPerDay = totalMonthWorkingHour / workingDays;
		WagesForDay = this.hourPerDay * wagePerHour;

		for (int i = 0; i < 20; i++) {
			totalWagesForDays = totalWagesForDays + WagesForDay;
		}

		logger.log(Level.INFO, "----------------------------------------------------\n");
		logger.log(Level.INFO, company + " employee consume money for " + totalMonthWorkingHour + " hours or "
				+ workingDays + " days is - " + totalWagesForDays + " RS");
		logger.log(Level.INFO, "----------------------------------------------------\n");

		this.employeeWageBuilder = (int) totalWagesForDays;
		this.nameOfCompany = company;

		storeWage = new CompanyEmpWage(employeeWageBuilder);
	}

	private CompanyEmpWage storeWage;

	public void getAll() {
		// storeWage.show();
		storeWage.showFromInterface();
	}
	
	
	//getting Daily And Total Wage hash map
	protected int DailyAndTotalWage(int wagePerHour,int fullDayHour,int workingDays) {
		System.out.println("---------------------------------------");
		this.wagePerHour=wagePerHour;
		this.fullDayHour=fullDayHour;
		this.workingDays=this.workingDays;
		
		dailyWage = this.wagePerHour * this.fullDayHour;
		totalWageForMonth = this.workingDays * dailyWage;
		wageMap.put((int) dailyWage, (int) totalWageForMonth);
		return (int)dailyWage;
	}
	
	//desplaying daily wage with monthly wage
	public void getValue(int getValue) {
		System.out.println("daily wage is "+getValue+" monthly wage is "+wageMap.get(getValue));
	}
	

	

}
