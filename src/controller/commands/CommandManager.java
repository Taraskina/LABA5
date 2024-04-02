package controller.commands;

import controller.MyFunc;
import controller.commands.no_arg.*;
import controller.commands.with_arg.*;
import controller.handlers.no_arg.*;
import controller.handlers.with_arg.*;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class CommandManager {
    public static BaseCmd bsCmd;
    public Map<Class, MyFunc> map = new HashMap<>();

    public CommandManager(Command command) {
        bsCmd = new BaseCmd();

        map.put(AddCommand.class, AddHandler::handle);
        map.put(AddIfMaxCommand.class, AddIfMaxHandler::handle);
        map.put(UpdateCommand.class, UpdateIdHandler::handle);
        map.put(CountCommand.class, CountHandler::handle);
        map.put(ExecuteScriptCommand.class, ExecuteScriptHandler::handle);
        map.put(RemoveByIdCommand.class, RemoveByIdHandler::handle);
        map.put(RemoveGreaterCommand.class, RemoveGreaterHandler::handle);

        map.put(ClearCommand.class, ClearHandler::handle);
        map.put(ExitCommand.class, ExitHandler::handle);
        map.put(HelpCommand.class, HelpHandler::handle);
        map.put(HistoryCommand.class, HistoryHandler::handle);
        map.put(InfoCommand.class, InfoHandler::handle);
        map.put(PrintAscendingCommand.class, PrintAscendingHandler::handle);
        map.put(PrintFieldCommand.class, PrintFieldHandler::handle);
        map.put(SaveCommand.class, SaveHandler::handle);
        map.put(ShowCommand.class, ShowHandler::handle);

        //map.get(command.getClass()).run();
        System.out.println(command.getClass());
    }

    public boolean isCommand(String com){
        if(map.containsKey(com)){
            return true;
        }
        else{
            System.out.println("CommandManager: Бро, такой команды у нас нет. Попробуй еще раз");
            return false;
        }
    }
}
