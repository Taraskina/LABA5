package controller.handlers.with_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.with_arg.RemoveGreaterCommand;

import static controller.commands.CommandManager.bsCmd;

public class RemoveGreaterHandler implements Handler {
    public static void handle(Command command) {
        RemoveGreaterCommand removeGreaterCommand = (RemoveGreaterCommand) command;
        bsCmd.removeGreater(removeGreaterCommand.getArg());
    }
    
}
