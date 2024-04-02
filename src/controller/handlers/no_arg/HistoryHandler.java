package controller.handlers.no_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.no_arg.HelpCommand;

import static controller.commands.CommandManager.bsCmd;

public class HistoryHandler implements Handler {
    public static void handle(Command command) {
        HelpCommand helpCommand = (HelpCommand) command;
        bsCmd.history();
    }
}
