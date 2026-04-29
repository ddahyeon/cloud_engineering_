package pack04;

public class Company {
	double salary;
	double income = 0.0;
	double bonus = 0.0;
	double afterTaxIncome = 0.0;
	double afterTaxBonus = 0.0;

	public Company() {
	}

	public Company(double salary) {
		this.salary = salary;
	}

	public double getIncome() {
		income = salary * 12;
		return income;
	}

	public double getAfterTaxIncome() {
		afterTaxIncome = (income - (income * 0.1));
		return afterTaxIncome;
	}

	public double getBonus() {
		bonus = (salary * 4 * 0.2);
		return bonus;
	}

	public double getAfterTaxBonus() {
		afterTaxBonus = (bonus - (bonus * 0.055));
		return afterTaxBonus;
	}
}