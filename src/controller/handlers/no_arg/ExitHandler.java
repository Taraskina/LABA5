package controller.handlers.no_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.no_arg.ExitCommand;

import static controller.commands.CommandManager.bsCmd;

public class ExitHandler implements Handler {
    public static void handle(Command command) {
        ExitCommand exitCommand = (ExitCommand) command;
        bsCmd.exit();
    }
}
