package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Herbivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Deer extends Animal implements Terrestrial, Herbivorus {

  public Deer() {
    super();
  }

  public Deer(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
  
  @Override
	public void move() {
	  System.out.println("Deer "+ this.getName() +" marche a 4 pattes");
	}
  
  @Override
	public void eat(Eatable eatable) {
		if (eatable instanceof Vegetable) {
			System.out.println("Deer "+ this.getName() +" mange des Vegetals");
		}
	}
}
