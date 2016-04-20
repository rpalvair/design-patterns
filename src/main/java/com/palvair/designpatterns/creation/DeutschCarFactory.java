package com.palvair.designpatterns.creation;

import com.palvair.designpatterns.Car;
import com.palvair.designpatterns.Volkswagen;

public class DeutschCarFactory implements CarAbstractFactory {

	public Car createCar() {
		return new Volkswagen();
	}

}
