package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Dog extends Animal implements Terrestrial, Omnivorus {

  public Dog() {
    super();
  }

  public Dog(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
  
  @Override
	public void move() {
	  System.out.println("Chien "+ this.getName() +" marche a 4 pattes");
	}
  
  @Override
	public void eat(Eatable eatable) {
		if (eatable instanceof Vegetable) {
			System.out.println("Chien "+ this.getName() +" mange des Animals");
		}
	}
}
