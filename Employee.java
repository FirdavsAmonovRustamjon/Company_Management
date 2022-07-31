public abstract class Employee {
    private Integer id;
    private String name;
    private String surname;
    private Double salary;
    private String work;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public abstract String getDetail();

    public abstract void printEmployeeType();


    public abstract Double getOneTimeBonus();

    public abstract Double getHolidayBonus();

    public abstract Double calculatePensionTax();

    public abstract Double calculateInsuranceTax();

    public abstract Double calculateSalaryAfterAllTaxes();

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", work='" + work;
    }
}
