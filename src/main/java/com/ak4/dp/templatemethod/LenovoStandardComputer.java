package com.ak4.dp.templatemethod;

public class LenovoStandardComputer extends ComputerBuilderTemplate {

	@Override
	protected void choseMotherBoard(Computer c) {
		c.setMotherBoard("Standard Intel MotherBoard");
	}

	@Override
	protected void choseProcessor(Computer c) {
		c.setProcessor("Intel Core i3 Processor");
	}

	@Override
	public void choseRam(Computer c) {
		c.setRam("4FB RAM");
	}
}
