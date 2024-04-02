package entity.storage;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
@Setter
@Getter
public class Location {
    private Double x; //Поле не может быть null
    private Integer y; //Поле не может быть null
    private Double z; //Поле не может быть null
    private String name; //Строка не может быть пустой, Поле может быть null

    public Location(Location location) {
        if (Objects.nonNull(location)) {
            this.name = location.name;
            this.x = location.x;
            this.y = location.y;
            this.z = location.z;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(x, location.x) && Objects.equals(y, location.y) && Objects.equals(z, location.z) && Objects.equals(name, location.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, name);
    }
}
