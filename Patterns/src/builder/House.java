package builder;

import builder.interfaces.HousePlan;

public class House implements HousePlan {

	private String basement;
	private String structure;
	private String roof;
	private String interior;

	@Override
	public void setBasement(String basement) {
		this.basement = basement;

	}

	@Override
	public void setStructure(String structure) {
		this.structure = structure;

	}

	@Override
	public void setRoof(String roof) {
		this.roof = roof;

	}

	@Override
	public void setInterior(String interiror) {
		this.interior = interiror;
	}

	@Override
	public String toString() {
		return "Basement: "+this.basement+"\nStructure: "+this.structure+"\nRoof: "+this.roof+"\nInterior: "+this.interior;
	}
}
