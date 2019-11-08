package com.ak4.dp.templatemethod;

public abstract class ComputerBuilderTemplate {
	
	public final Computer buildComputer() {
		Computer c = new Computer();
		c.setId("Computer ID");
		c.setName("Computer Lenovo");
		c.setCabinet("Cabinet");
		c.setPowerSupply("SMPS");
		c.setWires("Coated Wires");
		c.setHardDisk("Segeate Hard Disk");
		choseRam(c);
		choseProcessor(c);
		choseMotherBoard(c);
		return c;
	}
	
	protected abstract void choseMotherBoard(Computer c);

	protected abstract void choseProcessor(Computer c);

	public abstract void choseRam(Computer c);

}
