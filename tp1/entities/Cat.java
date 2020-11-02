package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Cat extends Animal implements Terrestrial, Omnivorus {

  public Cat() {
    super();
  }

  public Cat(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
  
  @Override
	public void move() {
	  System.out.println("Cat "+ this.getName() +"marche a 4 pattes");
	}
  
  @Override
	public void eat(Eatable eatable) {
		if (eatable instanceof Vegetable) {
			System.out.println("Cat "+ this.getName() +" mange des Animals");
		}
	}
}
