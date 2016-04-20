package com.palvair.designpatterns.structuring;

import com.palvair.designpatterns.Car;
import com.palvair.designpatterns.Vehicle;

public class CarVehicleAdapter implements Vehicle {

	private final Car car;

	public CarVehicleAdapter(final Car car) {
		this.car = car;
	}

	public long nbWheels() {
		return this.car.getNbWheels();
	}

}
