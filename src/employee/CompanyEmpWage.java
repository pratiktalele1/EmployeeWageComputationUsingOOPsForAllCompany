package employee;

public class CompanyEmpWage implements EmpWageBuilderIF {
	public static int i = 0;
	public static int totalWage = 0;
	public static int[] wage = new int[10];
	

	public CompanyEmpWage(int employeeWageBuilder) {
		totalWage=employeeWageBuilder;
		wage[i] = employeeWageBuilder;
		companiesWages[i] = employeeWageBuilder;
		i++;
		getEmp.add(employeeWageBuilder);
	}

	// getting all company wage
	public void show() {
		System.out.println("total wages of company are");
		for (int k : wage) {
			if (k != 0) {
				System.out.println(k);
			}

		}
	}

	@Override
	public void showFromInterface() {
		// getting value from interface wages
		System.out.println("total wages of company from interface");
		for (int k : companiesWages) {
			if (k != 0) {
				System.out.println(k);
			}

		}

		// getting value from array list
		System.out.println("getting value from array list");
		for (int j = 0; j < getEmp.size(); j++) {
			System.out.println(getEmp.get(j));
		}
	}
	
	
	public void totalWageOfCompany() {
		System.out.println(totalWage);
	}

}
