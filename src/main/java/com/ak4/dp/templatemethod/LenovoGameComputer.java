package com.ak4.dp.templatemethod;

public class LenovoGameComputer extends ComputerBuilderTemplate {

	@Override
	protected void choseMotherBoard(Computer c) {
		c.setMotherBoard("Inter Motherboard 2019");
	}

	@Override
	protected void choseProcessor(Computer c) {
		c.setProcessor("Inter Core 9i Processor");
		
	}

	@Override
	public void choseRam(Computer c) {
		c.setRam("32GB RAM");
	}
}
