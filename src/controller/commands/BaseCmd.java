package controller.commands;

import java.util.Objects;

/*Receiver class*/
public class BaseCmd {

    public BaseCmd() {
    }

    public void add(Objects arg) {
        System.out.println("add случился");

    }

    public void addMax(Objects arg) {
        System.out.println("addMax случился");
    }

    public void clear() {
        System.out.println("clear случился");
    }

    public void count(Objects arg) {
        System.out.println("count случился");
    }

    public void executeSpr(Objects arg) {
        System.out.println("executeSpr случился");
    }

    public void exit(){
        System.out.println("exit случился");
    }

    public void help() {
        System.out.println("Доступные команды:\n help\n info\n show\n add {element}\n update id {element} \n remote_by_id id\n clear\n save\n execute_script file_name\n exit\n add_if_max {element}\n remove_greater {element}\n history\n "+
                "count_greater_than_personal_qualities_maximum personalQualitiesMaximum\n print_ascending\n print_field_descending_tuned_in_works");
    }

    public void history() {
        System.out.println("history случился");
    }

    public void info() {
        System.out.println("info случился");
    }

    public void printAsc() {
        System.out.println("printAsc случился");
    }

    public void printField() {
        System.out.println("printField случился");
    }

    public void removeId(Objects arg) {
        System.out.println("removeId случился");
    }

    public void removeGreater(Objects arg) {
        System.out.println("removeGreater случился");
    }

    public void save() {
        System.out.println("save случился");
    }

    public void show() {
        System.out.println("show случился");
    }

    public void update(Objects arg) {
        System.out.println("update случился");
    }

}
