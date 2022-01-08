package builder.model;

import java.time.LocalDate;
import java.util.List;

public class User {

    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate dob;
    private List<Experience> experiences;
    private List<Education> educations;
    private List<Skill> skills;
    private List<Contact> contacts;

    private User() {
    }

    public static Builder builder() {
        return new User().new Builder();
    }

    public class Builder {
        private Builder() {
        }

        public Builder setFirstName(String firstName) {
            User.this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            User.this.lastName = lastName;
            return this;
        }


        public Builder setPatronymic(String patronymic) {
            User.this.patronymic = patronymic;
            return this;
        }


        public Builder setDob(LocalDate dob) {
            User.this.dob = dob;
            return this;
        }


        public Builder setExperiences(List<Experience> experiences) {
            User.this.experiences = experiences;
            return this;
        }


        public Builder setEducations(List<Education> educations) {
            User.this.educations = educations;
            return this;
        }


        public Builder setSkills(List<Skill> skills) {
            User.this.skills = skills;
            return this;
        }


        public Builder setContacts(List<Contact> contacts) {
            User.this.contacts = contacts;
            return this;
        }

        public User build() {
            return User.this;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
