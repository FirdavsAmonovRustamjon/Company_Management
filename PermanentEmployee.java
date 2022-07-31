public class PermanentEmployee extends Employee { // Doimiy xodim
    private String room;

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String getDetail() {
        return super.toString() + " room = " + room;
    }

    @Override
    public void printEmployeeType() {
        System.out.println("PermanentEmployee");
    }

    @Override
    public Double getOneTimeBonus() {
        return getSalary() * 0.5;
    }

    @Override
    public Double getHolidayBonus() {
        return getSalary() * 0.4;
    }

    @Override
    public Double calculatePensionTax() {
        return getSalary() * 0.075;
    }

    @Override
    public Double calculateInsuranceTax() {
        return getSalary() * 0.01;
    }

    @Override
    public Double calculateSalaryAfterAllTaxes() {
        return getSalary() + getHolidayBonus() + getOneTimeBonus() - calculateInsuranceTax() - calculatePensionTax();
    }

}
