package client;

import controller.InputService;
import excep.NeTaCommandException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, NeTaCommandException {
        InputService inputService = new InputService();
        inputService.start();
    }

   /* public static boolean checkCommandName(String input) {
        Pattern pattern = Pattern.compile("^[a-z+_.-]+");
        Matcher matcher = pattern.matcher(input);
        do {
            input = matcher.replaceAll("");
            matcher = pattern.matcher(input);
        } while (matcher.find());
        return input.matches("^[a-z+_.-]+");
    }*/
}
/*
чтение консоли через reader/consoleService
чтение с файла через InputStreamReader + HashMap
запись в файл через BufferedWriter
коллекция HashSet + свой HashSet
 */


    /*void obrab() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = reader.readLine();
            String[] m = str.split("\\s+");


            String regex = "^[a-z+_.-]+";
            Pattern pattern = Pattern.compile(regex);

            for (String cmd : m) {
                Matcher matcher = pattern.matcher(cmd);
                System.out.println(cmd + " : " + matcher.matches());

            }


        }
    }*/