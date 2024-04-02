package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputService {
    //Boolean key = false;

    public void start() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //CommandManager inv = new CommandManager(Command cmd);
            //inv.hz(new AddCommand());
            //Map<Class, MyFunc> map = inv.getMap();

            while (true) {
                String str = reader.readLine();
                String[] m = str.split("\\s");
                //System.out.println(m);
               /* for (int i = 0; i < m.length; i++) {
                    key = (map.containsKey(m[i]));
                    if (key == true) {
                       // map.get(m[i]).apply();
                    }
                    //System.out.println(key);
                }*/
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
инпут только отдает нам массив и строку,
далее мы передаем их в клиентный менеджер,
который перерабатывает строку в command
после мы сравниваем получившиеся значение с имеющимся классом (есть пример в мэпхуите)
а там живем, потому что получаем тру и отсылаем это говно в аутпут,
который с помощью ифа либо запускает код, либо выкидывает ошибку

еще нужен dto слой и dao слой
 */
