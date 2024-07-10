package org.prince.in;

public class Heart {

	private String nameOfAnimal;
	private int noOfAnimal;

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
		System.out.println("Heart.setNameOfAnimal()");
	}

	public int getNoOfAnimal() {
		return noOfAnimal;
	}

	public void setNoOfAnimal(int noOfAnimal) {
		this.noOfAnimal = noOfAnimal;
		System.out.println("Heart.setNoOfAnimal()");
	}

	public void pump() {
		System.out.println("You are alive...");
	}
}
