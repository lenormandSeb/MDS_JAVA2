package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Carnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Terrestrial;

public class Hyena extends Animal implements Terrestrial, Carnivorus {

  public Hyena() {
    super();
  }

  public Hyena(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
  
  @Override
	public void move() {
	  System.out.println("Hyena "+ this.getName() +" marche a 4 pattes");
	}
  
  @Override
	public void eat(Eatable eatable) {
		if (eatable instanceof Vegetable) {
			System.out.println("Hyena "+ this.getName() +" mange des Animals");
		}
	}
}
