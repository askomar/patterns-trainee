package com.solvd.patterns.decorator;

/**
 * Паттерн декоратор можно использовать:
 * когда во время выполнения приложения нам нужно динамически менять обертываемый объект, тем самым многократно
 * обертывать объект слоями (валидации, модификации полей и т.д.)
 */
public class Main {

    public static void main(String[] args) {
        User from = new User("Kamarouski", "Andrei");
        User to = new User("Gorelikov", "Mikhail");
        String header = "Less than 1 week to enroll! Advance your English proficiency";
        String body = "Skip the stress of TOEFL and IELTS exams. Get ready to achieve graduate-level academic success and earn a certificate of English proficiency at the C1 CEFR level as you advance your writing, research, presentation, and critical thinking skills with Arizona State University—the #1 public university chosen by international students. This program serves as an online alternative to standardized testing for international students. \n" +
                "\n" +
                "Remember, enrolling is easy and takes less than five minutes. Plus, with flexible payment options you can set up an installment plan or even save 5%!";
        String footer = "All rights reserved";
        Emailable email = new Email(header, body, footer, from, to);
        ChristmasEmail christmasEmail = new ChristmasEmail(email);
        String christmasMessage = christmasEmail.getEmailAsText();
        System.out.println(christmasMessage);
    }
}
