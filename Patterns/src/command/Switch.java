package command;

import java.util.ArrayList;
import java.util.List;

import command.interfaces.Command;


public class Switch {
	private List<Command> history = new ArrayList<Command>();
	
	public void storeAndExecute(Command cmd) {
		this.history.add(cmd);
		cmd.execute();
	}
	
	public void executeFromHistory(int i) {
		this.history.get(i).execute();
	}
}
