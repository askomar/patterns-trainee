package builder.model;

import java.time.LocalDate;

public class Experience {

    private Company company;
    private String position;
    private LocalDate fromDate;
    private LocalDate toDate;

    public Experience(Company company, String position, LocalDate from) {
        this.company = company;
        this.position = position;
        this.fromDate = from;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }
}
