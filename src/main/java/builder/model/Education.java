package builder.model;

import java.time.LocalDate;

public class Education {

    private String university;
    private LocalDate fromDate;
    private LocalDate toDate;

    public Education(String university, LocalDate from) {
        this.university = university;
        this.fromDate = from;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
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
