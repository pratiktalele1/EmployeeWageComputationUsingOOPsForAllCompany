package employee;

public class CompanyEmpWage implements EmpWageBuilderIF {
	public static int i = 0;
	public static int[] wage = new int[10];

	public CompanyEmpWage(int employeeWageBuilder) {
		wage[i] = employeeWageBuilder;
		companiesWages[i] = employeeWageBuilder;
		i++;

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
		System.out.println("total wages of company from interface");
		for (int k : companiesWages) {
			if (k != 0) {
				System.out.println(k);
			}

		}
	}

}
