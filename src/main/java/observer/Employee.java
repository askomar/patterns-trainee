package observer;

public class Employee implements Observer {

    private String firstName;

    public Employee(String firstName, Observable o) {
        this.firstName = firstName;
        o.registerObserver(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void update(Observable o, String information) {
        System.out.printf("%s from %s was informated that %s%n", firstName, o, information);
    }
}
