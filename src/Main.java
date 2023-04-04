import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeBook employeeBook = new EmployeeBook();
        int i = 0;
        int j = 0;
        employeeBook.printStartMenu();


        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1. Получить список всех сотрудников " +
                    "со всеми имеющимися по ним данными");
            System.out.println("2. Посчитать сумму затрат на зарплаты в месяц.");
            System.out.println("3. Найти сотрудника с минимальной зарплатой.");
            System.out.println("4. Найти сотрудника с максимальной зарплатой.");
            System.out.println("5. Подсчитать среднее значение зарплат.");
            System.out.println("6. Получить Ф. И. О. всех сотрудников (вывести в консоль).");
            Scanner
        }
/*1. Получить список всех сотрудников со всеми имеющимися
        * по ним данными (вывести в консоль значения всех полей (toString)).
        2. Посчитать сумму затрат на зарплаты в месяц.
        3. Найти сотрудника с минимальной зарплатой.
        4. Найти сотрудника с максимальной зарплатой.
        5. Подсчитать среднее значение зарплат (можно использовать
        * для этого метод из пункта b).
        6. Получить Ф. И. О. всех сотрудников (вывести в консоль).*/
    }
}