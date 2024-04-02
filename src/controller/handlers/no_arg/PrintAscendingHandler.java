package controller.handlers.no_arg;

import controller.commands.Command;
import controller.handlers.Handler;
import controller.commands.no_arg.PrintAscendingCommand;

import static controller.commands.CommandManager.bsCmd;


public class PrintAscendingHandler implements Handler {
    public static void handle(Command command){
        PrintAscendingCommand printAscendingCommand = (PrintAscendingCommand) command;
        bsCmd.printAsc();
    }
}
