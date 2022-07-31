public class PartnerEmployee extends Employee {


    @Override
    public String getDetail() {
        return super.toString();
    }

    @Override
    public void printEmployeeType() {
        System.out.println("PartnerEmployee");
    }

    @Override
    public Double getOneTimeBonus() {
        return 0.75;
    }

    @Override
    public Double getHolidayBonus() {
        return 0.75;
    }

    @Override
    public Double calculatePensionTax() {
        return 0.0;
    }

    @Override
    public Double calculateInsuranceTax() {
        return 0.0;
    }

    @Override
    public Double calculateSalaryAfterAllTaxes() {
        return getSalary() + getHolidayBonus() + getOneTimeBonus();
    }
}
