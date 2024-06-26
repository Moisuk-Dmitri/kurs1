public class Main {
    private static Employee[] employeeArray = new Employee[10];

    public static void main(String[] args) {}

    public static String getEmployeeArray() {
        String str = "";
        for (int i = 0; i < employeeArray.length; i++) {
            str += employeeArray[i].toString() + "\n";
        }

        return str;
    }

    public static int sumSalaries() {
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            sum += employeeArray[i].getSalary();
        }

        return sum;
    }

    public static int findMinSalary() {
        int min = employeeArray[0].getSalary();
        for (int i = 1; i < employeeArray.length; i++) {
            if (min > employeeArray[i].getSalary()) {
                min = employeeArray[i].getSalary();
            }
        }

        return min;
    }

    public static int findMaxSalary() {
        int max = employeeArray[0].getSalary();
        for (int i = 1; i < employeeArray.length; i++) {
            if (max < employeeArray[i].getSalary()) {
                max = employeeArray[i].getSalary();

            }
        }

        return max;
    }

    public static double getAverageSalary() {
        double aver = (double) sumSalaries() / employeeArray.length;

        return aver;
    }

    public static String getAllFullNames() {
        String str = "";
        for (int i = 0; i < employeeArray.length; i++) {
            str += employeeArray[i].getFirstName() + " " + employeeArray[i].getLastName() + " " +  employeeArray[i].getMiddleName() + "\n";
        }

        return str;
    }
}