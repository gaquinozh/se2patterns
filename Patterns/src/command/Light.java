package command;

public class Light {
	private boolean state;
	
	public Light(boolean state) {
		this.state = state;
	}
	
	public void turnOff() {
		if(this.state) {
			this.state = false;
			System.out.println("Light is off");
			return;
		}
		System.out.println("Light is allready off");
		
	}
	public void turnOn() {
		if(!this.state) {
			this.state = true;
			System.out.println("Light is on");
			return;
		}
		System.out.println("Light is allready on");
	}
}
