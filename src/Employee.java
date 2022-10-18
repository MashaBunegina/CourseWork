public class Employee {
    private int salary;
    private final String fullName;
    private int department;

    private final int id;
    private static int counter = 0;

    public Employee(int salary, String fullName, int department) {
        this.salary = salary;
        this.fullName = fullName;
        this.id = counter++;
        this.department = department;
    }

    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }
    public int getId() {
        return id;
    }


    @Override
    public String toString(){
        return "Employee{"+
                " salary  " + salary + ", fullName  " + fullName + ", id = " + id + " department " + department +
                "}";
    }
}
