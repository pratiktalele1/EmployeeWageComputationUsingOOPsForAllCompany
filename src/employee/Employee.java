package employee;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Employee {
	//parent variable
	protected int randomNumber;
	protected int wagePerHour=20;
	protected int fullDayHour=8;
	protected int partTimeHour=8;
	protected double dailyWage;
	protected double partTimeEmployeeWage;
	protected double totalWageForMonth;
	protected double workingDays=20;
	protected double totalWagesForDays=0;
	protected double hourPerDay;
	protected double WagesForDay;
	protected double totalMonthWorkingHour=100;
	
	public static final Logger logger=Logger.getLogger("employee");

	//generating random number
	protected void getRandomNumber() {
		randomNumber=(int) (Math.random()*2+1);
	}
	
	//calculating employee wage using switch case statement
	public void employeeWageUsingSwitch() {
		logger.log(Level.INFO,
				"\noption 1 for employee Daily Wage\noption 2 for employee Part time Wage"
				);
		logger.log(Level.INFO,"Enter :-");
		
		Scanner getValue = new Scanner(System.in);
		int selectOption = getValue.nextInt();
		System.out.println("-----------------------------------------------------");

		switch (selectOption) {
		case 1: {
			dailyWage=wagePerHour*fullDayHour;
			logger.log(Level.INFO," employee Daily wage "+ dailyWage +" RS");
			break;
		}
		case 2: {
			partTimeEmployeeWage=wagePerHour*partTimeHour;
			logger.log(Level.INFO,"Part time employee wage "+ partTimeEmployeeWage +" RS");
			break;
		}
		default:
			System.out.println("wrong option");
		}
		System.out.println("-----------------------------------------------------");
	}
	
	
}