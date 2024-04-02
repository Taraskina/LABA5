package service.jsonFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJson {

    void write(String fileName){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            //нужно вызвать json
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
