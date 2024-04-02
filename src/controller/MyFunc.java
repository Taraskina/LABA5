package controller;

import controller.commands.Command;

@FunctionalInterface
public interface MyFunc<T extends Command> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     */
    void apply(T t);
}
