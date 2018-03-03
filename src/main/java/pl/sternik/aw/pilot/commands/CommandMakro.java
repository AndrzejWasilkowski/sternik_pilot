package pl.sternik.aw.pilot.commands;

public class CommandMakro implements Command {
    private final Command[] command;

    public CommandMakro(Command[] command) {
        this.command = command;
    }

    @Override
    public void execute() {
        for(int i=0;i<command.length;i++){
            command[i].execute();
        }
    }

    @Override
    public String getOpis() {
        StringBuilder string = new StringBuilder("Makro: ");
        for(int i=0;i<command.length;i++){
         string.append(command[i].getOpis() + ", ");
        }
        return string.toString();
    }
}
