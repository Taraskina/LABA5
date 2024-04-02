package controller.handlers.with_arg;

import controller.commands.CommandManager;
import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.with_arg.ExecuteScriptCommand;

public class ExecuteScriptHandler implements Handler {
    public static void handle(Command command) {
        ExecuteScriptCommand executeScriptCommand = (ExecuteScriptCommand) command;
        CommandManager.bsCmd.executeSpr(executeScriptCommand.getArg());
    }
}
