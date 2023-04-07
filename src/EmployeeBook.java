import java.util.Random;
import java.util.Scanner;

public class EmployeeBook {
    Scanner scanner = new Scanner(System.in);
    public Employee Employee[] = new Employee[10];

    public void printingDataOfOneEmployee(int i) {
        if (Employee[i] != null) {
            System.out.println("фамилия " + Employee[i].getLastName() + " имя " + Employee[i].getFirstName()
                    + " отчество " + Employee[i].getPatronymic() + " отдел " + Employee[i].getDepartment()
                    + " зарплата " + Employee[i].getSalary() + " ID " + Employee[i].getId());
        }

    }

    public Employee createNewEmployee() {
        System.out.println("фамилия ");
        String newLastName = scanner.nextLine();
        System.out.println("имя ");
        String newFirstName = scanner.nextLine();
        System.out.println("отчество ");
        String newPatronymic = scanner.nextLine();
        System.out.println("отдел ");
        int newDepartament = scanner.nextInt();
        System.out.println("зарплата ");
        double newSalary = scanner.nextDouble();
        Employee employee = new Employee(newLastName, newFirstName,
                newPatronymic, newDepartament, newSalary);
        return employee;
    }

    public void printingDataAllEmployee() {
        for (int i = 0; i < Employee.length; i++) {

            printingDataOfOneEmployee(i);
        }
    }

    public void addNewEmployee(Employee newEmployee) {
        int i = 0;
        while (true) {
            if (Employee[i] == null) {
                Employee[i] = newEmployee;
                System.out.println("Работник добавлен под индексом " + i);
                return;
            } else {
                i++;
            }
            if (i == 10) {
                throw new RuntimeException("В массиве нет свободных мест");
            }

        }
    }

    public double getAllSalaryMont() {
        double sum = 0;
        for (int i = 0; i < Employee.length; i++) {
            if (Employee[i] == null) {
                continue;
            }
            sum = sum + Employee[i].getSalary();
        }
        return sum;
    }

    public Employee getEnployeeMinSalary() {
        double minSalary = -1;
        int employeeMinSalary = -1;
        for (int i = 0; i <= Employee.length; i++) {
            if (minSalary < Employee[i].getSalary()) {
                minSalary = Employee[i].getSalary();
                employeeMinSalary = i;
            }
        }
        return Employee[employeeMinSalary];
    }
    public Employee getEnployeeMaxSalary() {
        double maxSalary = -1;
        int employeeMaxSalary = -1;
        for (int i = 0; i <= Employee.length; i++) {
            if (Employee[i] != null) {
                if (maxSalary < Employee[i].getSalary()) {
                    maxSalary = Employee[i].getSalary();
                    employeeMaxSalary = i;
                }
            } else continue;
        }
        return Employee[employeeMaxSalary];
    }

    public double getAverageValueSalary() {
       return getAllSalaryMont()/ Employee.length;
    }

    public String jenerateWord() {
        Random random = new Random();
        String word = null;
        for (int i = 0; i < 5; i++) {
            word = word + (char)random.nextInt('а'-'я');
        }
        return word;
    }
    public Employee createNewRandomEmployee() {
        Random random = new Random();
        String newLastName = jenerateWord();
        String newFirstName = jenerateWord();
        String newPatronymic = jenerateWord();
        int newDepartament = random.nextInt(1-5);
        double newSalary = random.nextInt(50_000 - 150000);
        Employee employee = new Employee(newLastName, newFirstName,
                newPatronymic, newDepartament, newSalary);
        return employee;
    }

    public void fillListRandomPeople() {

        for (Employee employee : Employee) {
            Employee = createNewRandomEmployee();

        }
    }

    /*1. Получить список всех сотрудников со всеми имеющимися
         по ним данными (вывести в консоль значения всех полей (toString)).
      2. Посчитать сумму затрат на зарплаты в месяц.
      3. Найти сотрудника с минимальной зарплатой.
      4. Найти сотрудника с максимальной зарплатой.
      5. Подсчитать среднее значение зарплат (можно использовать
         для этого метод из пункта b).
      6. Получить Ф. И. О. всех сотрудников (вывести в консоль).*/

    /*4. Добавить несколько новых методов:
        1. Добавить нового сотрудника (создаем объект,
           заполняем поля, кладем в массив).
           Нужно найти свободную ячейку в массиве и
           добавить нового сотрудника в нее. Искать нужно
           всегда с начала, так как возможно добавление
           в ячейку удаленных ранее сотрудников.
        2. Удалить сотрудника (находим сотрудника
           по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
    5. Изменить сотрудника (получить сотрудника
           по Ф. И. О., модернизировать его запись):
        1. Изменить зарплату.
        2. Изменить отдел.
           Придумать архитектуру. Сделать или два метода,
           или один, но продумать его.
    6. Получить Ф. И. О. всех сотрудников по отделам
          (напечатать список отделов и их сотрудников).*/
}
