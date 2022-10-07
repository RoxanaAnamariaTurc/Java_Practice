package oracle.hr;

public class Employees {

    private int identification;
    private String name;
    private double salary;

    public Employees(int identification, String name, double salary) {
        this.identification = identification;
        this.name = name;
        this.salary = salary;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public int getIdentification() {
        return identification;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee : " + getIdentification() + " " + getName() + " " + getSalary();
    }
}
