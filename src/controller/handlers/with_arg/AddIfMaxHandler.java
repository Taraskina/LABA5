package controller.handlers.with_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.with_arg.AddIfMaxCommand;

import static controller.commands.CommandManager.bsCmd;

public class AddIfMaxHandler implements Handler {
    public static void handle(Command command) {
            AddIfMaxCommand addIfMaxCommand = (AddIfMaxCommand) command;
        bsCmd.addMax(addIfMaxCommand.getArg());
    }
}
