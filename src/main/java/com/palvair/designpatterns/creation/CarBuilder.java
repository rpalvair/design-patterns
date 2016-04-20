package com.palvair.designpatterns.creation;

import com.palvair.designpatterns.Car;

public class CarBuilder {

	private final Car car;

	public CarBuilder() {
		this.car = new Car();
	}

	public CarBuilder addColour(final String colour) {
		this.car.setColour(colour);
		return this;
	}

	public Car build() {
		return this.car;
	}
}
