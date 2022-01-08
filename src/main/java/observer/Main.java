package observer;

import java.util.List;

/**
 * Мы можем использовать паттерн наблюдатель, чтобы отслеживать  состояние объекта и при изменении его
 * сотояния уедомлять всех об этом изменении, к примеру если нам нужно, чтобы нам (тем, кто находится в списке)
 * приходило уведомление при успешном (или нет) прохождении тестов, при этом формировалось уникальное сообщение для каждого
 * сотрудника
 */
public class Main {

    public static void main(String[] args) {
        Solvd solvd = new Solvd();
        List<Employee> employees = List.of(
                new Employee("Kamarouski", solvd),
                new Employee("Stoliar", solvd),
                new Employee("Sotnikov", solvd)
        );
        solvd.setInformation("Happy Christmas!!!");
        solvd.notifyObservers();
    }
}
