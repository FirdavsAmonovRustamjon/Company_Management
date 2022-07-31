public class CompanyManagement {

    private Integer generalId = 1;

    Employee[] employeeList = new Employee[1];
    private int employeeINdex = 0;


    public PermanentEmployee addPermanentEmployee(String name, String surname, Double salary, String work, String room) {

        PermanentEmployee permanentEmployee = new PermanentEmployee();
        if (employeeList.length == employeeINdex) {
            Employee[] tempArr = new Employee[employeeList.length + 1];
            System.arraycopy(employeeList, 0, tempArr, 0, employeeList.length);
            employeeList = tempArr;
        }
        permanentEmployee.setId(generalId++);
        permanentEmployee.setName(name);
        permanentEmployee.setSurname(surname);
        permanentEmployee.setSalary(salary);
        permanentEmployee.setWork(work);
        permanentEmployee.setRoom(room);

        employeeList[employeeINdex++] = permanentEmployee;
        return permanentEmployee;
    }

    public SeasonalEmployees addSeasonalEmployee(String name, String surname, Double salary, String work, String season) {

        SeasonalEmployees seasonalEmployees = new SeasonalEmployees();

        if (employeeList.length == employeeINdex) {
            Employee[] tempArr = new Employee[employeeList.length + 1];
            System.arraycopy(employeeList, 0, tempArr, 0, employeeList.length);
            employeeList = tempArr;
        }
        seasonalEmployees.setId(generalId++);
        seasonalEmployees.setName(name);
        seasonalEmployees.setSurname(surname);
        seasonalEmployees.setSalary(salary);
        seasonalEmployees.setWork(work);
        seasonalEmployees.setSeason(season);

        employeeList[employeeINdex++] = seasonalEmployees;
        return seasonalEmployees;
    }

    public TemporaryEmployee addTemporaryEmployee(String name, String surname, Double salary, String work, Integer workingHours) {

        TemporaryEmployee temporaryEmployee = new TemporaryEmployee();

        if (employeeList.length == employeeINdex) {
            Employee[] tempArr = new Employee[employeeList.length + 1];
            System.arraycopy(employeeList, 0, tempArr, 0, employeeList.length);
            employeeList = tempArr;
        }
        temporaryEmployee.setId(generalId++);
        temporaryEmployee.setName(name);
        temporaryEmployee.setSurname(surname);
        temporaryEmployee.setSalary(salary);
        temporaryEmployee.setWork(work);
        temporaryEmployee.setWorkingHours(workingHours);

        employeeList[employeeINdex++] = temporaryEmployee;
        return temporaryEmployee;
    }

    public PartnerEmployee addPartnerEmployee(String name, String surname, Double salary, String work) {
        PartnerEmployee partnerEmployee = new PartnerEmployee();

        if (employeeList.length == employeeINdex) {
            Employee[] tempArr = new Employee[employeeList.length + 1];
            System.arraycopy(employeeList, 0, tempArr, 0, employeeList.length);
            employeeList = tempArr;
        }
        partnerEmployee.setId(generalId++);
        partnerEmployee.setName(name);
        partnerEmployee.setSurname(surname);
        partnerEmployee.setSalary(salary);
        partnerEmployee.setWork(work);
        employeeList[employeeINdex++] = partnerEmployee;
        return partnerEmployee;

    }

    public void printAllEmployeeDetail() {
        for (Employee employee : employeeList) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public void printAllEmployeeType() {

        for (Employee employee : employeeList) {
            if (employee != null) {
                employee.printEmployeeType();
            }
        }
    }

    public void showAllEmployeeBonus() {
        for (Employee employee : employeeList) {
            if (employee != null) {
                System.out.println(employee.getName() +
                        " Allbonus = " + (employee.getHolidayBonus() + employee.getOneTimeBonus()));
            }
        }

    }

    public void showAllPensionTax() {
        for (Employee employee : employeeList) {
            if (employee != null) {
                System.out.println(employee.getName() + " PensionTax = " + employee.calculatePensionTax());
            }
        }
    }

    public void showAllInsuranceTax() {

        for (Employee employee : employeeList) {
            if (employee != null) {
                System.out.println(employee.getName() + " InsuranceTax = " + employee.calculateInsuranceTax());
            }
        }
    }

    public void showAllSalaryAfterAllTaxes() {
        for (Employee employee : employeeList) {
            if (employee != null) {
                System.out.println(employee.calculateSalaryAfterAllTaxes());
            }
        }

    }
}
