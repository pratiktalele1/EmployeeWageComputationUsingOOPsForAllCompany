package employee;



public class CompanyEmpWage {
	public static int i = 0;
	public static int[] wage = new int[10];

	//storing all wages of companies
	public CompanyEmpWage(int employeeWageBuilder) {
		wage[i] = employeeWageBuilder;
		i++;
	}
	
	//getting all company wage
	public void show() {
		System.out.println("total wages of company are");
		for(int k:wage) {
			if(k!=0) {
				System.out.println(k);
			}
			
		}
	}

}
