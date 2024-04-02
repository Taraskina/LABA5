package service;

import entity.storage.LabWork;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

public class CollectionManager {

    //Тип коллекции
    private final Object type;

    //Дата инициализации
    private final LocalDateTime initializationDate;

    //Количество элементов
    private final Integer countElements;

    public CollectionManager(Object type, LocalDateTime initializationDate, Integer countElements) {
        this.type = type;
        this.initializationDate = initializationDate;
        this.countElements = countElements;
    }

    public Set<LabWork> collect = new HashSet<>();

    public void add(LabWork lw) {
        collect.add(lw);
    }

    @Override
    public String toString() {
        String result = "";

        //Вывод даты в таком формате
        DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        result += String.format("Тип: %s\n", type);
        result += String.format("Дата инициализации: %s\n", initializationDate.format(data));
        result += String.format("Количество элементов: %d", countElements);

        return result;
    }
}
