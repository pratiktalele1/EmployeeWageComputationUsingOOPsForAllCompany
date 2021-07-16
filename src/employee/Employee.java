package employee;

public class Employee {
	//parent variable
	protected int randomNumber;
	protected int wagePerHour=20;
	protected int fullDayHour=8;
	
	//generating random number
	protected void getRandomNumber() {
		randomNumber=(int) (Math.random()*2+1);
	}
	
	
}
