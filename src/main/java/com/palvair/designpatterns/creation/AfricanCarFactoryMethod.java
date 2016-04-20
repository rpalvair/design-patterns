package com.palvair.designpatterns.creation;

import com.palvair.designpatterns.Car;
import com.palvair.designpatterns.Ivm;

public class AfricanCarFactoryMethod extends CarFactoryMethod{

	@Override
	protected Car createCar() {
		return new Ivm();
	}

}
