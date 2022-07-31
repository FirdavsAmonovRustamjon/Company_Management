public class SeasonalEmployees extends Employee { // Mavsumiy xodimlar
    private String season;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String getDetail() {
        return super.toString() + " season = " + season;
    }

    @Override
    public void printEmployeeType() {
        System.out.println("SeasonalEmployee");
    }

    @Override
    public Double getOneTimeBonus() {
        return getSalary() * 0.2;
    }

    @Override
    public Double getHolidayBonus() {
        return getSalary() * 0.3;
    }

    @Override
    public Double calculatePensionTax() {
        return getSalary() * 0.065;
    }

    @Override
    public Double calculateInsuranceTax() {
        return getSalary() * 0.005;
    }

    @Override
    public Double calculateSalaryAfterAllTaxes() {
        return getSalary() + getHolidayBonus() + getOneTimeBonus() - calculateInsuranceTax() - calculatePensionTax();
    }

}
