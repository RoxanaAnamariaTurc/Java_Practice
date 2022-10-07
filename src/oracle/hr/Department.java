package oracle.hr;

public class Department {

    private String deptName;

    private Employees[] employees = new Employees[10];
    private int lastAddedEmployeeIndex = -1;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void setName(String name) {
        this.deptName = name;
    }

    public String getName() {
        return deptName;
    }

    @Override
    public String toString() {
        return getName();
    }

    public void addEmployees(Employees someEmployees)

    {
        if (lastAddedEmployeeIndex < employees.length) {
            lastAddedEmployeeIndex++;
            employees[lastAddedEmployeeIndex] = someEmployees;
        }

    }

    public Employees[] getEmployees() {

        Employees[] actualEmployees = new Employees[lastAddedEmployeeIndex + 1];
        for (int i = 0; i < actualEmployees.length; i++) {
            actualEmployees[i] = employees[i];
        }
        return actualEmployees;
    }

    public int getEmployeesCount() {
        return lastAddedEmployeeIndex + 1;
    }

    public Employees getEmployeeId(int empId) {
        for (Employees emp : employees) {
            if (emp != null) {
                if (emp.getIdentification() == empId) {
                    return emp;
                }

            }
        }
        return null;

    }

    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i <= lastAddedEmployeeIndex; i++) {
            totalSalary += employees[i].getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        if (lastAddedEmployeeIndex > -1) {
            return getTotalSalary() / (lastAddedEmployeeIndex + 1);
        }
        return 0.0;
    }
}
