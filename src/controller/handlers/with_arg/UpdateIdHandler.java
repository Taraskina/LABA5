package controller.handlers.with_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.with_arg.UpdateCommand;

import static controller.commands.CommandManager.bsCmd;

public class UpdateIdHandler implements Handler {
    public static void handle(Command command) {
        UpdateCommand updateCommand = (UpdateCommand) command;
        bsCmd.update(updateCommand.getArg());
    }
}
