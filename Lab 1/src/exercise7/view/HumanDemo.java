/**
 * Create a package for Exercise 7 named exercise7.view
 */
package exercise7.view;

import exercise7.controller.HumanController;
import exercise7.model.Human;

/**
 * Create a new class named HumanDemo
 * 
 * @author ching
 *
 */
public class HumanDemo {

	/**
	 * Main entry point of program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Create human object
		Human human = new Human();

		// Set human weight
		human.setWeight(67.1);

		// Display human weight on Earth
		System.out.print("Human weight on Earth: ");
		System.out.format("%.2f", new HumanController().getHumanWeightOnEarth(human));
		System.out.println(" kg");

		// Display human weight on Mars
		System.out.print("Human weight on Mars: ");
		System.out.format("%.2f", new HumanController().getHumanWeightOnMars(human));
		System.out.println(" kg");

	}

}
