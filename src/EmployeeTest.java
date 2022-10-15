
public class EmployeeTest {

	CompanyEmpWage[] companies;
	int lastIndex;

	public EmployeeTest() {
		companies = new CompanyEmpWage[10];
	}

	public void addCompany(CompanyEmpWage company) {
		company.calculateEmployeeWage();
		companies[lastIndex] = company;
		lastIndex++;
	}

	public void printAllCompanies() {
		for (int i = 0; i < companies.length; i++) {
			if (companies[i] != null) {
				System.out.println(companies[i]);
				System.out.println("<------------------------->");
			}
		}
	}

	public static void main(String[] args) {
		EmployeeTest testObj = new EmployeeTest();

		CompanyEmpWage dmartEmpWage = new CompanyEmpWage("DMart", 8, 20, 20, 60);

		CompanyEmpWage rilEmpWage = new CompanyEmpWage("Reliance", 10, 25, 22, 80);

		CompanyEmpWage wiproEmpWage = new CompanyEmpWage("Wipro", 8, 25, 20, 80);

		testObj.addCompany(dmartEmpWage);
		testObj.addCompany(rilEmpWage);
		testObj.addCompany(wiproEmpWage);

		testObj.printAllCompanies();
	}

}