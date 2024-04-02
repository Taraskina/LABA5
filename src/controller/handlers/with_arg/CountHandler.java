package controller.handlers.with_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.with_arg.CountCommand;

import static controller.commands.CommandManager.bsCmd;

public class CountHandler implements Handler {
    public static void handle(Command command) {
        CountCommand countCommand = (CountCommand) command;
        bsCmd.count(countCommand.getArg());
    }
}
