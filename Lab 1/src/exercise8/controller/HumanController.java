/**
 * Create a package for Exercise 8 named exercise8.controller
 */
package exercise8.controller;

import exercise8.model.Human;

/**
 * Create a new class named HumanController
 * @author ching
 *
 */
public class HumanController {
	
	/**
	 * Function to get human weight on Earth
	 */
	public double getHumanWeightOnEarth(Human human) {
		
		return human.getWeight();
		
	}
	
	/**
	 * Function to get human weight on Mars
	 */
	public double getHumanWeightOnMars(Human human) {
		
		return human.getWeight() * 0.3783;
		
	}

}
