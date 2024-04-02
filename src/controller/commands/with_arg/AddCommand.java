package controller.commands.with_arg;

import lombok.Getter;
import controller.commands.Command;

import java.util.Objects;

@Getter
public class AddCommand implements Command {
    private Objects arg;


}

