public class EmployeeBook {
    public Employee Employee[] = new Employee[10];

    public void createNewEmployee(String newLastName,
                                  String newFirstName, String newPatronymic,
                                  int newDepartament, double newSalary) {
        Employee employee = new Employee(newLastName, newFirstName,
                newPatronymic, newDepartament, newSalary);
    }

    public void printingDataOfOneEmployee(int i) {
        System.out.println((Employee[i].getLastName() + Employee[i].getFirstName()
        + Employee[i].getPatronymic() + Employee[i].getDepartment()
        + Employee[i].getSalary() + Employee[i].getId()));
    }
    public void addNewEmployee(Employee newEmployee) {
        int i = 0;
        while (true) {
            if (Employee[i] != null) {
                Employee[i] = newEmployee;
                System.out.println("Работник добавлен под индексом" + i);
                return;
            } else {
                i++;
            }
            if (i == 10) {
                throw new RuntimeException("В массиве нет свободных мест");
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
}
