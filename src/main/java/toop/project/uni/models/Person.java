package toop.project.uni.models;

//Базовый класс для людей

import java.util.Date;

public class Person {
    public String name;
    public String surname;
    public String patronymic;
    private Date birthDate;

    public Person(String name, String surname, String patronymic, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic;
    }
}