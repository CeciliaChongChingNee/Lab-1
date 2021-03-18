/**
 * Create a package for Exercise 7 named exercise7.controller
 */
package exercise7.controller;

import exercise7.model.Human;

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
