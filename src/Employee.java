import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String middleName;
    private int departmentNumber;
    private int salary;
    private static int counter;
    private int id;

    public Employee() {
        id = ++counter;
    }

    public Employee(String firstName, String lastName, String middleName, int departmentNumber, int salary) {
        this.salary = salary;
        this.departmentNumber = departmentNumber;
        this.middleName = middleName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = ++counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        if (departmentNumber < 1 || departmentNumber > 5) {
            System.out.println("[INVALID DEPARTMENT NUMBER]");
            return;
        }
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0) {
            System.out.println("[INVALID SALARY]");
            return;
        }
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, middleName, departmentNumber, salary, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Employee other = (Employee) obj;
        return this.firstName.equals(other.firstName) &&
                this.lastName.equals(other.lastName) &&
                this.middleName.equals(other.middleName) &&
                this.departmentNumber == other.departmentNumber &&
                this.salary == other.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
