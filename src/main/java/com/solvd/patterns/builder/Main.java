package com.solvd.patterns.builder;

import com.solvd.patterns.builder.model.Education;
import com.solvd.patterns.builder.model.User;

import java.time.LocalDate;
import java.util.List;

/**
 * Мы можем использовать билдер в случаях:
 * 1) создать сложный запрос для API
 * 2) создать сложный объект для последующей передачи его тесту
 */
public class Main {

    public static void main(String[] args) {
        List<Education> educations = List.of(
                new Education("BNTU", LocalDate.of(2019, 9, 1))
        );
        User user = User.builder()
                .setFirstName("Kamarouski")
                .setLastName("Andrei")
                .setPatronymic("Sergeevich")
                .setDob(LocalDate.of(1998, 4, 27))
                .setEducations(educations)
                .build();
    }
}
