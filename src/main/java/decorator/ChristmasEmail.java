package decorator;

public class ChristmasEmail implements Emailable {

    private static final String CHRISTMAS_CONGRATULATION = "\nHappy Christmas!";
    private Emailable email;

    public ChristmasEmail(Emailable email) {
        this.email = email;
    }

    @Override
    public String getEmailAsText() {
        return email.getEmailAsText() + CHRISTMAS_CONGRATULATION;
    }
}
