package controller.handlers.no_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.no_arg.ClearCommand;

import static controller.commands.CommandManager.bsCmd;

public class ClearHandler implements Handler {
    public static void handle(Command command) {
       ClearCommand clearCommand = (ClearCommand) command;
        bsCmd.clear();
    }

}
