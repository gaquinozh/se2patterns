package command;

import command.interfaces.Command;

public class Test {
	public static void main(String... args) {
		// Initialize Switch System
		Light lamp = new Light(false);
		Command switchDown = new FlipDownCommand(lamp);
		Command switchUp = new FlipUpCommand(lamp);
		Switch lampSwitch = new Switch();

		// Normal Case
		lampSwitch.storeAndExecute(switchUp);
		lampSwitch.storeAndExecute(switchDown);

		// Two time turn Down (Redo)
		lampSwitch.executeFromHistory(1);

		// Then do it right! (Redo)
		lampSwitch.executeFromHistory(0);

		// Then do it false again! (Regular)
		lampSwitch.storeAndExecute(switchUp);

		// Turn off the lamp before leaving application ;)
		lampSwitch.storeAndExecute(switchDown);
	}
}
