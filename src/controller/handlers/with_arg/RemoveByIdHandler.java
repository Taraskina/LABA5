package controller.handlers.with_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.with_arg.RemoveByIdCommand;

import static controller.commands.CommandManager.bsCmd;

public class RemoveByIdHandler implements Handler {
    public static void handle(Command command) {
        RemoveByIdCommand removeByIdCommand = (RemoveByIdCommand) command;
        bsCmd.removeId(removeByIdCommand.getArg());
    }
}
