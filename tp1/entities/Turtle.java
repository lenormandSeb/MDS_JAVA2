package com.tactfactory.javaniveau2.tps.tp1.entities;

import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Eatable;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Omnivorus;
import com.tactfactory.javaniveau2.tps.tp1.functionnalities.Tetrapoda;

public class Turtle extends Animal implements Tetrapoda, Omnivorus {

  public Turtle() {
    super();
  }

  public Turtle(Long id, String name, Float weight, Float height) {
    super(id, name, weight, height);
  }
  
  @Override
	public void move() {
	  System.out.println();
	  System.out.println("Turtle : "+ this.getName() +" nage");
	}
  
  @Override
	public void eat(Eatable eatable) {
		if (eatable instanceof Vegetable) {
			System.out.println("Turtle "+ this.getName() +" mange des vegetals");
		}
	}
}
