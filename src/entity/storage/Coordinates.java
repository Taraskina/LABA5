package entity.storage;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Coordinates {
    private float x;
    private Integer y; //Поле не может быть null

    public Coordinates(Coordinates coordinates) {
        if (Objects.nonNull(coordinates)) {
            this.x = coordinates.x;
            this.y = coordinates.y;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return Float.compare(x, that.x) == 0 && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
