public class TemporaryEmployee extends Employee { // vaqtinchalik xodim

    private Integer workingHours;

    public Integer getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Integer workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String getDetail() {
        return super.toString() + " workingHours = " + workingHours;
    }

    @Override
    public void printEmployeeType() {
        System.out.println("TemporaryEmployee");
    }

    @Override
    public Double getOneTimeBonus() {
        return 0.0;
    }

    @Override
    public Double getHolidayBonus() {
        return 0.0;
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
        return getSalary();
    }


}
