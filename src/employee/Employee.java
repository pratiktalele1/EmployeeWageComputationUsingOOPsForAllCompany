package employee;

public class Employee {
	//parent variable
	protected int randomNumber;
	
	//generating random number
	protected void getRandomNumber() {
		randomNumber=(int) (Math.random()*2+1);
	}
	
	
}
