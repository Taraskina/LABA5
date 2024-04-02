package controller.handlers.no_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.no_arg.PrintFieldCommand;

import static controller.commands.CommandManager.bsCmd;

public class PrintFieldHandler implements Handler {
    public static void handle(Command command) {
        PrintFieldCommand printFieldCommand = (PrintFieldCommand) command;
        bsCmd.printField();
    }
}
