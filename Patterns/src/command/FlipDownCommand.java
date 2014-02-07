package command;

import command.interfaces.Command;

public class FlipDownCommand implements Command {

	private Light theLight;
	
	public FlipDownCommand(Light l) {
		this.theLight = l;
	}
	
	@Override
	public void execute() {
		this.theLight.turnOff();
	}

}
