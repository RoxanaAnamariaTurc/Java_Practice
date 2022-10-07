package oracle.hr;

public class HRApp {
    public static void main(String[] args) {

        System.out.println("Hr App Starts");

        Employees e1 = new Employees(230, "Jerry", 333998);
        Employees e2 = new Employees(420, "Gracie", 339998);

        Department dept = new Department("Education");
        System.out.println("Department Name : " + dept.toString());
        dept.addEmployees(e1);
        dept.addEmployees(e2);
        dept.addEmployees(new Employees(772, "Jack", 22988));

        Employees[] emps = dept.getEmployees();
        for (Employees emp : emps) {
            System.out.println("Emp: " + emp);
            // System.out.println("Emp: " + e2);
        }
        System.out.println("Total:" + dept.getTotalSalary());
        System.out.println("Total:" + dept.getAverageSalary());
        System.out.println("Emp :" + dept.getEmployeeId(222));

    }
}
