package decorator;

public class Email implements Emailable {

    private String header;
    private String body;
    private String footer;
    private User from;
    private User to;

    public Email(String header, String body, String footer, User from, User to) {
        this.header = header;
        this.body = body;
        this.footer = footer;
        this.from = from;
        this.to = to;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public String getEmailAsText() {
        return String.format("%s.\n%s.\n%s.", header, body, footer);
    }
}
