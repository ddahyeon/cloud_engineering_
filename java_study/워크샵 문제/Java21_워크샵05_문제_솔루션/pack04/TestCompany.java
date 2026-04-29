package pack04;

public class TestCompany {
	public static void main(String[] args) {
		double salary = Double.parseDouble(args[0]);
		Company company = new Company(salary);
		System.out.println("연 기본급 합 : " + company.getIncome() + " 세후 : "
				+ company.getAfterTaxIncome());
		System.out.println("연 보너스 합 : " + company.getBonus() + " 세후 : "
				+ company.getAfterTaxBonus());
		System.out.println("연 지급액 합 : "
				+ (company.getAfterTaxIncome() + company.getAfterTaxBonus()));
	}
}