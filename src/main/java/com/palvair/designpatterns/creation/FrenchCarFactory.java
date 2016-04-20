package com.palvair.designpatterns.creation;

import com.palvair.designpatterns.Car;
import com.palvair.designpatterns.Renault;

public class FrenchCarFactory implements CarAbstractFactory {

	public Car createCar() {
		return new Renault();
	}

}
