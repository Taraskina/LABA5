package controller.handlers.with_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.with_arg.AddCommand;

import static controller.commands.CommandManager.bsCmd;

public class AddHandler implements Handler {

    public static void handle(Command command) {
        AddCommand addCommand = (AddCommand) command;
        bsCmd.add(addCommand.getArg());
    }

}
