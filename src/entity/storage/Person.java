package entity.storage;

import entity.enums.ColorEye;
import entity.enums.ColorHair;
import entity.enums.Country;

import java.util.Objects;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private java.time.ZonedDateTime birthday; //Поле может быть null
    private ColorEye eyeColor; //Поле может быть null
    private ColorHair hairColor; //Поле не может быть null
    private Country nationality; //Поле не может быть null
    private Location location; //Поле не может быть null

    public Person(Person person) {
        if (Objects.nonNull(person)) {
            this.birthday = person.birthday;
            this.eyeColor = person.eyeColor;
            this.hairColor = person.hairColor;
            this.location = person.location;
            this.name = person.name;
            this.nationality = person.nationality;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(birthday, person.birthday) && eyeColor == person.eyeColor && hairColor == person.hairColor && nationality == person.nationality && Objects.equals(location, person.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday, eyeColor, hairColor, nationality, location);
    }
}
