import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeBook employeeBook = new EmployeeBook();
        int i = 0;
        int j = 0;
        printStartMenu();

        while (true) {
            printBasicMenu();
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    employeeBook.printingDataAllEmployee();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    int i1 = 0;
                    printEditingMenu();
                    i1 = scanner.nextInt();
                    switch (i1) {
                        case 1:
                            employeeBook.createNewEmployee();
                            employeeBook.addNewEmployee();
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + i1);
                    }

                    break;
                case 8:
                    System.exit(0);
                default:
                    throw new IllegalStateException("Unexpected value: " + i);
            }
        }
        /*1. Получить список всех сотрудников со всеми имеющимися
        * по ним данными (вывести в консоль значения всех полей (toString)).
        2. Посчитать сумму затрат на зарплаты в месяц.
        3. Найти сотрудника с минимальной зарплатой.
        4. Найти сотрудника с максимальной зарплатой.
        5. Подсчитать среднее значение зарплат (можно использовать
        * для этого метод из пункта b).
        6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
        * */
    }

    public static void printStartMenu() {
        System.out.println("Программа работы с базой данных сотрудников");
    }

    public static void printBasicMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1. Получить список всех сотрудников " +
                "со всеми имеющимися по ним данными");
        System.out.println("2. Посчитать сумму затрат на зарплаты в месяц");
        System.out.println("3. Найти сотрудника с минимальной зарплатой");
        System.out.println("4. Найти сотрудника с максимальной зарплатой");
        System.out.println("5. Подсчитать среднее значение зарплат");
        System.out.println("6. Получить Ф. И. О. всех сотрудников");
        System.out.println("7. Редактировать данные");
        System.out.println("8. Выйти из программы");
    }

    public static void printEditingMenu() {
        System.out.println("Меню редактирования.");
        System.out.println("Что вы хотите сделать?");
        System.out.println("1. Добавить нового сотрудника");
        System.out.println("2. Удалить сотрудника");
        System.out.println("3. Изменить сотрудника");
        System.out.println("4. Получить Ф. И. О. всех сотрудников по отделам");
    }
}