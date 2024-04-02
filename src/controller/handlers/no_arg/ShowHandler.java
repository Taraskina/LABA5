package controller.handlers.no_arg;

import controller.commands.CommandManager;
import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.no_arg.ShowCommand;

public class ShowHandler implements Handler {
    public static void handle(Command command) {
        ShowCommand showCommand = (ShowCommand) command;
        CommandManager.bsCmd.show();
    }
}
