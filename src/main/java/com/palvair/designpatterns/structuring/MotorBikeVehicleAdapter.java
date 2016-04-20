package com.palvair.designpatterns.structuring;

import com.palvair.designpatterns.MotorBike;
import com.palvair.designpatterns.Vehicle;

public class MotorBikeVehicleAdapter implements Vehicle {

	private final MotorBike motorBike;

	public MotorBikeVehicleAdapter(final MotorBike motorBike) {
		this.motorBike = motorBike;
	}

	public long nbWheels() {
		return this.motorBike.getNbWheels();
	}

}
