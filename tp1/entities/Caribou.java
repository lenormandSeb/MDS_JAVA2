package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Caribou extends Animal implements Terrestrial, Herbivorus {

  public Caribou() {
    super();
  }

  public Caribou(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
  
  @Override
	public void move() {
	  System.out.println("Caribou "+ this.getName() +" marche a 4 pattes");
	}
  
  @Override
	public void eat(Eatable eatable) {
		if (eatable instanceof Vegetable) {
			System.out.println("Caribou "+ this.getName() +" mange des vegetaux");
		}
	}
}
