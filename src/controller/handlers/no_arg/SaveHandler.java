package controller.handlers.no_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.no_arg.SaveCommand;

import static controller.commands.CommandManager.bsCmd;

public class SaveHandler implements Handler {
    public static void handle(Command command) {
        SaveCommand saveCommand = (SaveCommand) command;
        bsCmd.save();
    }
}
