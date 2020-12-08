package com.cg;

class SpeedException extends RuntimeException {

	public SpeedException(String message) {
		super(message);
	}
}

class Vehicle {
	int speed;

	public Vehicle(int speed) {
		this.speed = speed;
	}

	public String checkSpeed() throws SpeedException {

		String mesage = "";

		if (speed > 100) {
			throw new SpeedException("Speed should not extend " + speed + " Kms/Hour");
		} else {
			mesage = "vehicle is in normal speed";
		}
		return mesage;
	}
}

public class ExceptionDemo {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle(1000);
		try {
			String result = vehicle.checkSpeed();
			System.out.println(result);
		} catch (SpeedException e) {
			System.out.println(e.getMessage());
		}
	}
}
