package employee;

import java.util.ArrayList;

interface EmpWageBuilderIF {
	public static int[] companiesWages = new int[10];
	public static ArrayList<Integer> getEmp = new ArrayList<Integer>();

	public void showFromInterface();
	public void totalWageOfCompany();
}
