import java.util.Scanner;

public class EmployeeBook {
    public Employee Empl[] = new Employee[10];


    public Employee createNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите фамилию");
        String newLastName = scanner.nextLine();
        System.out.println("Введите имя");
        String newFirstName = scanner.nextLine();
        System.out.println("Введите отчество");
        String newPatronymic = scanner.nextLine();
        System.out.println("Введите номер отдела");
        int newDepartament = scanner.nextInt();
        System.out.println("Введите размер зарплаты");
        double newSalary = scanner.nextInt();
        Employee newEmployee = new Employee(newLastName, newFirstName,
                newPatronymic, newDepartament, newSalary);
        return newEmployee;
    }

    public void printingDataAllEmployee() {
        for (int i = 0; i < Empl.length; i++) {
            if (Empl[i] != null) {
                System.out.println(Empl[i]);;
            } else {
                System.out.println(i + " Тут пока никого нет");
            }
        }
    }


    public void addNewEmployee(Employee newEmployee) {
        int i = 0;
        while (i <= 9) {
            if (Empl[i] == null) {
                System.out.println("Всё получится");
                Empl[i] = newEmployee;
                System.out.println("Работник добавлен под индексом" + i);
                return;
            } else i++;
            if (i == 9) throw new RuntimeException("В массиве нет свободных мест");
        }
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

