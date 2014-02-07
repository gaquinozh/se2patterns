package command;

import command.interfaces.Command;

public class FlipUpCommand implements Command {

	private Light theLight; 
	
	public FlipUpCommand(Light l) {
		this.theLight = l;
	}
	
	@Override
	public void execute() {
		this.theLight.turnOn();
	}

}
