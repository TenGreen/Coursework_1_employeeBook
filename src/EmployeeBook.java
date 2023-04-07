import java.util.Random;
import java.util.Scanner;

public class EmployeeBook {
    Scanner scanner = new Scanner(System.in);
    public Employee employee[] = new Employee[10];
    private int forName = 1;

    public void printingDataOfOneEmployee(int i) {
        if (employee[i] != null) {
            System.out.println("фамилия " + employee[i].getLastName() + " имя " + employee[i].getFirstName()
                    + " отчество " + employee[i].getPatronymic() + " отдел " + employee[i].getDepartment()
                    + " зарплата " + employee[i].getSalary() + " ID " + employee[i].getId());
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
        for (int i = 0; i < employee.length; i++) {

            printingDataOfOneEmployee(i);
        }
    }

    public void addNewEmployee(Employee newEmployee) {
        int i = 0;
        while (true) {
            if (employee[i] == null) {
                employee[i] = newEmployee;
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
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            sum = sum + employee[i].getSalary();
        }
        return sum;
    }

    public Employee getEnployeeMinSalary() {
        double minSalary = -1;
        int employeeMinSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() < minSalary) {
                    minSalary = employee[i].getSalary();
                    employeeMinSalary = i;
                }
            }
        }
        return employee[employeeMinSalary];
    }
    public Employee getEnployeeMaxSalary() {
        double maxSalary = -1;
        int employeeMaxSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                if (employee[i].getSalary() > maxSalary) {
                    maxSalary = employee[i].getSalary();
                    employeeMaxSalary = i;
                }
            }
        }
        return employee[employeeMaxSalary];
    }

    public double getAverageValueSalary() {
        return getAllSalaryMont()/ employee.length;
    }

    public String jenerateWord() {
        Random random = new Random(0);
        String word = null;
        for (int i = 0; i < 5; i++) {
            System.out.println((char)random.nextInt());
            word = word + (char)random.nextInt();
        }
        return word;
    }
    public Employee createNewRandomEmployee() {
        Random rand = new Random(0);
        Employee randomEmploee = new Employee(""+jenerateWord(), ""+jenerateWord(),
                ""+jenerateWord(), rand.nextInt(6) ,
                ((double) rand.nextInt(100000)));
        return randomEmploee;
    }

    public void fillListRandomPeople() {

        for (Employee employee : employee) {
            employee = createNewRandomEmployee();
            System.out.println("список заполнен");
        }
    }

    public void printAllFIO() {
        for (Employee employee : employee) {
            if (employee != null) {
                System.out.println((employee.getLastName() + " "
                        + employee.getFirstName() + " " + employee.getPatronymic()));
            } else continue;
        }
    }

    public void fillAllListDefoult() {
        employee[0] = new Employee("Иванов", "Пётр", "Васильевич", 1, 50000);
        employee[1] = new Employee("Петров", "Василий", "Иванович", 1, 50000);
        employee[2] = new Employee("Васильев", "Иван", "Петрович", 1, 55000);
        employee[3] = new Employee("Иванов", "Василий", "Петрович", 1, 60000);
        employee[4] = new Employee("Васильев", "Пётр", "Иванович", 2, 65000);
        employee[5] = new Employee("Петров", "Иван", "Васильевич", 2, 65000);
        employee[6] = new Employee("Иванов", "Пётр", "Осипович", 2, 70000);
        employee[7] = new Employee("Петров", "Осип", "Иванович", 3, 70000);
        employee[8] = new Employee("Осипов", "Иван", "Петрович", 3, 55000);
        employee[9] = new Employee("Иванов", "Пётр", "Осипович", 3, 60000);
    }

    public void delEmployee() {
        System.out.println("введите ID сотрудника, которго нужно удалить");
        int delID = scanner.nextInt();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getId() == delID){
                employee[i] = null;
            }
        }
    }

    /*1. Получить список всех сотрудников со всеми имеющимися
         по ним данными (вывести в консоль значения всех полей (toString)).
      2. Посчитать сумму затрат на зарплаты в месяц.
      3. Найти сотрудника с минимальной зарплатой.
      4. Найти сотрудника с максимальной зарплатой.
      5. Подсчитать среднее значение зарплат (можно использовать
         для этого метод из пункта b).
      6. Получить Ф. И. О. всех сотрудников (вывести в консоль).*/

    /*4. Добавить несколько новых методов:
        1. Добавить нового сотрудника (создаем объект,
           заполняем поля, кладем в массив).
           Нужно найти свободную ячейку в массиве и
           добавить нового сотрудника в нее. Искать нужно
           всегда с начала, так как возможно добавление
           в ячейку удаленных ранее сотрудников.
        2. Удалить сотрудника (находим сотрудника
           по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
    5. Изменить сотрудника (получить сотрудника
           по Ф. И. О., модернизировать его запись):
        1. Изменить зарплату.
        2. Изменить отдел.
           Придумать архитектуру. Сделать или два метода,
           или один, но продумать его.
    6. Получить Ф. И. О. всех сотрудников по отделам
          (напечатать список отделов и их сотрудников).*/
}
