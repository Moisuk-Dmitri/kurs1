public class EmployeeBook {
    private static Employee[] employeeArray = new Employee[3];

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] == null) {
                employeeArray[i] = employee;
                return true;
            }
        }

        return false;
    }

    public Employee getEmployeeById(int id) {
        return employeeArray[id - 1];
    }

    public void deleteEmployeeById(int id) {
        employeeArray[id - 1] = null;
    }

    public String getEmployeeArray() {
        String str = "";
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                str += employeeArray[i].toString() + "\n";
            }
        }

        return str;
    }

    public int sumSalaries() {
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                sum += employeeArray[i].getSalary();
            }
        }

        return sum;
    }

    public Employee findMinSalary() {
        int min = employeeArray[0].getSalary();
        Employee employee = employeeArray[0];
        for (int i = 1; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && min > employeeArray[i].getSalary()) {
                min = employeeArray[i].getSalary();
                employee = employeeArray[i];
            }
        }

        return employee;
    }

    public Employee findMaxSalary() {
        int max = employeeArray[0].getSalary();
        Employee employee = employeeArray[0];
        for (int i = 1; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && max < employeeArray[i].getSalary()) {
                max = employeeArray[i].getSalary();
                employee = employeeArray[i];
            }
        }

        return employee;
    }

    public double getAverageSalary() {
        int employeeNumber = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                employeeNumber++;
            }
        }

        return (double) sumSalaries() / employeeNumber;
    }

    public String getAllFullNames() {
        String str = "";
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                str += employeeArray[i].getFirstName() + " " + employeeArray[i].getLastName() + " " + employeeArray[i].getMiddleName() + "\n";
            }
        }

        return str;
    }

    public static void indexSalary(int percent) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null) {
                employeeArray[i].setSalary(employeeArray[i].getSalary() + employeeArray[i].getSalary() * percent / 100);
            }
        }
    }

    public Employee findMinSalaryByDepartment(int departmentNumber) {
        int i = 0;
        int min = 0;
        Employee employee = null;
        do {
            if (employeeArray[i] != null && employeeArray[i].getDepartmentNumber() == departmentNumber) {
                min = employeeArray[i].getSalary();
                employee = employeeArray[i];
                break;
            }
            i++;
        } while (i < employeeArray.length);
        for (; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && min > employeeArray[i].getSalary()) {
                min = employeeArray[i].getSalary();
                employee = employeeArray[i];
            }
        }

        return employee;
    }

    public Employee findMaxSalaryByDepartment(int departmentNumber) {
        int i = 0;
        int max = 0;
        Employee employee = null;
        do {
            if (employeeArray[i] != null && employeeArray[i].getDepartmentNumber() == departmentNumber) {
                max = employeeArray[i].getSalary();
                employee = employeeArray[i];
                break;
            }
            i++;
        } while (i < employeeArray.length);
        for (; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && max < employeeArray[i].getSalary()) {
                max = employeeArray[i].getSalary();
                employee = employeeArray[i];
            }
        }

        return employee;
    }

    public int sumSalariesByDepartment(int departmentNumber) {
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getDepartmentNumber() == departmentNumber) {
                sum += employeeArray[i].getSalary();
            }
        }

        return sum;
    }

    public double getAverageSalaryByDepartment(int departmentNumber) {
        int sum = 0;
        int employeeCounter = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getDepartmentNumber() == departmentNumber) {
                sum += employeeArray[i].getSalary();
                employeeCounter++;
            }
        }

        return (double) sum / employeeCounter;
    }

    public void indexSalaryByDepartment(int percent, int departmentNumber) {
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getDepartmentNumber() == departmentNumber) {
                employeeArray[i].setSalary(employeeArray[i].getSalary() + employeeArray[i].getSalary() * percent / 100);
            }
        }
    }

    public String getEmployeeArrayByDepartment(int departmentNumber) {
        String str = "";
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getDepartmentNumber() == departmentNumber) {
                str += "Employee{" +
                        "firstName='" + employeeArray[i].getFirstName() + '\'' +
                        ", lastName='" + employeeArray[i].getLastName() + '\'' +
                        ", middleName='" + employeeArray[i].getMiddleName() + '\'' +
                        ", salary=" + employeeArray[i].getSalary() +
                        ", id=" + employeeArray[i].getId() +
                        "}\n";
            }
        }

        return str;
    }

    public String getEmployeesBelowSalary(int salary) {
        String str = "";
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i] != null && employeeArray[i].getSalary() < salary) {
                str += "Employee{" +
                        "firstName='" + employeeArray[i].getFirstName() + '\'' +
                        ", lastName='" + employeeArray[i].getLastName() + '\'' +
                        ", middleName='" + employeeArray[i].getMiddleName() + '\'' +
                        ", salary=" + employeeArray[i].getSalary() +
                        ", id=" + employeeArray[i].getId() +
                        "}\n";
            }
        }

        return str;
    }

    public String getEmployeesAboveSalary(int salary) {
        String str = "";
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getSalary() >= salary) {
                str += "Employee{" +
                        "firstName='" + employeeArray[i].getFirstName() + '\'' +
                        ", lastName='" + employeeArray[i].getLastName() + '\'' +
                        ", middleName='" + employeeArray[i].getMiddleName() + '\'' +
                        ", salary=" + employeeArray[i].getSalary() +
                        ", id=" + employeeArray[i].getId() +
                        "}\n";
            }
        }

        return str;
    }
}
