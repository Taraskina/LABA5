package entity.storage;

import entity.enums.Difficulty;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class LabWork {
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer minimalPoint; //Поле не может быть null, Значение поля должно быть больше 0
    private Long personalQualitiesMaximum; //Поле может быть null, Значение поля должно быть больше 0
    private int tunedInWorks;
    private Difficulty difficulty; //Поле может быть null
    private Person author; //Поле может быть null

    public LabWork(LabWork labWork) {
        if (Objects.nonNull(labWork)) {
            this.id = labWork.id;
            this.name = labWork.name;
            this.minimalPoint = labWork.minimalPoint;
            this.personalQualitiesMaximum = labWork.personalQualitiesMaximum;
            this.tunedInWorks = labWork.tunedInWorks;

            this.difficulty = labWork.difficulty;

            this.creationDate = labWork.creationDate;

            this.coordinates = labWork.coordinates;
            this.author = labWork.author;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LabWork labWork = (LabWork) o;
        return tunedInWorks == labWork.tunedInWorks && Objects.equals(id, labWork.id) && Objects.equals(name, labWork.name) && Objects.equals(coordinates, labWork.coordinates) && Objects.equals(creationDate, labWork.creationDate) && Objects.equals(minimalPoint, labWork.minimalPoint) && Objects.equals(personalQualitiesMaximum, labWork.personalQualitiesMaximum) && difficulty == labWork.difficulty && Objects.equals(author, labWork.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, coordinates, creationDate, minimalPoint, personalQualitiesMaximum, tunedInWorks, difficulty, author);
    }
}
