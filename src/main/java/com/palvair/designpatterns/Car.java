package com.palvair.designpatterns;

import lombok.Getter;
import lombok.Setter;

public class Car {

	@Getter
	@Setter
	private String colour;
	
	@Getter
	private final long nbWheels = 4;
}
