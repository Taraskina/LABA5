package controller.handlers.no_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.no_arg.InfoCommand;

import static controller.commands.CommandManager.bsCmd;

public class InfoHandler implements Handler {
    public static void handle(Command command) {
        InfoCommand infoCommand = (InfoCommand) command;
        bsCmd.info();
    }
}
