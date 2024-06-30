public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        // add employee1
        Employee employee1 = new Employee("123432", "1212", "123", 2, 102);
        employeeBook.addEmployee(employee1);
        System.out.println(employeeBook.getEmployeeArray());

        // add employee2
        Employee employee2 = new Employee("1232222", "1", "13232", 2, 23);
        employeeBook.addEmployee(employee2);
        System.out.println(employeeBook.getEmployeeArray());

        // add employee3
        Employee employee3 = new Employee("12", "1232", "111", 2, 501);
        employeeBook.addEmployee(employee3);
        System.out.println(employeeBook.getEmployeeArray());

        // add employee2
        employeeBook.addEmployee(employee2);
        System.out.println(employeeBook.getEmployeeArray());

        // delete employees with id = 2
        employeeBook.deleteEmployeeById(2);
        System.out.println(employeeBook.getEmployeeArray());

        // add employee2
        employeeBook.addEmployee(employee2);
        System.out.println(employeeBook.getEmployeeArray());

        // min=max salary by department
        System.out.println(employeeBook.findMinSalaryByDepartment(2).toString());
        System.out.println(employeeBook.findMaxSalaryByDepartment(2).toString());
    }

}
