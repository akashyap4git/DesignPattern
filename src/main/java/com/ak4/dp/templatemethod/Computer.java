package com.ak4.dp.templatemethod;

public class Computer {
	
	private String id;
	private String name;
	private String cabinet;
	private String powerSupply;
	private String wires;
	private String hardDisk;
	private String ram;
	private String processor;
	private String motherBoard;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
		System.out.println("Added " + id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Added " + name);
	}
	public String getCabinet() {
		return cabinet;
	}
	public void setCabinet(String cabinet) {
		this.cabinet = cabinet;
		System.out.println("Added " + cabinet);
	}
	public String getPowerSupply() {
		return powerSupply;
	}
	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
		System.out.println("Added " + powerSupply);
	}
	public String getWires() {
		return wires;
	}
	public void setWires(String wires) {
		this.wires = wires;
		System.out.println("Added " + wires);
	}
	public String getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
		System.out.println("Added " + hardDisk);
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
		System.out.println("Added " + ram);
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
		System.out.println("Added " + processor);
	}
	public String getMotherBoard() {
		return motherBoard;
	}
	public void setMotherBoard(String motherBoard) {
		this.motherBoard = motherBoard;
		System.out.println("Added " + motherBoard);
	}
}
