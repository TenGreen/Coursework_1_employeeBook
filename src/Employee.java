import java.lang.invoke.StringConcatFactory;

public class Employee {
    private String lastName;
    private String firstName;
    private String patronymic;
    private int department;
    private double salary;
    private static int id = 0;

    public Employee(String lastName, String firstName,
                    String patronymic,
                    int department, double salary) {
        id++;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String ConcatFactory) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
